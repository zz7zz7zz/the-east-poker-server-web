package com.poker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.poker.user.login.ILoginService;

@Controller
@RequestMapping("/user")

public class UserController {

	@Autowired
	ILoginService mLoginServer;
	
	@RequestMapping(value="/login")
	@ResponseBody
	public String login(){
		return mLoginServer.login();
	}
	
}

//˵�� 1: Controller �� ע������@ResponseBody �򷵻����ݣ����򷵻���ҳ��ַ
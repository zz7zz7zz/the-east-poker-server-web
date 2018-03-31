package com.poker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.poker.user.service.IUserService;

@Controller
@RequestMapping("/user")

public class UserController {

	@Autowired
	IUserService mLoginServer;
	
	@RequestMapping(value="/login")
	@ResponseBody
	public String login(){
		return mLoginServer.login();
	}
	
}

//说明 1: Controller 中 注解设置@ResponseBody 则返回数据；否则返回网页地址
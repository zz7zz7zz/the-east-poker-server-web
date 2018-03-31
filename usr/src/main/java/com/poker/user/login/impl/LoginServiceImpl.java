package com.poker.user.login.impl;

import org.springframework.stereotype.Service;

import com.poker.user.login.ILoginService;

@Service
public class LoginServiceImpl implements ILoginService{

	@Override
	public String login() {
		return "{\"code\":\"200\",\"msg\":\"success\",\"data\":\"LoginServiceImpl\"}";
	}

}

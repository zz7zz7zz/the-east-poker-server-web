package com.poker.user.login.impl;

import com.poker.user.login.ILoginService;

public class LoginServiceImpl implements ILoginService{

	@Override
	public void login() {
		System.out.println("I am login from LoginServiceImpl ");
	}

}

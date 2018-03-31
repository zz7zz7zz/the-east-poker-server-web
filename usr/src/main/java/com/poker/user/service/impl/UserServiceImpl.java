package com.poker.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poker.user.dao.IUserDao;
import com.poker.user.service.IUserService;

@Service
public class UserServiceImpl implements IUserService{

	@Autowired
	IUserDao mUserDao;
	
	@Override
	public String login() {
		return "{\"code\":\"200\",\"msg\":\"success\",\"data\":\"LoginServiceImpl\"}";
	}

}

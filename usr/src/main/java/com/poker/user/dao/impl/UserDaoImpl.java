package com.poker.user.dao.impl;

import org.springframework.stereotype.Repository;

import com.poker.user.dao.IUserDao;
import com.poker.user.entity.User;

@Repository
public class UserDaoImpl implements IUserDao{

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User getUserByUuid(String uuid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserUid(long uid) {
		// TODO Auto-generated method stub
		return null;
	}

}

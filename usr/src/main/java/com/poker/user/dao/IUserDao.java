package com.poker.user.dao;

import com.poker.entity.User;

public interface IUserDao {
	
	void addUser(User user);
	
	User getUserByUuid(String uuid);
	
	User getUserUid(String uid);
	
}

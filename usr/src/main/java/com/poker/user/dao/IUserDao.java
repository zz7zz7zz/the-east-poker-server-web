package com.poker.user.dao;

import com.poker.user.entity.User;

public interface IUserDao {
	
	void addUser(User user);
	
	User getUserByUuid(String uuid);
	
	User getUserUid(long uid);
	
}

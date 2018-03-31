package com.poker.entity;

public class User {
	
	public long 	uid;//用户唯一id
	
	public String   uuid;//用户随机生成的uuid

	public String   password;//用户密码
	
	public String 	name;//用户昵称
	
	public String   portrait;//用户头像
	
	public String   regTime;//用户注册时间

	public long getUid() {
		return uid;
	}

	public void setUid(long uid) {
		this.uid = uid;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPortrait() {
		return portrait;
	}

	public void setPortrait(String portrait) {
		this.portrait = portrait;
	}

	public String getRegTime() {
		return regTime;
	}

	public void setRegTime(String regTime) {
		this.regTime = regTime;
	}
	
}

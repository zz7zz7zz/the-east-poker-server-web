package com.poker.entity;

public class User {
	
	public long 	uid;//�û�Ψһid
	
	public String   uuid;//�û�������ɵ�uuid

	public String   password;//�û�����
	
	public String 	name;//�û��ǳ�
	
	public String   portrait;//�û�ͷ��
	
	public String   regTime;//�û�ע��ʱ��

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

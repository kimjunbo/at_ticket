package com.atticket.common.jwtmanager;

import java.util.Map;

import lombok.Getter;

@Getter
public class UserInfo {

	String userId;

	String email;

	String name;

	public UserInfo(Map claims) {
		this.userId = (String)claims.get("sub");
		this.email = (String)claims.get("email");
		this.name = (String)claims.get("name");
	}
}
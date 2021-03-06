package com.zwtxsy.entity.vo;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = -3450064362986273896L;
	
	
	private Integer id;
	
	private String userName;
	
	private String accountName;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	
	
}

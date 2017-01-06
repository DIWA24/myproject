package com.backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.Generated;

@Entity
public class Employ {

	@Id@GeneratedValue
	private int employeeId;	
	private String ename;
	private String epassword;
	public int getUserId() {
		return employeeId;
	}
	public void setUserId(int userId) {
		this.employeeId = userId;
	}
	public String getUsername() {
		return ename;
	}
	public void setUsername(String username) {
		this.ename = username;
	}
	public String getPassword() {
		return epassword;
	}
	public void setPassword(String password) {
		this.epassword = password;
	}
	
}

package com.backend.dao;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;

import com.backend.model.Users;

@ComponentScan("com")
@Repository
public interface UsersDao {
	
public void registerUser(Users user);
}

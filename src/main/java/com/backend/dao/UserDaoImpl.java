package com.backend.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.backend.model.Users;

@Repository("userDaoImpl")
@Transactional
public class UserDaoImpl implements UsersDao {
	@Autowired
	private SessionFactory sessionFactory;
	public void registerUser(Users user) {
		Session session=sessionFactory.getCurrentSession();
		session.save(user);
		System.out.println("user saved");
		
	}

}

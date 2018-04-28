package com.hp.billing.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hp.billing.dao.UserDao;
import com.hp.billing.model.User;
import com.hp.billing.service.UserService;

/** 
* @author: Ted Liu 
* @date: Apr 28, 2018 2:15:43 PM 
* 
*/
@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public void insertUser(User user) {
		userDao.insertUser(user);
	}
	
	@Override
	public List<User> getUserList() {
		return userDao.getUserList();
	}

}

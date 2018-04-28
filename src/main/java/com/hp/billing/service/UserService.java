package com.hp.billing.service;

import java.util.List;

import com.hp.billing.model.User;

/** 
* @author: Ted Liu 
* @date: Apr 28, 2018 2:14:45 PM 
* 
*/
public interface UserService {

	public void insertUser(User user);
	
	public List<User> getUserList();
}

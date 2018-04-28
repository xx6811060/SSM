package com.hp.billing.dao;

import java.util.List;

import com.hp.billing.model.User;

/** 
* @author: Ted Liu 
* @date: Apr 28, 2018 2:16:03 PM 
* 
*/
public interface UserDao {

	public void insertUser(User user);
	
	public List<User> getUserList();
}

package com.hp.billing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hp.billing.model.User;
import com.hp.billing.service.UserService;

/** 
* @author: Ted Liu 
* @date: Apr 28, 2018 2:14:13 PM 
* 
*/
@Controller
@RequestMapping(value = "/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addUser(User user){
		userService.insertUser(user);
		return "redirect:/user/list";
	}
	
	@RequestMapping(value = "/addPage", method = RequestMethod.GET)
	public String addUserPage(User user){
		return "addUser";
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView getUserList(){
		ModelAndView modelAndView = new ModelAndView();
		List<User> userList = userService.getUserList();
		modelAndView.addObject("users" , userList);
		modelAndView.setViewName("listUser");
		return modelAndView;
	}
}

package com.quiz.mst.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.quiz.mst.entity.User;
import com.quiz.mst.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("/")
	public String index() {
		return "homePage";
	}
	
	@RequestMapping(value="/addNewUser", method = RequestMethod.GET)
    public String showregisterPage(ModelMap model){
        return "register";
    }
	
	@RequestMapping(value="/saveNewUser", method = RequestMethod.POST)
    public String saveNewUser(ModelMap model,@ModelAttribute("user") User user){
        return "register";
    }

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLoginPage(ModelMap model) {
		return "login";
	}

}

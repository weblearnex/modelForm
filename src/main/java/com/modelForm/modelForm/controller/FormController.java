package com.modelForm.modelForm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.modelForm.modelForm.beans.User;

@Controller
public class FormController {
	
	
	//@PostMapping("/saveController")
	@RequestMapping(value="/saveController",method = RequestMethod.POST)
	public @ResponseBody User save(@RequestBody User user){
		System.out.println(user.getId());
		System.out.println(user.getName());
		System.out.println(user.getAddress());
		System.out.println(user.getContact());
		return user;
	}

}

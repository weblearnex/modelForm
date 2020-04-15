package com.modelForm.modelForm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.modelForm.modelForm.beans.User;

@RestController
public class ApiController {
	
	@GetMapping("/")
	public String entryPoint(){
		return "application up and running";
	}
	
	@PostMapping("/save")
	public User save(@RequestBody User user){
		
		System.out.println(user.getId());
		System.out.println(user.getName());
		System.out.println(user.getAddress());
		System.out.println(user.getContact());
		return user;
	}

}

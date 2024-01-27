package com.springmvc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springmvc.model.Person;

@RestController
public class PersonController {
	
	@GetMapping("/")
	public String showForm(Person person) {
		
		return "register";
		
	}
	
	public String register() {
		
	}

}

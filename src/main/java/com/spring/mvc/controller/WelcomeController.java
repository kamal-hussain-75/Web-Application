package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WelcomeController {



	@GetMapping("/")
	public String greeting() {
		System.out.println("WelcomeController.greeting()");
		return "index";
	}
	
	
	@GetMapping("/req-param")
	public String createUser(@RequestParam(name = "user") String name, Model model) {
		
		model.addAttribute("user", name);

		System.out.println("WelcomeController.greeting :" + name);

		return "success";
	}



}
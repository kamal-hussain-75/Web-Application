package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.mvc.model.Employee;

@Controller
public class userController {
	
	@GetMapping("/")
	public String welcome()
	{
		System.out.println("UserController.welcome()");
		return "index";
	}
	
	@GetMapping("/sign-up")
	public String signUpForm()
	{
		System.out.println("UserController.signUpForm()");
		return "sign-up";
	}
	
	@PostMapping("/signupUser")
	public String postUser(@RequestParam(name =  "username") String username,@RequestParam(name="department")String department,@RequestParam(name="address")String address,Model model)
	{
		System.out.println("Username : "+username);
		System.out.println("Department : "+department);
		System.out.println("Address : "+address);
		
		model.addAttribute("username", username);
		model.addAttribute("department", department);
		model.addAttribute("address", address);
		
		return "success";
	}
	
	
	
	@PostMapping("/createUser")
	public String createUser(@ModelAttribute Employee employee)
	{
		System.out.println(employee);
		return "index";
	}

}
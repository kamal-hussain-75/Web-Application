package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/footwear")
public class FootWearController {

	@GetMapping("/")
	public String greeting() {
		System.out.println("WelcomeController.greeting()");
		return "FootWear";
	}
	
	@GetMapping("/query")
	public String queryParam(@RequestParam(name = "name",defaultValue = "Guest") String user,Model model) {
		
		model.addAttribute("user", user);
		System.out.println("WelcomeController.queryPara : "+user);
		return "success";
	}

	
}

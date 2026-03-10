package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;

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

	@GetMapping("/test")
	public String test() {
		System.out.println("WelcomeController.test()");
		return "test";
	}
	
	@GetMapping("/path-var/{id}")
	public String pathVarExample(@PathVariable(name = "id") Long id, Model model) {

		model.addAttribute("id", "Sorry this : " + id + " User is not found in our DB");

		System.out.println("WelcomeController.Pathvar : " + id);

		return "success";
	}
	
	@GetMapping("/getMyCookie")
	public String getMyCookieVal(@CookieValue(name = "firstCookie" , defaultValue = "DefaultCookie") String firstCookie, Model model) {

		model.addAttribute("firstCookie",  firstCookie);

		System.out.println("getMyCookieVal : " + firstCookie);

		return "cookieVal";
	}
	
	@GetMapping("/setCookie")
	public String setCookieVal(HttpServletResponse response,Model model) {

		Cookie cookie1 = new Cookie("firstCookie", "SensitiveInformation");
		cookie1.setMaxAge(10);
		response.addCookie(cookie1);
		System.out.println("WelcomeController.setCookieVal()");

		return "redirect:/getMyCookie";
	}


}
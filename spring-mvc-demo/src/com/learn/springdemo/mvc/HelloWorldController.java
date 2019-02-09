package com.learn.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	//controller method to show form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";		
	}
	
	//controller to process form 
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";		
	}
	
	//controller to process form 
	@RequestMapping("/processFormV2")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		String 	name= request.getParameter("studentName");
		name=name.toUpperCase();
		
		String result = "Yo! " + name;
		
		model.addAttribute("message", result);
		
		return "helloworld";		
	}

	
	//controller to process form 
	@RequestMapping("/processFormV3")
	public String processFormv3(@RequestParam("studentName") String name, Model model) {
		
		name=name.toUpperCase();
		
		String result = "Welcome! " + name;
		
		model.addAttribute("message", result);
		
		return "helloworld";		
	}
}

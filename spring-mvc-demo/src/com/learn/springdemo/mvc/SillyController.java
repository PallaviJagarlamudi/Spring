package com.learn.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/Test")
public class SillyController {
	
	//controller method to show form
	@RequestMapping("/showForm")
	public String displayForm() {
		return "silly";		
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

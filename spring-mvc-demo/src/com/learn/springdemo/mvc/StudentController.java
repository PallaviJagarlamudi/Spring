package com.learn.springdemo.mvc;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.learn.springdemo.model.Student;

@Controller
@RequestMapping("/student")
public class StudentController {
	@Value("#{countryOptions}")
	private Map<String,String> countryOptions;
	@Value("#{languageOptions}")
	private Map<String,String> languageOptions;
	@Value("#{opertatingSystemOptions}")
	private Map<String,String> opertatingSystemOptions;
	
	//controller method to show student form
	@RequestMapping("/showForm")
	public String showForm(Model model) {
		//create a student object
		Student theStudent = new Student();
		
		//add student object to model
		model.addAttribute("student", theStudent);
		
		model.addAttribute("theCountryOptions",countryOptions);
		
		model.addAttribute("thelanguageOptions",languageOptions);
		
		model.addAttribute("theOSOptions",opertatingSystemOptions);
		
		return "student-form";		
	}

	//controller method to process student form
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent) {
		//Display log
		System.out.println("Student: " + theStudent.getFirstName() + " " + theStudent.getLastName() + " loves" + theStudent.getFavProgrammingLang());
		
		return "student-confirmation";		
	}
}

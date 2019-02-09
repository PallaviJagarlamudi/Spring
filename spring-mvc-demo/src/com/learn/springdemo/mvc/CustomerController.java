package com.learn.springdemo.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.learn.springdemo.model.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	//Adding initbinder...to trim input strings
	@InitBinder
	public void initBinder(WebDataBinder databinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		
		databinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
	//controller method to show customer form
	@RequestMapping("/showForm")
	public String showForm(Model model) {
		
		//add customer object to model
		model.addAttribute("customer", new Customer());
		
		return "customer-form";		
	}

	//controller method to process student form
	@RequestMapping("/processForm")
	public String processForm( 
			@Valid @ModelAttribute("customer") Customer theCustomer,
	        BindingResult theBindingResult) {
		System.out.println("Customer Name : |" + theCustomer.getFirstName() +"|" + theCustomer.getLastName() + "|" + theCustomer.getCourseCode() +"|");
		System.out.println("Binding result" + theBindingResult + "\n\n");
		if( theBindingResult.hasErrors()) {
			return "customer-form";	
		}else {
			return "customer-confirmation";	
		}	
	}
}

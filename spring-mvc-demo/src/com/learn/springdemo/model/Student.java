package com.learn.springdemo.model;

import java.util.LinkedHashMap;

public class Student {
	private String firstName;
	private String lastName;
	private String country;
	private String favProgrammingLang;
	private String[] operatingSystems;
	
	//private LinkedHashMap<String,String> countryOptions;
	//private LinkedHashMap<String,String> languageOptions;
	//private LinkedHashMap<String,String> oSOptions;
	
	public Student() {
	/*	countryOptions = new LinkedHashMap<>();
		
		countryOptions.put("BR", "Brazil");
		countryOptions.put("FR", "France");
		countryOptions.put("IN", "India");
		countryOptions.put("DEU", "Germany");
		countryOptions.put("USA", "United States of America");	
		
		languageOptions = new LinkedHashMap<>();
		
		languageOptions.put("Java", "Java");
		languageOptions.put("Ruby", "Ruby");
		languageOptions.put("Python", "Python");
		languageOptions.put("C#", "C#");
		languageOptions.put("Perl", "Perl");*/
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	public String getFavProgrammingLang() {
		return favProgrammingLang;
	}
	public void setFavProgrammingLang(String favProgrammingLang) {
		this.favProgrammingLang = favProgrammingLang;
	}
	
	/*public LinkedHashMap<String, String> getLanguageOptions() {
		return languageOptions;
	}*/

	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}

}

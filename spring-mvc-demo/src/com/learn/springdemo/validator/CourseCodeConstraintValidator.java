package com.learn.springdemo.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String>{
	
	private String[] coursePrefix;
	private String messagePrefixViolation;
	
    @Override
    public void initialize(CourseCode theCourseCode) {
        coursePrefix = theCourseCode.value();
        messagePrefixViolation = theCourseCode.messagePrefix();
    }

	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext context) {	
		
		boolean isValid = false;
		System.out.println("theCode is " + theCode);
		
		if ( theCode != null ) {
			for (String tempPrefix : coursePrefix) {
				isValid =  theCode.toUpperCase().startsWith(tempPrefix.toString());
				if( isValid ) {
					break;
				}
			}
		}else {
			isValid=true;
			System.out.println("theCode is null");
		}
		

        if ( !isValid ) {
        	context.disableDefaultConstraintViolation();
        	context.buildConstraintViolationWithTemplate(messagePrefixViolation)
        	       .addConstraintViolation();
        }
		return isValid;
	}

}

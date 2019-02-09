package com.learn.springdemo.validator;

import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.ReportAsSingleViolation;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.validation.OverridesAttribute;


@NotEmpty
@Size(min=7,max=7)
@ReportAsSingleViolation
@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.FIELD, ElementType.METHOD,ElementType.ANNOTATION_TYPE, })
public @interface CourseCode {
	//define default course code
	public  String[] value() default {"LUV","TOPS"};

	//define default error message
	public  String message() default "Enter proper course ID";
	
	//define default error message
	public  String messagePrefix() default " must start with LUV/TOPS/CRS";
	
    @OverridesAttribute(constraint= NotEmpty.class, name="message")
	public  String messageNotNull() default "Fill this field";
    
    @OverridesAttribute(constraint=Size.class, name="message")
	public  String messageSize() default "Data should be of size of {max}";
    
//	public  String messageCharCase() default "Data should be of size of 7";
	
	//define default groups
	public Class<?>[] groups() default {};
	
	//define payloads
	public Class<? extends Payload>[] payload() default {};
	
}

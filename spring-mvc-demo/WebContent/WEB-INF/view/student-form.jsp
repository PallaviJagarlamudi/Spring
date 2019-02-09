<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration Form</title>
</head>
<body>
 <form:form action="processForm" method="get" modelAttribute="student">
   First Name: <form:input path="firstName"/><br><br>
   
   Last Name : <form:input path="lastName"/><br><br>
   
   Country : <form:select path="country">
     <form:options items="${theCountryOptions}"/>
   </form:select>
   <br><br>
   
    Favorite Programming languages : <br>
    <form:radiobuttons path="favProgrammingLang" items="${thelanguageOptions}"/>
   <br><br>
   
    Operating Systems known :
    <form:checkboxes path="operatingSystems" items="${theOSOptions}"/>    
   <br><br>
   
   <input type="submit" value="Register"/>
 </form:form>
</body>
</html>
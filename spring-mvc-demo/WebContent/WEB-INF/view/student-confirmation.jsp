<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Confirmation</title>
</head>
<body>
	The Student is confirmed: ${student.firstName} ${student.lastName }
	<br>
	<br> Country: ${student.country }
	<br>
	<br> The Student favorite language is:
	${student.favProgrammingLang }
	<br>
	<br> OS known :

	<ul>
		<c:forEach var="temp" items="${student.operatingSystems}">
			<li>${temp}</li>
		</c:forEach>
	</ul>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	Hello friends

	<h1>Welcome to SUCCESS JSP PAGE</h1>
	
	
	
	<%
	
		
		out.print("This is JSP Scriplet <br>");
	
		out.print("request in jsp "+ request.getAttribute("uname")  +"<br>");
	
		out.print("session in jsp : "+session.getAttribute("pwd")  +"<br>");
		
		out.print("application in jsp : "+ application.getAttribute("city"));
		
		
	
	
	
	
	%>



</body>
</html>
<%@ page language="java"    import="java.util.List , com.hexaware.mvc.pojo.Employee"    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>DISPLAY ALL JSP PAGE</h1>
	


	<form action="/webapp1/DisplayController"  method="get">

	<button  type="submit" >Display All</button>
	
	
	<% 
				out.print("Back to DisplayAll JSP <BR>");
							
			List<Employee>  list =	(List<Employee>)	session.getAttribute("empList");
					
					
			out.print(list);
	
	%>
	
	
	
	
	
	
	
	
	

	</form>
</body>
</html>
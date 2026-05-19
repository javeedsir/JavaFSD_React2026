<%@ page language="java"  import="com.wipro.bean.*"    isELIgnored="false"   contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Welcome JSP Output page</h1>
	
	
	<jsp:useBean id="emp"  class="com.wipro.bean.Employee"  scope="session" >
	
	</jsp:useBean>
	
	<jsp:getProperty property="eid" name="emp"/> 
	<jsp:getProperty property="ename" name="emp"/> 
	<jsp:getProperty property="salary" name="emp"/> 
	
	
	
	<br>
	
	JSP scriptlet <br>
	
	<%
	
		Employee e1 = (Employee)	session.getAttribute("emp");
	
			out.print(e1);
	
	%>
	

<br> JSP Exp <br>

	<%=  session.getAttribute("emp") %>
	
	
<br>EL Exp <br>

	${ emp }	
	
	




</body>
</html>
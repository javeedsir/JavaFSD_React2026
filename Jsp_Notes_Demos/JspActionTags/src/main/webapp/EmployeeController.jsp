<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>UseBean JSP Page , Reading data from form and forward request to Output page</h1>

	<jsp:useBean id="emp"  class="com.wipro.bean.Employee"  scope="session" >
	
	</jsp:useBean>
	
	<%-- <jsp:setProperty property="eid" name="emp" param="eid" />  
	
	<jsp:setProperty property="ename" name="emp"  param="ename" />  
	
	<jsp:setProperty property="salary" name="emp"  param="salary"  />   --%>
	
	<jsp:setProperty name="emp"  property="*" />  
	
	
	
	<jsp:include page="output.jsp"></jsp:include>
	
	
	


</body>
</html>
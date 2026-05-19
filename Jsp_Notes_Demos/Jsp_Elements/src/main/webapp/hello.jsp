<%@ page language="java"   isELIgnored="false"   import="java.util.* "   contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

  Hi friends
  
  <h1>Welcome to JSP </h1>



<%

	int x = 100;

	out.print(x  +"<br>");
	
	out.print(session  +"<br>");
	
	out.print(application +"<br>");
	
		
	
	List<String>  list = new ArrayList<String>();
	
		list.add("one");  list.add("two");
		
		out.print(list +"<br>");
		
			m1();
			
			session.setAttribute("uname","javeed");
			
			String str = (String)	session.getAttribute("uname");
			
				out.print(str);
				
				pageContext.setAttribute("city","Hyderabd");
				
			out.print(pageContext);


%>

		<%= session.getAttribute("uname")    %>  <br>
		
		<%=  request  %> <br>
		
	${ uname }  <br>
		
		${ city }
			


	<%!   
	
		int sid;
		static int eid;
		
		public void m1(){
			
			
		}
	
	%>





</body>
</html>
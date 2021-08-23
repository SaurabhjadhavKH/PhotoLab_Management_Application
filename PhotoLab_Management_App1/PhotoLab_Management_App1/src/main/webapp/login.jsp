<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <!DOCTYPE html>

<html>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<body>
<h2 align="center">Admin Login Page </h2>

<div>
  <form class="px-4 py-3" action="loginServlet" method="get">
    <div class="mb-3">
      <label for="exampleDropdownFormEmail1" class="form-label">Email address</label>
      <input type="email" class="form-control" id="exampleDropdownFormEmail1" placeholder="email@example.com" name ="username" required="required">
    </div>
    <div class="mb-3">
      <label for="exampleDropdownFormPassword1" class="form-label">Password</label>
      <input type="password" class="form-control" id="exampleDropdownFormPassword1" placeholder="Password" name="password" required="required">
    </div>
    
    <button type="submit" class="btn btn-primary">Sign in</button>
    
  </form>
  
 
  
  <% 
		String message = request.getParameter("message");
		if(message!=null && !message.isEmpty()) {
			out.print("<p style='color:red' align='center'>"+message+"</p>");
		}
	
	%>
  
  
  <% 
		String message1 = request.getParameter("message3");
		if(message1!=null && !message1.isEmpty()) {
			out.print("<p style='color:red' align='center'>"+message1+"</p>");
		}
	
	%>

  
  
</body>
</html>





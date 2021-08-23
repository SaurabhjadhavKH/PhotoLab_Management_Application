<%@page import="java.util.List" %>
<%@page import="com.hibernate.pojo.Customer"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
List<Customer> customerlist = new ArrayList<Customer>();
if(session.getAttribute("list")!=null)
	customerlist = (List<Customer>)session.getAttribute("list");


%>


<h1 align="center">Customer Details</h1>

<table class="table">
<thead class="thead-dark">

<tr>
<th>Customer Id</th>
<th>Customer Name</th>
<th>Gender</th>
<th>Mobile Number</th>
<th>Total Amount</th>
<th>Paid Status</th>
<th>No of Copies</th>
<th>Type of Photo</th>
<th>Update</th>
<th>Delete</th>
</thead>
</tr>

<% for(Customer std : customerlist){%>
	
	
	<td><%= std.getCustomer_ID() %></td>
	<td><%= std.getCustomer_Name() %></td>
	<td><%= std.getGender() %></td>
	<td><%= std.getMobile_Number() %></td>
	<td><%= std.getTotal_Amount() %></td>
	<td><%= std.getPaid_Status() %></td>
	<td><%= std.getNo_Of_Copies() %></td>
	<td><%= std.getType_Of_Photos() %></td>
	<td> <a href="StudentServlet?id=<%= std.getCustomer_ID() %> "class= 'btn btn-primary'>Update</a></td>
	<td> <a href="DeleteServlet?id=<%= std.getCustomer_ID() %>" class= 'btn btn-danger'>Delete</a></td>
	</tr> 
	
	<% }%>
	


</table>


</body>
</html>
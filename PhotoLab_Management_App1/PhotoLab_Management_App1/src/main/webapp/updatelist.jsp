<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.hibernate.pojo.Customer"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% 

 Customer user = new Customer();
if(request.getAttribute("user") != null){
	user= (Customer)request.getAttribute("user");
}
%>


<form action="UpdateServlet" method="get">
<table align="center">
<tr>
		<td>Id:</td>
		<td><input type="text" name="id" value="<%=user.getCustomer_ID() %>" placeholder="Enter Id" readonly></td>
	</tr>
	<tr>
		<td>Customer Name:</td>
		<td><input type="text" name="userName" value="<%=user.getCustomer_Name() %>" placeholder="Enter Name" ></td>
	</tr>
	
		<tr>
		<td>City:</td>
		<td><input type="text" name="city" value="<%=user.getAddress().getCity() %>" placeholder="Enter City"></td>
	</tr>
	
	
	
		<tr>
		<td>State:</td>
		<td><input type="text" name="state" value="<%=user.getAddress().getState() %>" placeholder="Enter State"></td>
	</tr>
	
	
		<tr>
		<td>Pincode:</td>
		<td><input type="text" name="pin" value="<%=user.getAddress().getPINCODE() %>" placeholder="Enter Pincode"></td>
	</tr>
	
	
	
	
	
		<tr>
		<td>Gender:</td>
		<td><input type="text" name="userPass" value="<%=user.getGender() %> "placeholder="Enter Gender"></td>
	</tr>
	
	
	
		<tr>
		<td>Mobile:</td>
		<td><input type="text" name="mobile" value="<%=user.getMobile_Number() %>" placeholder="Enter Mobile"></td>
	</tr>
	
		<tr>
		<td>Total Amount:</td>
		<td><input type="text" name="amount" value="<%=user.getTotal_Amount() %>" placeholder="Enter Amount"></td>
	</tr>
	
	
		<tr>
		<td>Paid Status:</td>
		<td><input type="text" name="status" value="<%=user.getPaid_Status() %>" placeholder="Enter Status"></td>
	</tr>
	
	
		<tr>
		<td>No of Copies:</td>
		<td><input type="text" name="copy" value="<%=user.getNo_Of_Copies() %>" placeholder="Enter No of copies"></td>
	</tr>
	
		<tr>
		<td>Type of Photos:</td>
		<td><input type="text" name="photo" value="<%=user.getType_Of_Photos() %>" placeholder="Enter Photo Size"></td>
	</tr>
	
	<tr>
	<td></td>
		<td align="left"><input type="submit" value="Update" ></td>
	</tr>
	<tr>
		<td></td>
	</tr>
</table>
</form>






</body>
</html>
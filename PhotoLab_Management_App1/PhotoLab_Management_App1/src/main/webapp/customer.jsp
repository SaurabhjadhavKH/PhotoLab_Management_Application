<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

</head>
<body>

<%
		response.addHeader("Cache-Control", "no-cache");
		response.addHeader("Cache-Control", "no-store");
		response.addHeader("Pragma","no-cache");
		response.setDateHeader("Expires", 0);
		if(session.getAttribute("username")==null){
			response.sendRedirect("index.jsp");
		}
	%>




 <form action="logoutServlet">
<button type="submit" class="btn btn-success  float-left;">Logout</button>
<br>
<br>
</form> 

<form action="customerServlet" method="get">
  
  <div class="form-group col-md-6">
    <label for="inputAddress">Customer Name</label>
    <input type="text" class="form-control col-md-4" id="inputAddress" placeholder="Enter the Customer Name"name="cname">
  </div>

  <div class="form-group col-md-6">
    <label for="inputAddress2">Gender</label>
    <input type="text" class="form-control" id="inputAddress2" placeholder="Enter gender e.g Male/Female" name="gender">
  </div>
    <div class="form-group col-md-6">
    <label for="inputAddress2">Mobile Number</label>
    <input type="text" class="form-control" id="inputAddress2" placeholder="Enter mobile number"name="mobile">
  </div>
    <div class="form-group col-md-6">
    <label for="inputAddress2">Total Amount</label>
    <input type="number" class="form-control" id="inputAddress2" placeholder="Enter amount"name="amount">
  </div>
  <div class="form-group col-md-6">
      <label for="inputState">Paid Status</label>
      <select id="inputState" class="form-control"name="status">
        <option selected>Choose...</option>
        <option>YSE</option>
        <option>NO</option>
      </select>
    </div>
 
   <div class="form-group col-md-6">
    <label for="inputAddress2">No Of Copies</label>
    <input type="number" class="form-control" id="inputAddress2" placeholder="Enter copies"name="copy">
  </div>
 
   <div class="form-group col-md-6">
      <label for="inputState">Type of photo</label>
      <select id="inputState" class="form-control"name="photo">
        <option selected>Choose...</option>
        <option>Passport</option>
        <option>Stamp</option>
        <option>Max 4*6</option>
        <option>Size 6*8</option>
        <option>Size 8*12</option>
      </select>
    </div>
  <div class="form-row">
    <div class="form-group col-md-6">
      <label for="inputCity">City</label>
      <input type="text" class="form-control" id="inputCity" placeholder="Enter city name"name="city">
    </div>
    <div class="form-group col-md-6">
      <label for="inputState">State</label>
      <select id="inputState" class="form-control"name="state">
        <option selected>Choose...</option>
        <option>Maharashtra</option>
        <option>Uttar Pradesh</option>
        <option>Karnataka</option>
        <option>Kerala</option>
      </select>
    </div>
    <div class="form-group col-md-6">
      <label for="inputZip">Pincode</label>
      <input type="text" class="form-control" id="inputZip" placeholder="Enter pincode"name="pin">
    </div>
  </div>
  
  <button type="submit" class="btn btn-success ">ADD</button>

    <!-- <button type="submit" class="btn btn-primary ">UPDATE</button>  -->
  
</form>
<br>
<form action="ShowCustomerServlet" method="get">
 <button type="submit" class="btn btn-danger ">Show Customer Details</button>
</form>


  <% 
		String message1 = request.getParameter("message1");
		if(message1!=null && !message1.isEmpty()) {
			out.print("<p style='color:red' align='center'>"+message1+"</p>");
		}
	
	%>





</body>
</html>
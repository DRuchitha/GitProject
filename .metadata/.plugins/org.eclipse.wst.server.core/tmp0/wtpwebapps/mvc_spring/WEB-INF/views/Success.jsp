<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<h1 style=color:blue>Your Registration is Successfull</h1>
<h2>The details entered by you are:</h2>
<table border=1 collapse=collapse>
<tr>
 <th>Name</th>
<th> Age</th>
 <th>Email</th>
<th> Country name</th>
</tr>
<tr>
<td>${register.getName()}</td>
<td>${register.getAge()}</td>
<td>${register.getEmail()}</td>
<td>${register.getCountry()}</td> 
</tr>
<h2>Thank you for register</h2>
</center>
</body>
</html>
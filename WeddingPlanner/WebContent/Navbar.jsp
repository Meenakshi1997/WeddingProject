<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Wedding Planner</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>

<nav class="navbar navbar-default navbar-fixed-top">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#" style="font-family:Monotype Corsiva; color:brown; font-size:40px; font-weight:bold">Wedding Planner</a>
    </div>
    
    <ul class="nav navbar-nav" style="margin-left:30%">
    
    	
      <li class="active"><a href="HomePage.jsp" style="font-family:Monotype Corsiva; color:brown; font-size:25px; " >Home</a></li>
      
      <c:forEach items="${categories}" var="category">
    	<li><a href="fetchSubCategories?category=${category.categoryId}" style="font-family:Monotype Corsiva; color:brown; font-size:25px; ">${category.categoryName}</a></li>
	  </c:forEach>
      <li><a href="Login.jsp" style="font-family:Monotype Corsiva; color:brown; font-size:25px; ">Admin</a></li>
      <li><a href="UserLogin.jsp" style="font-family:Monotype Corsiva; color:brown; font-size:25px; ">User</a></li>
      <li><a href="ContactUs.jsp" style="font-family:Monotype Corsiva; color:brown; font-size:25px; ">Contact Us</a></li>
      <li><a href="AboutUs.jsp" style="font-family:Monotype Corsiva; color:brown; font-size:25px; ">About Us</a></li>
    
    
    	
    
    </ul>
    
    
    
  </div>
</nav>

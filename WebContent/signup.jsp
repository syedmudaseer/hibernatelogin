<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SignUp Form Design</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<div class="SignUp">
    <img src="images/avatar.png" class="avatar">
        <h1>Login Here</h1>
        <form action="Signup" method="post">
            <p>name</p>
            <input type="text" name="name" placeholder="Enter Username">
            <p>Email</p>
            <input type="text" name="email" placeholder="Enter Username">
            <p>Phone</p>
            <input type="text" name="phone" placeholder="Enter Username">
            <p>Password</p>
            <input type="password" name="pwd" placeholder="Enter Password">
            <input type="submit" name="" value="SignUp"></br>
            <a href="index.jsp">Already have an account?</a>
        </form>
        
    </div>
</body>
</html>
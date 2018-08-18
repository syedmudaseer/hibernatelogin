<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Login Form Design</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
<body>
    <div class="loginbox">
    <img src="images/avatar.png" class="avatar">
        <h1>Login Here</h1>
        <form action="Login" method="post">
            <p>Email Id</p>
            <input type="text" name="lemail" placeholder="Email" required>
            <p>Password</p>
            <input type="password" name="pwd" placeholder="Enter Password" required>
            <input type="submit" name="" value="Login">
            <a href="">Lost your password?</a><br>
            <a href="signup.jsp">Don't have an account?</a>
        </form>
        
    </div>

</body>
</head>
</html>
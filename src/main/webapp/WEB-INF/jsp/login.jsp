<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<h1>LOGIN</h1> <br>
<form action="login" method="post">
   USERNAME: <input type="text" name="username">
    PASSWORD:  <input type="password" name="password">
    <input type="submit" value="LOGIN">
</form>
</body>
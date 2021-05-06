<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
</head>
<body>
<h1>Index</h1>


<div class="w3-container">

    <table class="w3-table w3-striped">
        <tr>
            <th>ID</th>
            <th>StudentID</th>
            <th>Name</th>
            <th>Gender</th>
<%--            <th>Email</th>--%>
<%--            <th>Phone</th>--%>
<%--            <th>Native Land</th>--%>
        </tr>
        <c:forEach var="p" items="${students}">
            <tr>
                <c:url var="url" value="student">
                    <c:param name="id" value="${p.id}"/>
                </c:url>
                <td>${p.id}</td>
                <td>${p.studentid}</td>
                <td>${p.name}</td>
                <td>${p.gender} <a href="${url}"> Detail </a></td>
<%--                <td>${p.email}</td>--%>
<%--                <td>${p.phone}--%>
<%--                <td>${p.nativeland} <a href="${url}"> Detail </a></td>--%>
            </tr>
        </c:forEach>

    </table>
</div>

<h1>ADD STUDENT</h1>
<form action="create" method="post">
    StudentId: <input type="text" name="studentid"> <br>
    Name:  <input type="text" name="name"> <br>
    Gender:  <input type="text" name="gender"> <br>
    Email:  <input type="text" name="email"> <br>
    Birth:  <input type="text" name="birth"> <br>
    Phone:  <input type="text" name="phone"> <br>
    Nativeland:  <input type="text" name="nativeland"> <br>
    Password:  <input type="password" name="password"> <br>
    <input type="submit" value="CREATE">
</form>

</body>
</html>

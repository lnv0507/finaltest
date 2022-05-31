<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="ISO-8859-1">
    <title>Title</title>
</head>
<body>
<h1>Student Manager</h1>
<div>
    <h5>Student List</h5>
</div>
<div>
    <button>New...</button>
    <button>Delete</button>
</div>
<div>
    <table>
        <tr>
            <td>Edit</td>
            <td>Selected</td>
            <td>StudentID</td>
            <td>Name</td>
            <td>Birthday</td>
        </tr>
        <c:forEach items="${students}" var="student">
        <tr>
            <td>
                <button>Edit</button>
            </td>
            <td>
                <input type="checkbox"/>
            </td>
            <td>
                <a href="000000">${student.id}</a>
            </td>
            <td>${student.name}</td>
            <td>${student.birthday}</td>
        </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
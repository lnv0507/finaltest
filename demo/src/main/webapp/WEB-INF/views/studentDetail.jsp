<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="ISO-8859-1">
    <title>Title</title>
</head>
<body>
<h1>Student Detail</h1>
<table>
    <tr>
        <td>StudentID</td>
        <td>${student.id}</td>
    </tr>
    <tr>
        <td>Name</td>
        <td>${student.name}</td>
    </tr>
    <tr>
        <td>Male</td>
        <td>${student.male}</td>
    </tr>
    <tr>
        <td>Birthday</td>
        <td>${student.birthday}</td>
    </tr>
    <tr>
        <td>Place of Birth</td>
        <td>${student.placeOfBirth}</td>
    </tr>
    <tr>
        <td>Address</td>
        <td>${student.address}</td>
    </tr>

    <tr>
        <td>Department</td>
        <td>${student.depName}</td>
    </tr>
</table>
    <div>
        <button>Student List</button>
        <button>Edit...</button>
</div>
</body>
</html>
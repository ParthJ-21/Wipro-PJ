<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Car List</title>
</head>
<body>
<h2>Available Cars</h2>
<ul>
    <c:forEach var="car" items="${cars}">
        <li>${car}</li>
    </c:forEach>
</ul>
</body>
</html>

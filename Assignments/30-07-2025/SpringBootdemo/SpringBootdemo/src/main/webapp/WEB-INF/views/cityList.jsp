<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CITY LIST</title>
</head>
<body>

<h1>Indian City:</h1>
  <c:forEach var="city" items="${citylist}">
    ${city}
      <br/>
</c:forEach>

</body>
</html>
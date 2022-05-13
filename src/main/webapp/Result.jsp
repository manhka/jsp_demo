<%--
  Created by IntelliJ IDEA.
  User: MY PC
  Date: 5/13/2022
  Time: 10:18 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach items="${ds}" var="e">
    ${e.id} ${", "}${e.name} ${", "}${e.age}<br>
</c:forEach>
</body>
</html>

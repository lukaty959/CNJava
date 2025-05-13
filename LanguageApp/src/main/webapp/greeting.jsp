<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head><title>Lời chào</title></head>
<body>
    <c:choose>
        <c:when test="${sessionScope.lang == 'vi'}">
            <h1>Xin chào</h1>
        </c:when>
        <c:otherwise>
            <h1>Hello</h1>
        </c:otherwise>
    </c:choose>
</body>
</html>

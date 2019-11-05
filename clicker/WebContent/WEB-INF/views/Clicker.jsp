<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!--     CODE BORROWED FROM:
    https://github.com/isuntag/Java/blob/master/java_web/Button/WebContent/WEB-INF/views/Clicker.jsp -->
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Button Clicker</h1>
	<p>Click the button!</p>
	<h1>Clicked <c:out value="${count}"/> times!</h1>
	<a href="/Clicker/ButtonClicker"><button>Click!</button></a>
</body>
</html>
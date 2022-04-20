<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP+SERVLET!</title>

<style>
*{
box-sizing:border-box;
margin:0;
padding:0;
}
form{
padding:20px;
height:400px;
background-color:orange;
}
input:nth-of-type(1){
width:200px;
height:40px;
background-color:black;
color:white;
}
input:nth-of-type(2){
width:50px;
height:40px;
background-color:black;
color:white;
font-weight:bold;
}
</style>

</head>
<body>
	<h1>입력값은 "${text}"입니다.</h1>
	
	<form method="post" action="./hi">
		<input type="text" name="text">
		<input type="submit" value="요청">
	</form>

	<c:forEach var="v" items="${list}">
	<h1>❤️${v}❤️</h1>
	</c:forEach>
	
</body>
</html>
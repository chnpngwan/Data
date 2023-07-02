<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="result.jsp" method="get">
		第一个数：<input type="text" name="first"><br>
		计算类型：<select name="type">
					<option>减法</option>
					<option>加法</option>
					<option>乘法</option>
					<option>除法</option>
				</select><br>
		第二个数：<input type="text" name="second"><br>
		提交按钮：<input type="submit"><br>
	</form>
</body>
</html>
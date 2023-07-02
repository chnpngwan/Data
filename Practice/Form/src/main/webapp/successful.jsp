<%@page import="java.util.jar.Attributes.Name"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>登陆成功！欢迎：<%=session.getAttribute("name") %></h1>
</body>
</html>
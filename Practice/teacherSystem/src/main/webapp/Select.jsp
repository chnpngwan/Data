<%@page import="model.Teacher"%>
<%@page import="java.util.List"%>
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
	<% 
	List<Teacher> list =(List<Teacher>) request.getAttribute("list");
	pageContext.setAttribute("list", list);
	%>
	<h1>教师管理系统</h1>
	<a href="add.jsp">添加一个老师</a><br/><br/>
	<form action="selects" method="get">
		请输入关键字：<input type="text" name="key">
				  <input type="submit" value="搜索"><br/><br/>
	</form>
	<table style="border: solid 2px red">
		<tr>
			<th style="border: solid 2px red">编号</th>
			<th style="border: solid 2px red">姓名</th>
			<th style="border: solid 2px red">性别</th>
			<th style="border: solid 2px red">年龄</th>
			<th style="border: solid 2px red">职称</th>
			<th style="border: solid 2px red">删除</th>
			<th style="border: solid 2px red">修改</th>
		</tr>
		<c:forEach var="teacher" items="${ list }">
			<tr>
				<th style="border: solid 2px red">${ teacher.id }</th>
				<th style="border: solid 2px red">${ teacher.name }</th>
				<th style="border: solid 2px red">${ teacher.sex }</th>
				<th style="border: solid 2px red">${ teacher.age }</th>
				<th style="border: solid 2px red">${ teacher.position }</th>
				<th style="border: solid 2px red"><a href="delete?id=${ teacher.id }">删除</a></th>
				<th style="border: solid 2px red"><a href="update.jsp">修改</a></th>
			</tr>
		</c:forEach>
		
	</table>
</body>
</html>
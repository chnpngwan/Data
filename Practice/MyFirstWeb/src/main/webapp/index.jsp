<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>首页</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
	<c:if test="${currUser.type == 1}">
		<h3>欢迎您登录管理员【${currUser.account}】</h3>
		<form action="AddTitle" method="post">
			<table>
				<tr>
					<td>标题名</td>
					<td><input type="text" name="title"></td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" value="发帖">
						<input type="reset" value="清空">
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<a href="showtitle.jsp">查看帖子列表</a>
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<div style="color:red">${msg}</div>
					</td>
				</tr>
			</table>
		</form>
	</c:if>
	<c:if test="${currUser.type == 0}">
		<h3>欢迎您登录会员【${currUser.account}】</h3>
		<a href="showtitle.jsp">查看帖子列表</a>
	</c:if>
  </body>
</html>

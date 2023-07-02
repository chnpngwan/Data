<%@page import="com.web.dao.TitleDao"%>
<%@page import="com.web.pojo.Title"%>
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
    
    <title>查看帖子</title>
    
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
  <%
  		List<Title> list = TitleDao.titleList;
  		pageContext.setAttribute("list", list);
   %>
  
   <h2>帖子列表</h2>
   <table>
   		<tr>
   			<td>编号</td>
   			<td>帖子标题</td>
   		</tr>
   		<c:forEach items="${list}" var="t">
   		<tr>
   			<td>${t.id}</td>
   			<td>${t.title}</td>
   		</tr>
   		</c:forEach>
   </table>
  </body>
</html>

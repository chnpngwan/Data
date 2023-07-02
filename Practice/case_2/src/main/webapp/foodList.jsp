<%@page import="java.util.ArrayList"%>
<%@page import="com.zhangboyun.dao.FoodDao"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="java.util.List"%>
<%@page import="com.zhangboyun.Bean.Food"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	h2{
	text-align: center;
	}
	a{
	text-decoration: none;
	}
	#bo{
	position: fixed;
	bottom: 1px;
	}
	#xz{	
	}
	table {
		border:1px solid black;
		border-collapse: collapse;
	}	
	p{
	text-align: center;
	}
</style>
</head>
<body>
<h2>云南人家欢迎你!</h2>
<h2>${sessionScope.username} !</h2>
<form action="FoodquServlet" method="post" style="text-align: center;">
<input type="button" value="通过菜名搜索" width="60px">
<input type="text" name="search"/>
<input type="submit" value="搜索"/>
</form>
	<table cellspacing="0"  cellpading="0" align="center">
		<thead>
		<tr>
			<th>编号</th>
			<th>所属菜系</th>
			<th>菜名</th>
			<th>价格</th>
			<th>会员价格</th>
			<th>简介</th>
			<th>操作</th>
			<th>操作</th>
		</tr>
		</thead>
		<tbody>
		  
		<%				
		List<Food> list=(List)request.getAttribute("list");
		for (int i = 0; i < list.size(); i++) {
		%>
		<tr>
			<td><%=list.get(i).getId() %></td>
			<td><%=list.get(i).getCuisine() %></td>
			<td><%=list.get(i).getFoodName() %></td>
			<td><%=list.get(i).getPrice() %></td>
			<td><%=list.get(i).getMemberPrice() %></td>
			<td><%=list.get(i).getIndroduction() %></td>
			<td><a href="FooddelteServlet?bid=<%=list.get(i).getId() %>"
			onclick="if(confirm('你确定删除该数据吗？')==false){return false;}"			
			>删除</a></td>
			<td><a href="FoodupServlet?bid=<%=list.get(i).getId() %>"
			>修改</a></td>
		</tr>
		
		<%
		}
		%>
		<!-- 
		<c:forEach items="${list}" var="food">
		<tr>
			<td>${food.id }</td>
			<td>${food.cuisine }</td>
			<td>${food.foodName }</td>
			<td>${food.price }</td>
			<td>${food.memberPrice }</td>
			<td>${food.indroduction }</td>
			<td><a href="FooddelteServlet？id=${food.id }"
			onclick="if(confirm('你确定删除该数据吗？')==false){return false;}"			
			>删除</a></td>
			<td><a href="FoodupServlet?bid= "
			>修改</a></td>
		</tr>
		</c:forEach> 
		-->
		</tbody>
		</table>
		<h2>共有<%=list.size() %> 条数据！</h2>		
		<p><a id="xz" href="foodAdded.jsp" >新增</a></p>		
		<p id="bo"><a href="login.jsp" >退出</a></p>
</body>
</html>
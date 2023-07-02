<%@page import="util.Util"%>
<%@page import="model.Food"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	table {
		border:1px solid black;
		border-collapse: collapse;
		   }
		   td {
		border:1px solid black;
		   }
</style>
</head>
<body>
<table>
	<tr>
    	<th>序号</th>
		<th>地方</th>
		<th>菜名</th>
		<th>价格</th>
		<th>价格</th>
	</tr>
   <%
	List<Food> list = Util.select();
    //List<Food> list = (List)request.getAttribute("list"); 
	for(int i =0;i<list.size();i++) {
    %>
	<tr>
		<td><%=list.get(i).getId() %></td>
		<td><%=list.get(i).getFoodName() %></td>
		<td><%=list.get(i).getCuisine() %></td>
		<td><%=list.get(i).getPrice() %></td>
		<td><%=list.get(i).getMemberPrice() %></td>
		<td><%=list.get(i).getIntroduce() %></td>
	<tr/>
	<%
	}
    %>
</table>
</body>
</html>
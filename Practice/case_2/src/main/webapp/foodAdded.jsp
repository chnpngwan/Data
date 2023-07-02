<%@page import="com.zhangboyun.Bean.Food"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="FoodAddServlet" method="post">		
				<table cellspacing="0" cellpadding="0">
					<tr>
						<td width="80px">菜系</td>
						<td><select name="cuisine" style="width: 80px;">
							<option value="1">粤菜</option>
							<option value="2">川菜</option>
							<option value="3">湘菜</option>
							<option value="3">云南菜</option>
						</select>*</td>
					</tr>
					<tr>
						<td width="80px">菜名</td>
						<td><input type="text" name="foodName" class="InputStyle" value="" />*</td>
					</tr>
					<tr>
						<td>价格</td>
						<td><input type="text" name="price" class="InputStyle" value=""/>*</td>
					</tr>
					<tr>
						<td>会员价格</td>
						<td><input type="text" name="memberPrice" class="InputStyle" value="" /></td>
					</tr>
					<tr>
						<td>简介</td>
						<td><textarea name="introduce" class="TextareaStyle"></textarea></td>
					</tr>
					<tr>
						<%
						if(request.getAttribute("errorMessage")!=null){
						%>
					</tr>
					<tr>
						<td></td>
						<td style="color: red;"><%=request.getAttribute("errorMessage")%></td>
					</tr>
					<%
					}
					%>
				</table>		
	<input type="submit" name="" value="添加" />
	<a href="foodList.jsp">返回</a>
	</form>
</body>
</html>
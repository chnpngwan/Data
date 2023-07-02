<%@page import="org.apache.catalina.tribes.ChannelSender"%>
<%@page import="com.zhangboyun.Bean.Food"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	h2 {
	text-align: center;
}
	#ce{	
	margin-left: 800px;
	}
</style>
</head>
<body>
<h2>修改食品信息</h2>
<div id="ce">
<form action="UpdateServlet" method="post">
				<%
				Food food=(Food)request.getAttribute("food");
				%>
				<input type="hidden" name="id" value="<%=food.getId() %>">
				<table cellspacing="0" cellpadding="0">
					<tr>
						<td width="80px">菜系</td>
						<td><select name="cuisine" style="width: 80px;">
							<%
							String[] cuisines={"粤菜","川菜","湘菜","云南菜"};
							for(int i=0;i<cuisines.length;i++){
								if(food.getCuisine().equals(cuisines[i])){
							
							%>
							<option value="<%=cuisines[i] %>" selected="selected"><%=cuisines[i] %></option>
							<%
							}
							else{
							%>
							<option value="<%=cuisines[i] %>"><%=cuisines[i] %></option>
						<%
							}
							}
						%>
						</select>*</td>
					</tr>
					<tr>
						<td width="80px">菜名</td>
						<td><input type="text" name="foodName" class="InputStyle" value="<%=food.getFoodName() %>" />*</td>
					</tr>
					<tr>
						<td>价格</td>
						<td><input type="text" name="price" class="InputStyle" value="<%=food.getPrice() %>"/>*</td>
					</tr>
					<tr>
						<td>会员价格</td>
						<td><input type="text" name="memberPrice" class="InputStyle" value="<%=food.getMemberPrice() %>" /></td>
					</tr>
					<tr>
						<td>简介</td>
						<td><textarea name="introduce" class="TextareaStyle" ><%=food.getIndroduction() %></textarea></td>
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
	<input type="submit" name="" value="修改" />
	<a href="FoodquServlet">返回</a>
	</form>
	</div>
</body>
</html>
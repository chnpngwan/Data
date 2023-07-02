<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>     
<%@page import="model.Good"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>展示</title>
	<script type="text/javascript">
            functon Confirmation(){ 
               var Val = confirm("确定要删除吗?"); 
               if( Val == true ){ 
                  document.write ("确定"); 
                  return true; 
               } 
               else{ 
                  document.write ("取消"); 
                  return false; 
               } 
            } 
        </script>
</head>
<body>
	<h1>购物车</h1>
	<a href="add.jsp">添加商品</a>
    <br/>
    <br/>
    
    <%
    List<Good> list =(List<Good>) request.getAttribute("list");
    String key = (String)request.getAttribute("lists");
    pageContext.setAttribute("list", list);
    pageContext.setAttribute("key", key);
    %>
    
    <form action="select" method="get">
        <input type="text" name="lists" value="${ key }"/>
        <input type="submit" value="搜索"/> 
    </form>
    <br/>
    <br/>
    
	<table style="border: solid 2px black">
		<tr>
			<th style="border: solid 2px black;background-color: blue;">商品编号</th>
			<th style="border: solid 2px black;background-color: blue;">商品名称</th>
			<th style="border: solid 2px black;background-color: blue;">商品单价</th>
			<th style="border: solid 2px black;background-color: blue;">商品数量</th>
			<th style="border: solid 2px black;background-color: blue;">添加时间</th>
			<th style="border: solid 2px black;background-color: blue;">商品描述</th>
			<th style="border: solid 2px black;background-color: blue;">操作</th>
			<th style="border: solid 2px black;background-color: blue;">修改</th>
		</tr>
		<c:forEach var="good" items="${ list }">
			<tr>
				<th style="border: solid 2px black">${ good.id }</th>
				<th style="border: solid 2px black">${ good.name }</th>
				<th style="border: solid 2px black">${ good.price }</th>
				<th style="border: solid 2px black">${ good.count }</th>
				<th style="border: solid 2px black">${ good.createTime }</th>
				<th style="border: solid 2px black">${ good.desc }</th>
				<th style="border: solid 2px black">
				<a href="delete?id=${ good.id }">
				<form>
  				<input type="button" value="删除商品" onclick="Confirmation();" />
				</form>
				</a></th>
				 <td style="border: solid 2px red;">
                    <a href="update?id=${ good.id }&name=${ good.name }&price=${ good.price }&count=${ good.count }&createTime=${ good.createTime }&desc=${ good.desc }">修改</a>
                </td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
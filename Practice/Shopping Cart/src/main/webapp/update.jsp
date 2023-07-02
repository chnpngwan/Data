<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" 
    prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>修改</title>
</head>
<body>
	<%
	int id = (Integer)request.getAttribute("id");
    String name = (String)request.getAttribute("name");
    double price = (Double)request.getAttribute("price");
    int count = (Integer)request.getAttribute("count");
    Date createTime = (Date)request.getAttribute("createTime");
    String desc = (String)request.getAttribute("desc");
    pageContext.setAttribute("id", id);
    pageContext.setAttribute("name", name);
    pageContext.setAttribute("price", price);
    pageContext.setAttribute("count", count);
    pageContext.setAttribute("createTime", createTime);
    pageContext.setAttribute("desc", desc);
    %>

<form action="update" method="post">
 <input type="hidden" name="id" value="${ id }" />
        商品名称：
        <input type="text" name="name" value="${ name }" />
        <br/>
        
        商品单价：
        <input type="text" name="price" value="${ price }" />男
        <br/>
        
        商品数量：
        <input type="text" name="count" value="${ count }" />男
        <br/>

        添加时间：
        <input type="text" name="creatTime" value="${ creatTime }" />
        <br/>
           
         商品描述：
        <input type="text" name="desc" value="${ desc }" />
        <br/>    
        <input type="submit" />
    </form>
</body>
</html>
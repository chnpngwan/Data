<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>添加</title>
</head>
<body>
<form action="insert" method="get">
        商品名称：
        <input type="text" name="name" />
        <br/>
        
        商品单价：
        <input type="text" name="price"/>男
        <br/>
        
        商品数量：
        <input type="text" name="count"/>男
        <br/>

        添加时间：
        <input type="text" name="creatTime" />
        <br/>
           
         商品描述：
        <input type="text" name="desc" />
        <br/>    
        <input type="submit" />
    </form>
</body>
</html>
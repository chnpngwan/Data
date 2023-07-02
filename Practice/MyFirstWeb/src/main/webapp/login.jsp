<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>用户登录</title>
    
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
    <form action="login" method="post">
    	<table>
    		<tr>
    			<td align="right">用户名</td>
    			<td><input type="text" name="account"></td>
    		</tr>
    		<tr>
    			<td align="right">密码</td>
    			<td><input type="password" name="password"></td>
    		</tr>
    		<tr>
    			<td colspan="2" align="center">
    				<input type="submit" value="登录">
    				<input type="reset" value="重置">
    			</td>
    		</tr>
    		<tr>
    			<td colspan="2" align="center">
    				<div style="color:red">${msg}</div>
    			</td>
    		</tr>
    	</table>
    </form>
  </body>
</html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h1>第一个数：${ param.first }</h1>
	<h1>计算类型：${ param.type }</h1>
	<h1>第二个数：${ param.second }</h1>
	<c:set var="type" value="${ param.type}"></c:set>
	<c:choose>
		<c:when test="${ type=='加法' }">
		<h1>加法结果：${ param.first + param.second }</h1>
		</c:when>
		<c:when test="${ type=='减法' }">
		<h1>减法结果：${ param.first - param.second }</h1>
		</c:when>
		<c:when test="${ type=='乘法' }">
		<h1>乘法结果：${ param.first * param.second }</h1>
		</c:when>
		<c:when test="${ type=='除法' }">
		<h1>除法结果：${ param.first / param.second }</h1>
		</c:when>
	</c:choose>
	
	
</body>
</html>
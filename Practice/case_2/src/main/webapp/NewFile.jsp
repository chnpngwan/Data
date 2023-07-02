<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="neirong">
	<%!
	List<String> getList(){
		List<String> paintList=new ArrayList<>();	
		paintList.add("人物");
		paintList.add("油画");
		paintList.add("山水");
		paintList.add("书法");
		paintList.add("国画");
		return paintList;
	}
	%>
	<ul class="jiantou">
	<%
	List<String> paintList=getList();
	for(int i=0;i<paintList.size();i++){
		%>
		<li><a href="#"><%=paintList.get(i)%></a>
		</li>
		<% 
		}
		%>
		<%
		for(String s:paintList){
			%>
			<li><a href="#"><%=s%></a>
		</li>
			<% 
		}
		%>
		
	</ul>
	</div>
</body>
</html>
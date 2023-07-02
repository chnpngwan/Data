<%@page import="utile.JDBCUtil"%>
<%@page import="book_model.Book"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table style="border:1px solid red">
		<%				
		List<Book> list= JDBCUtil.select();
		for (int i = 0; i < list.size(); i++) {
		%>
		<tr>
			<td style="border:1px solid pink"><%=list.get(i).getId() %></td>
			<td style="border:1px solid pink"><%=list.get(i).getName() %></td>
			<td style="border:1px solid pink"><%=list.get(i).getAuthor() %></td>
			<td style="border:1px solid pink"><%=list.get(i).getPrice() %></td>
			<td style="border:1px solid pink"><%=list.get(i).getTyper() %></td>
		</tr>
		<%
		}
		%>
	</table>
</body>
</html>
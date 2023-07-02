<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>新增</title>
</head>
<body>
	<form action="insert" method="get">
		姓名：<input type="text" name="name"><br/>
		性别：<input type="radio" name="sex" value="男" checked>男
			<input type="radio" name="sex" value="女">女<br/>
		年龄：<input type="text" name="age"><br/>
		职称：<input type="text" name="posotion"><br/>
		<input type="submit"><br/>
	</form>
</body>
</html>
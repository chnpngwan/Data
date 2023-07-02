<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>修改</title>
</head>
<body>
	<form action="update" method="get">
		ID:    <input type="text" name="id"><br/>
		修改姓名：<input type="text" name="name"><br/>
		修改性别：<input type="radio" name="sex" value="男" checked>男
			<input type="radio" name="sex" value="女">女<br/>
		修改年龄：<input type="text" name="age"><br/>
		修改职称：<input type="text" name="posotion"><br/>
		<input type="submit"><br/>
	</form>
</body>
</html>
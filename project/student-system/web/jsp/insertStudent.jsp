<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>添加</title>
</head>
<body>
	<h1>添加学生信息</h1>
	<form action="insertDo.do" method="post">
		<label>
			学号：<input type="text" name="id">
		</label>
		<label>
			姓名：<input type="text" name="name">
		</label>
		<label>
			性别：<input type="radio" class="sex" name="sex" value="男">男
				  <input type="radio" class="sex" name="sex" value="女">女
		</label>
		<label>
			年龄：<input type="text" name="age">
		</label>
		<input type="submit" value="添加">
	</form>
</body>
</html>
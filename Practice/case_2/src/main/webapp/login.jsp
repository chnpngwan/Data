<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	 <style type="text/css">
	        .lgD{
	            margin-top:10px;
	            margin-bottom: 10px;
	        }	       				
	</style>
</head>
<body>
	    <form id="loginform" action="LoginServlet" method="post">
        <!-- 登录 -->
        <div id="logDiv">
            <img src="" alt="">
            <div id="logGet">
                <!-- 头部提示信息 -->
                <div id="logD logDitp">
                    <p class="p1">登录</p>
                </div>
                <!-- 输入框 -->
                <div class="lgD">
                    <img src="" alt="">
                    <input type="text" placeholder="输入用户名" name="username">
                </div>
                <div class="lgD" >
                    <img src="" alt="">
                    <input type="password" placeholder="输入用户密码" name="password">
                </div>
                <div class="lgC">
                    <button type="submit" id="login-buutton">
                        <strong>登录</strong>
                    </button>
                </div>
            </div>
        </div>
    </form>
</body>
</html>
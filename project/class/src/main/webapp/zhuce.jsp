<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-CN">
 
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="Content-Type" content="register/html; charset=gb2312">
    <title>注册</title>
    <style>
        body {
            background: url('image/1677043080654.jpeg') no-repeat;
            background-size: 100% auto;
        }
        
        #loginDiv {
            width: 20%;
            height: 400px;
            background-color: #00000085;
            margin: auto;
            margin-top: 10%;
            text-align: center;
            border-radius: 10px;
            padding: 50px 50px;
        }
        
        #name_trip {
            margin-left: 50px;
            color: red;
        }
        
        p,
        .sexDiv {
            margin-top: 10px;
            margin-left: 20px;
            text-align: left;
            color: azure;
        }
        
        .sexDiv>input {
            width: 30px;
            height: 17px;
        }
        
        input,
        select {
            margin-left: 15px;
            border-radius: 5px;
            border-style: hidden;
            height: 30px;
            width: 180px;
            background-color: rgba(105, 105, 105, 0.5);
            outline: none;
            color: #f0edf3;
            padding-left: 10px;
        }
        
        .button {
            margin-top: 30px;
            width: 25%;
            height: 30px;
            border-radius: 10px;
            border: 0;
            color: #fff;
            font-size: 15px;
            background-image: linear-gradient(120deg, #f093fb 0%, #f5576c 100%);
            cursor: pointer;
        }
        
        .introduce {
            margin-left: 110px;
        }
        
        .introduce>textarea {
            background-color: rgba(216, 191, 216, 0.5);
            border-style: hidden;
            outline: none;
            border-radius: 5px;
        }
        
        h1 {
            color: #ffffff90;
            margin-top: 5%;
        }
        
        b {
            margin-left: 50px;
            color: #FFEB3B;
            font-size: 10px;
            font-weight: initial;
        }
    </style>
</head>
 
<body>
    <div id="loginDiv">
        <form action="denglu.jsp">
            <h1>注 册</h1>
            <p>用户姓名:<input id="userNname" type="text" autofocus required><label id="name_trip"></label></p>
 
            <p>用户密码:<input id="password" type="password" required><label id="password_trip"></label></p>
 
            <p>确认密码:<input id="surePassword" type="password" required><label id="surePassword_trip"></label></p>
 
            <div class="sexDiv">
                用户性别:
                <input class="userSex" name="sex" value="boy" type="radio">男
                <input class="userSex" name="sex" value="girl" type="radio">女
                <label id="sex_trip"></label>
            </div>
            <p>
                电子邮件:
                <input id="email" type="email" required>
                <label id="emil_trip"></label>
            </p>
            <p style="text-align: center;">
                <input type="submit" class="button" onblur="checkForm()" value="提交">
                <input type="reset" class="button" value="重置">
            </p>
        </form>
    </div>
 
</body>
<script type="text/javascript">
    function trip(obj, trip) {
        document.getElementById(obj).innerHTML = "<b>" + trip + "</b>";
    }
 
    function checkSex() {
        var sexNum = document.getElementsByName("sex");
        var sex = "";
        for (let i = 0; i < sexNum.length; ++i) {
            if (sexNum[i].checked) {
                sex = sexNum[i];
             }
 
         }
         if (sex == "") {
             trip("sex_trip", "ERROR!!");
             return false;
         } else {
             trip("sex_trip", "OK!!");
         }
    }
 
    function checkForm() {
        checkSelect();
        checkHobby();
        checkSex();
 
        var trip = document.getElementsByName("em");
        var tripV = trip.inerHTML();
        //获取用户名输入项
        var userNname = document.getElementById("userNname");
        var uName = userNname.value;
        if (uName.length < 1 || uName.length > 10) {
            trip("name_trip", "账号长度为1-10位!!");
            return false;
        } else {
            trip("name_trip", "OK!!");
 
        }
 
        //密码长度大于6 和确认必须一致 
        var password = document.getElementById("password");
        var userPass = password.value;
        if (userPass.length < 6) {
            trip("password_trip", "密码要>6位!!");
            return false;
        } else {
            trip("password_trip", "OK!!");
        }
 
        //获取确认密码框的值 var
        var surePassword = document.getElementById("surePassword");
        var surePass = surePassword.value;
        if (userPass != surePass) {
            trip("surePassword_trip", "两次密码不一致!!");
            return false;
        }
 
        //校验邮箱:/^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+(\.[a-zA-Z0-9_-])+/
        var inputEmail = document.getElementById("email");
        var uEmail = inputEmail.value;
        if (!/^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+(\.[a-zA-Z0-9_-])+/.test(uEmail)) {
            trip("emil_trip", "邮箱不合法!!");
            return false;
        } else {
            trip("emil_trip", "OK!!");
        }
    }
 
    function submitT() {
        if (checkForm()) {
            return true;
        } else {
            return false;
        }
    }
</script>
</html>
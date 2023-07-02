<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="thirdpage.jsp">
        <table>
            <tr>
                <td>性名</td>
                <td>
                    <input type="text" name="name" id="">
                </td>
            </tr>

            <tr>
                <td>性别</td>
                <td>
                    <input type="radio" name="gender" value="male" id="gender_male" checked>
                    <label for="fender_male">男</label>
                    <input type="radio" name="gender" value="female" id="gender_female">
                    <label for="gender_female">女</label>
                </td>
            </tr>

            <tr>
                <td>报到证编码</td>
                <td>
                    <input type="text" name="registrationNumber" id="">
                </td>
            </tr>
			<%
				String idNumber = request.getParameter("idNumber");
			%>
            <tr>
                <td>身份证号码</td>
                <td>
                    <input type="text" name="idNumber" id="" disabled="disabled" value="<%=idNumber%>">
                </td>
            </tr>

            <tr>
                <td>毕业学校</td>
                <td>
                    <select name="nuiversity" id="">
                        <option value="第一中学">第一中学</option>
                        <option value="第二中学">第二中学</option>
                        <option value="第三中学">第三中学</option>
                    <select>
                </td>
            </tr>
            
            <tr>
                <td>所学专业</td>
                <td>
                    <select name="major" id="">
                        <option value="计算机网络管理">计算机网络管理</option>
                        <option value="计算机应用技术">计算机网络管理</option>
                        <option value="计算机科学与技术">计算机网络管理</option>
                    <select>
                </td>
            </tr>

            <tr>
                <td>学历层次</td>
                <td>
                    <select name="education" id="">
                        <option value="大专">大专</option>
                        <option value="高中及以下">高中及以下</option>
                    <select>
                </td>
            </tr>

            <tr>
                <td>就业情况</td>
                <td>
                    <select name="employment" id="">
                        <option value="以就业">以就业</option>
                        <option value="暂未就业">暂未就业</option>
                        <option value="创业">创业</option>
                        <option value="升学">升学</option>
                    <select>
                </td>
            </tr>

            <tr>
                <td colspan="2"><input type="submit" name="" id="" value="确认报到"></td>
            </tr>
        </table>
    </form>
</body>
</html>
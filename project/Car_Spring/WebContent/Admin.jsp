<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
         <%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<title></title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<meta http-equiv="X-UA-Compatible" content="ie=edge">
		<link rel="stylesheet" href="./bootstrap/css/bootstrap.min.css">
		<script src="./bootstrap/js/jquery.min.js"></script>
		<script src="./bootstrap/js/bootstrap.min.js"></script>
		<!-- 样式 -->
		<link rel="stylesheet" href="css/home.css" />
		<link rel="stylesheet" href="css/layout.css" />
		<link rel="stylesheet" href="css/reset.css" />
		
		
<style>
    #img_td{
       width:100px;
    }
    #img_car{
      width:100%;
    }
    
</style>

<script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
<script type="text/javascript">
      $(function(){
    	  /* 模糊查询 */
    	  $("#chax").click(function () {
			 var type = $("#inputName").val();
  		     window.location.href="selectCarAllByName.do?type="+type; 
           }); 
    	   /* 删除 */	  
    	  $(document).on("click",".delete",function(){
  			if(confirm("您确定要删除该信息吗？")){
  				var id = $(this).parent().parent().parent().children().eq(0).html();
  				window.location.href="DeleteCarAllByIdAdmin?id="+id;
  			}
  			/* 修改修改 */
        	$(document).on("click",".update",function(){
        		if(confirm("您确定要修改该信息吗？")){
		            var id = $(this).parent().parent().parent().children().eq(0).html();
		            window.location.href="selectByIdCarall.do?id="+id;
        		}
             });
  		});
      });
</script>
	</head>
	<body>
		<header>
			<!-- 导航栏 -->
			<div style="position: initial;width: 100%;">
				<div align="center" class="grid" id="header_div" class="grid" style="background-color: #000000;height:80px;line-height:80px;">
					<ul class="nav-pills" style="margin-left:300px;">
					    <li><img src="img/logo.png" style="width: 90%;" /></li>
					    <li><h1 style="color:white;">车辆数据资源管理系统</h1></li>
					</ul>
					<ul class="nav-pills">
						<li>
							<form action="index.jsp">
							    <img src="img/Tc.png"  style="width:1.5%;margin-left:-20px;position: absolute;margin-top:30px;"/>
							    <form action=""><button id="but_but" class="btn " type="submit">退出</button></form>
							</form>
						</li>
					</ul>
				</div>
			</div>

		</header>
		<!-- 中部-->
		<section>
			<div class="container" style="width: 100%;">
				<div class="row clearfix">
					<!--管理员的界面-->
					<div class="col-md-4 column" style="background-color: grey;height:665px;width: 150px;color: white;">
						<ul style="line-height: 40px;">
							<li>
								<img src=""/><h4>管理员登录</h4>
							</li>
							<li>
								<form action="selectSAllCarAll.do"><button id="but_but1" class="btn " type="submit"><a href="#">车辆管理</a></button></form>
							</li>
							<li>
								<form action="selectAllDriverAdmin.do"><button id="but_but1" class="btn " type="submit"><a href="#">专车司机</a></button></form>
							</li>
							<li>
								<form action="selectAllAdminClient.do"><button id="but_but1" class="btn " type="submit"><a href="#">客户案例</a></button></form>
							</li>
							<li>
								<form action="selectAllCont.do"><button id="but_but1" class="btn " type="submit"><a href="#">客户管理</a></button></form>
							</li>
						</ul>
					</div>
					<div class="col-md-8 column">
						<h2>数据资源管理系统</h2>
					</div>
					<div class="col-md-8 column">
						资料查询：<input id="inputName" type="text" placeholder="请输入相关字眼" style="border: 2px solid gainsboro;border-radius: 5px;height: 30px;"/>
						<input id="chax" type="button" value="查询" class="btn btn-primary"/>
					</div>
					<div class="col-md-8 column">
						<!-- <button type="button" class="btn btn-primary">添加</button> -->
					</div><br/>
				<!-- 获取数据库的表格 -->
				<div style="width: 1535px;margin: 0px auto;background-color: white;height: 620px;">
					<div class="col-md-8 column">
						<table style="text-align: center;" align="center" width="1180px" border="1" cellpadding="0" cellspacing="0">
						        <tr style="background-color:#adff30;text-align: center;">
						          <th>车辆编号</th>
						          <th>图片展示</th>
						          <th>车辆名称</th>
						          <th>车辆类型</th>
						          <th>价格/每天</th>
						          <th>操作</th>
						        </tr>
						        <c:forEach var="carAlltList" items="${carAlltList }">
						           <tr>
						              <td>${carAlltList.id }</td>
						              <td id="img_td">
						                 <img id="img_car" src="${carAlltList.img }"/>
						              </td>
						              <td>${carAlltList.carName }</td>
						              <td>${carAlltList.type }</td>
						              <td>${carAlltList.price }</td>
						              <td>
						              	<button type="button" class="btn btn-success"><a href="#" class="update">修改</a></button>
						              	<button type="button" class="btn btn-info"><a href="#" class="delete">删除</a></button>
						              </td>
						           </tr>
						        </c:forEach>
						           <div style="width: 1180px;margin: 0px auto;" class="grid">
									     <div align="center" style="position: absolute;margin-top: 330px;">
												当前第 ${pageInfo.pageNum } 页，共 ${pageInfo.pages } 页 共${carAlltList.size()}条记录<br/>
												<a href="<%=basePath %>/selectSAllCarAll.do?page=1" style="color:blue;">首页</a>&emsp;
												<a href="<%=basePath %>/selectSAllCarAll.do?page=${pageInfo.pageNum-1 }" style="color:blue;">上一页</a>&emsp;
												<c:forEach items="${pageInfo.navigatepageNums }" var="p">
												    <a href="<%=basePath %>/selectSAllCarAll.do?page=${p }"  style="color:blue;">${p }</a>&nbsp;
												</c:forEach>
												<a href="<%=basePath %>/selectSAllCarAll.do?page=${pageInfo.pageNum+1 }" style="color:blue;">下一页</a>&emsp;
												<a href="<%=basePath %>/selectSAllCarAll.do?page=${pageInfo.pages }" style="color:blue;">尾页</a>&emsp;
								         </div>  
									</div>
						</table> 
					</div>
					</div>	
				</div>
			</div>
		</section>

	</body>
</html>

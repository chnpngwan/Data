<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en" class="login-content" data-ng-app="materialAdmin">
 <head>
  <meta charset="UTF-8"> 
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="Generator" content="EditPlus®">
  <meta name="Author" content="">
  <meta name="Keywords" content="">
  <meta name="Description" content="">
  <title>Material Admin</title>
  <!-- Vendor CSS -->
  <link href="css/material-design-iconic-font/css/material-design-iconic-font.min.css" rel="stylesheet" type="text/css">
  <!-- CSS -->
  <link href="css/app.min.1.css" rel="stylesheet" type="text/css">
 </head>
 <body   data-ng-controller="loginCtrl as lctrl" >
	<div style="width: 100%;">
	<style>
	#l-login{
		position:absolute;top: 20%;left: 31%;
		color:white;
		background: rgba(255,255,255,0.2);	
		}
	
  @media screen and (max-height: 982px) {

        #l-login{
            position:absolute;top: 20%;left: 31%;	 
        }

    }
     	@media screen and (min-height: 1024px) {

        #l-login{
            position:absolute;top: 15%;left: 31%;	 
        }
        @media screen and (min-height: 1272px) {

        #l-login{
            position:absolute;top: 10%;left: 31%;	 
        }

    }
	</style>
		<video style="position: absolute;top: 0;z-index: 0;" src="MV/YOUTH.mp4" width="100%"  autoplay="autoplay" loop="loop" muted="muted"></video>
		<img alt="" src="images/logo1.png" style="position: absolute;top: 50px;margin-left: 44%;" width="90px;">
		<div class="lc-block" id="l-login"   data-ng-class="{'toggled':lctrl.login === 1}">
		
    	<h1 class="lean" style="color: white;">login</h1>
		
		<form action="login.do" name="loginform" method="post">
		<h3 align="center" style="color: red;">${loginMsg }</h3>
    	<div class="input-group m-b-20">
    		<span class="input-group-addon">
    			<i class="zmdi zmdi-account"></i>
    		</span>
    		<div class="fg-line">
    			<input type="text" name="username" class="form-control" placeholder="Username" regex="^\w{3,16}$"/>
    		</div>
    	</div>

        <div class="input-group m-b-20">
    		<span class="input-group-addon">
    			<i class="zmdi zmdi-male"></i>
    		</span>
    		<div class="fg-line">
    			<input type="password" name="password" class="form-control" placeholder="Password" regex="^\w+"/>
    		</div>
    	</div>
    	<div>没有账号<a href="register.jsp">注册一个</a></div>
    	</form>
    	<div class="clearfix"></div>
    	

        
    	<a href="" id="loginbtn" class="btn btn-login btn-danger btn-float">
    		<i class="zmdi zmdi-arrow-forward"></i>
    	</a>
        
    </div>
    
    <div class="lc-block" id="l-register" data-ng-class="{ 'toggled': lctrl.register === 1 }" data-ng-if="lctrl.register === 1">
    	<h1 class="lean">Azrael</h1>

    	<div class="input-group m-b-20">
    		<span class="input-group-addon">
    			<i class="zmdi zmdi-account"></i>
    		</span>
    		<div class="fg-line">
    			<input type="text" class="form-control" placeholder="Username" regex="^\w{3,16}$"/>
    		</div>
    	</div>

        <div class="input-group m-b-20">
    		<span class="input-group-addon">
    			<i class="zmdi zmdi-email"></i>
    		</span>
    		<div class="fg-line">
    			<input type="text" class="form-control" placeholder="Email Address" regex="^\w+@\w+\.[a-zA-Z]+(\.[a-zA-Z]+)?$"/>
    		</div>
    	</div>

        <div class="input-group m-b-20">
    		<span class="input-group-addon">
    			<i class="zmdi zmdi-male"></i>
    		</span>
    		<div class="fg-line">
    			<input type="password" class="form-control" placeholder="Password" regex="^\w+"/>
    		</div>
    	</div>
    	
    	<div class="clearfix"></div>
    	
    	<div class="checkbox">
    		<label>
    			<input type="checkbox" value=""/>
    			<i class="input-helper"></i>
    			接受许可协议
    		</label>
    	</div>
    	
    	<a href=""  class="btn btn-login btn-danger btn-float"><i class="zmdi zmdi-arrow-forward"></i></a>
    
    	<ul class="login-navigation">
	      <li data-block="#l-login" class="bgm-green" data-ng-click="lctrl.register = 0; lctrl.login = 1">Login</li>
	      <li data-block="#l-forget-password" class="bgm-orange" data-ng-click="lctrl.register = 0; lctrl.forgot = 1">Forgot Password?</li>
	    </ul>
    </div>

    <div class="lc-block" id="l-forget-password" data-ng-class="{ 'toggled': lctrl.forgot === 1 }" data-ng-if="lctrl.forgot === 1">
    	<h1 class="lean">Azrael</h1>
    	<p class="text-left">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla eu risus. Curabitur commodo lorem fringilla enim feugiat commodo sed ac lacus.</p>
    	<div class="input-group m-b-20">
	      <span class="input-group-addon"><i class="zmdi zmdi-email"></i></span>
	      <div class="fg-line">
	        <input type="text" class="form-control" placeholder="Email Address" regex="^\w+@\w+\.[a-zA-Z]+(\.[a-zA-Z]+)?$"/>
	      </div>
	    </div>
	
	    <a href="" class="btn btn-login btn-danger btn-float"><i class="zmdi zmdi-arrow-forward"></i></a>
	
	    <ul class="login-navigation">
	      <li data-block="#l-login" class="bgm-green" data-ng-click="lctrl.forgot = 0; lctrl.login = 1">Login</li>
	      <li data-block="#l-register" class="bgm-red" data-ng-click="lctrl.forgot = 0; lctrl.register = 1">Register</li>
	    </ul>
    </div>
	</div>

    
 </body>
 	
 	<script src="http://www.jq22.com/jquery/2.1.1/jquery.min.js"></script>
	<!-- Angular -->
	<script src="js/bower_components/angular/angular.min.js"></script>
	<script src="js/bower_components/angular-resource/angular-resource.min.js"></script>
	<script src="js/bower_components/angular-animate/angular-animate.min.js"></script>
	
	
	<!-- Angular Modules -->
	<script src="js/bower_components/angular-ui-router/release/angular-ui-router.min.js"></script>
	<script src="js/bower_components/angular-loading-bar/src/loading-bar.js"></script>
	<script src="js/bower_components/oclazyload/dist/ocLazyLoad.min.js"></script>
	<script src="js/bower_components/angular-bootstrap/ui-bootstrap-tpls.min.js"></script>
	
	<!-- Common js -->
	<script src="js/bower_components/angular-nouislider/src/nouislider.min.js"></script>
	<script src="js/bower_components/ng-table/dist/ng-table.min.js"></script>
	
	<!-- Placeholder for IE9 -->
	<!--[if IE 9 ]>
	    <script src="js/bower_components/jquery-placeholder/jquery.placeholder.min.js"></script>
	<![endif]-->
	<!-- App level -->
	<script src="js/app.js"></script>
	<script src="js/controllers/main.js"></script>
	<script src="js/controllers/ui-bootstrap.js"></script>
	
	
	<!-- Template Modules -->
	<script src="js/modules/form.js"></script>
	<script type="text/javascript" src="js/jquery-3.6.0.min.js"></script>
	<script type="text/javascript">
	$(function () {
		$(document).on("click","#loginbtn",function(){
			var username=$("input[name='username']").val().trim()
			var password=$("input[name='password']").val().trim()
			if(username==''){
				alert("请输入用户名！")
				return
			}
			if(password==''){
				alert("请输入密码！")
				return
			}
			document.loginform.submit()
		})
	})
	</script>
</html>
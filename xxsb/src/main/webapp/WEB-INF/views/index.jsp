<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-CN">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<script src="${APP_PATH}/static/js/jQuery-3.3.1.js"></script>

<link href="${APP_PATH}/static/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">
<script src="${APP_PATH}/static/bootstrap/js/bootstrap.min.js"></script>
<title>信息上报</title>

</head>
<body>
	<h1>信息上报</h1>
	<div>
		<!-- Nav tabs -->
		<ul class="nav nav-tabs" role="tablist">
			<li role="presentation" class="active"><a href="#username"
				aria-controls="username" role="tab" data-toggle="tab">用户名登陆</a></li>
			<li role="presentation"><a href="#email" aria-controls="email"
				role="tab" data-toggle="tab">邮箱登陆</a></li>
		</ul>

		<!-- Tab panes -->
		<div class="tab-content">
			<div role="tabpanel" class="tab-pane active" id="username">
				<form action="${APP_PATH}/user/login" method="POST">
					<div class="form-group">
						<label for="username">用户名</label> <input type="text"
							class="form-control" id="username_input" placeholder="请输入用户名"
							name="username" value="${name }">
					</div>
					<div class="form-group">
						<label for="password">密码</label> <input type="password"
							class="form-control" id="username_password_input" name="password"
							placeholder="请输入密码">
					</div>
					<button type="submit" class="btn btn-default"
						id="username_login_btn">登陆</button>
					<button type="" class="btn btn-default" id="username_reg_btn">注册</button>
				</form>
			</div>
			<div role="tabpanel" class="tab-pane" id="email">
				<form>
					<div class="form-group">
						<label for="email">邮箱</label> <input type="text"
							class="form-control" id="email_input" placeholder="请输入邮箱">
					</div>
					<div class="form-group">
						<label for="password">密码</label> <input type="password"
							class="form-control" id="email_password_input"
							placeholder="请输入密码">
					</div>
					<button type="" class="btn btn-default" id="email_login_btn">登陆</button>
					<button type="" class="btn btn-default" id="email_reg_btn">注册</button>
				</form>
			</div>
		</div>
	</div>

	<c:if test="${message!=null}">
		<script type="text/javascript">
			alert("${message}");
		</script>

	</c:if>
</body>
<!--  -->

</html>
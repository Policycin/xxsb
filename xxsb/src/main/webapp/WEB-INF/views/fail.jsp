<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
     
     
%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript">
 
 
setTimeout("javascript:location.href='http://localhost:8080/xxsb/index.jsp'", 3000);
</script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登陆结果</title>
</head>
<body>
<h1>登陆失败</h1>
</body>
</html>
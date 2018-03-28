<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'index.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
</head>

<body>
	请添加简历
	<br>
	<form action="add" method="post">
		姓名: <input type="text" name="name" /> <br />性别: <input
			type="text" name="sex" /><br /> 年龄: <input type="text"
			name="username" /> <br />所在公司: <input type="text" name="sex" /><br />
		入职时间: <input type="text" name="username" /> <br />学历: <input
			type="text" name="sex" /><br />职位: <input type="text"
			name="username" /> <br />薪资: <input type="text" name="sex" /><br />
		<input type="submit" value="提交" />
	</form>
</body>
</html>

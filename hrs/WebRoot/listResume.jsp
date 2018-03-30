<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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


	<a href="addResume.jsp">添加简历</a>
	<br>
	<br> 以下是系统库中已有的简历列表.
	<br>
	<br>


	<table border="1">
		<tr>
			<td>姓名</td>
			<td>性别</td>
			<td>年龄</td>
			<td>所在公司</td>
			<td>入职时间</td>
			<td>学历</td>
			<td>职位</td>
			<td>薪资</td>
			<td>更新时间</td>
		</tr>
		<c:forEach items="${list}" var="user" varStatus="vs">
			<tr>
				<td align="center">${user.name}</td>
				<td align="center">${user.sex}</td>
				<td align="center">${user.age}</td>
				<td align="center">${user.company}</td>
				<td align="center">${user.entry_date}</td>
				<td align="center">${user.education}</td>
				<td align="center">${user.position}</td>
				<td align="center">${user.salary}</td>
				<td align="center">${user.update_date}</td>

			</tr>
		</c:forEach>
	</table>




	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>

</body>
</html>

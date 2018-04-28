<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>List User</title>
</head>
<body>
	<h3>UserList</h3>
  	<a href="<%=path %>/user/addPage">Add User</a><br/>
	<table border="1" width="70%">
   		<tr>
   			<td>Name</td>
   			<td>Age</td>
   			<td>Delete</td>
   			<td>Update</td>
   		</tr>
   		<c:forEach items="${users}" var="user">
	   		<tr>
	   			<td>${user.name }</td>
	   			<td>${user.age }</td>
	   			<td><a href="#">Delete</a></td>
	   			<td><a href="#">Update</a></td>
	   		</tr>
   		</c:forEach>
   </table>
</body>
</html>
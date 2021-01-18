<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/views/defs/taglibs.jsp"%>  


${exceptionMsg}

<h1>UserController.java - userList.jsp</h1>		
<c:forEach items="${users}" var="user">
	<p>${user.id}-${user.nombre}-${user.email}</p>			
</c:forEach>		
	

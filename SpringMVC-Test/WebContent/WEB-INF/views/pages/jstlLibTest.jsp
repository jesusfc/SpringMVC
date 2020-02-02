<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/views/defs/taglibs.jsp"%>  

<style>
	body {background-color: ffc107;}
	h1   {color: blue;}
	p    {color: red;}
</style>

<h1 style="color:red !important;">jstlLibTest.jsp</h1> 	
<h1>-------------------------------------------------------------------------------------</h1>

	<c:forEach items="${arrayList}" var="item" varStatus="loop">		
    	<p>
    		-${item}-${loop.index}-${loop.index%2!=0}
    		<c:if test="${loop.index%2==0}">PAR</c:if>
    		<c:if test="${loop.index%2!=0}">IMPAR</c:if>
    	</p>
	</c:forEach>
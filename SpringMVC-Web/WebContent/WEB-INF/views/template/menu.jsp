<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/views/defs/taglibs.jsp"%>  

<%-- ${view} --%>

<h3>menu.jsp</h3>		
<p>

	<%-- HOME --%>
	<c:choose>
		<c:when test="${view == 'home'}"><spring:message code="view.home" /></c:when>
		<c:otherwise><a href="${ctx}"><spring:message code="view.home" /></a></c:otherwise>
	</c:choose>
	--
	<%-- JSTL y sus LIBRERIAS TEST --%>
	<c:choose>
		<c:when test="${view == 'jstlLibTest'}"><spring:message code="view.jstlLibTest" /></c:when>
		<c:otherwise><a href="${ctx}/jstlLibTest.html"><spring:message code="view.jstlLibTest" /></a></c:otherwise>
	</c:choose>
	--
	<%-- HTML CSS TEST --%>
	<c:choose>
		<c:when test="${view == 'htmlCssTest'}"><spring:message code="view.htmlCssTest" /></c:when>
		<c:otherwise><a href="${ctx}/htmlCssTest.html"><spring:message code="view.htmlCssTest" /></a></c:otherwise>
	</c:choose>
	--
	<%-- USER TEST DATA BASE --%>
	<c:choose>
		<c:when test="${view == 'userList'}"><spring:message code="view.userlist" /></c:when>
		<c:otherwise><a href="${ctx}/loadUsers.html"><spring:message code="view.userlist" /></a></c:otherwise>
	</c:choose>
	--
	<%-- Pruebas de formularios y validación --%>
	<c:choose>
		<c:when test="${view == 'checkForm'}"><spring:message code="view.checkForm" /></c:when>
		<c:otherwise><a href="${ctx}/checkForm.html"><spring:message code="view.checkForm" /></a></c:otherwise>
	</c:choose>
	--
	<%-- Angular JS --%>
	<c:choose>
		<c:when test="${view == 'angularTest'}"><spring:message code="view.angularjs" /></c:when>
		<c:otherwise><a href="${ctx}/angularJS.html"><spring:message code="view.angularjs" /></a></c:otherwise>
	</c:choose>
	--
	<%-- Bootstrap --%>
	<c:choose>
		<c:when test="${view == 'bootstrapTest'}"><spring:message code="view.bootstrapTest" /></c:when>
		<c:otherwise><a href="${ctx}/bootstrapTest.html"><spring:message code="view.bootstrapTest" /></a></c:otherwise>
	</c:choose>
	
</p>
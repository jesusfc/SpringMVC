<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/defs/taglibs.jsp"%>


<h3>header.jsp</h3>
<p>

	<c:set var="language"><spring:message code="language.spanish" /></c:set>
	<c:set var="changeLang">en</c:set>
	<c:if test="${lang eq 'en'}">
		<c:set var="language"><spring:message code="language.english" /></c:set>
		<c:set var="changeLang">es</c:set>
	</c:if>

	<spring:message code="language.text" />: ${language} (${lang}) - <spring:message code="label.changeLanguageTo" />
	<a href="${param.view}?lang=${changeLang}"><spring:message code="language.changeLanguageTo" /></a>
</p>

<spring:message code="app.name" />






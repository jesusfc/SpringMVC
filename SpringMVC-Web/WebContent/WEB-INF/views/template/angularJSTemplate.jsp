<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<%-- CONTEXTO --%>
<c:set var="ctx" value="${(!empty pageContext.request.contextPath && pageContext.request.contextPath != '/' ) ? pageContext.request.contextPath : '' }"  scope="application" />
<c:set var="lang" value="${pageContext.response.locale}" scope="application" />

<!--[if lt IE 7]> <html lang="en" ng-app="angularApp" class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]> <html lang="en" ng-app="angularApp" class="no-js lt-ie9 lt-ie8"> <![endif] -->
<!--[if IE 8]> <html lang="en" ng-app="angularApp" class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!--> <html lang="en" ng-app="angularApp" class="no-js"> <!--<![endif]-->

<head>	
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">	
	<title>Spring MVC - AngularJs Test</title>
	<link rel="stylesheet" type="text/css" href="${ctx}/css/angularjs.css" ></link>		
			
	<!-- Angular Lib -->
	<script  type="text/javascript" charset="UTF-8" src="${ctx}/js/libs/angular-1.7.3.min.js"></script>
	
	<!-- Angular Page -->		
	<tiles:insertAttribute name="angularJSController" ignore="true"/>			
	<tiles:insertAttribute name="angularJSService" ignore="true"/>
		
</head>
 
<body>

		<header id="header">
			<tiles:insertAttribute name="header" />
		</header>
		<p>---------------------------------------------------------------------------------------------------------------------------------------------------</p>
		<section id="sidemenu">
			<tiles:insertAttribute name="menu" />
		</section>
		<p>---------------------------------------------------------------------------------------------------------------------------------------------------</p>	
		<section id="site-content">
			<tiles:insertAttribute name="body" />
		</section>
		<p>---------------------------------------------------------------------------------------------------------------------------------------------------</p>
		<footer id="footer">
			<tiles:insertAttribute name="footer" />
		</footer>
</body>
</html>
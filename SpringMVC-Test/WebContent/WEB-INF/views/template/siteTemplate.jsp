<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<%-- CONTEXTO --%>
<c:set var="ctx" value="${(!empty pageContext.request.contextPath && pageContext.request.contextPath != '/' ) ? pageContext.request.contextPath : '' }"  scope="application" />
<c:set var="lang" value="${pageContext.response.locale}" scope="application" />

<!doctype html>
<html lang="en">

<head>

	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
		
	<title>Spring MVC - Test</title>
	
	<!-- CSS -->
	<link rel="stylesheet" type="text/css" href="${ctx}/css/styles.css"></link>
	
	<!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">	
	
	 <!-- JavaScript -->   
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
	
			
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
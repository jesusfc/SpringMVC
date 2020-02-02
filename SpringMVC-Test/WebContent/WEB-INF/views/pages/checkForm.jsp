<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/views/defs/taglibs.jsp"%>  

<style>
    .error {
        color: red; font-weight: bold; font-size: 12px;
    }
</style>

	<h1>checkForm.jsp</h1>		

	<form:form method="POST" modelAttribute="user">
	    <table>
	        <tr>
	            <td><form:label path="nombre">Name</form:label></td>
	            <td><form:input path="nombre"/></td>
	            <td><form:errors path="nombre" cssClass="error" /></td>
	        </tr>
	        <tr>
	            <td><form:label path="edad">Edad</form:label></td>
	            <td><form:input path="edad"/></td>
	            <td><form:errors path="edad" cssClass="error" /></td>
	        </tr>
	        <tr>
	            <td><form:label path="email">Email</form:label></td>
	            <td><form:input path="email"/></td>
	            <td><form:errors path="email" cssClass="error" /></td>
	        </tr>
	        <tr>
	            <td><input type="submit" value="Submit"/></td>
	        </tr>
	    </table>
	</form:form>
	
	<c:forEach items="${users}" var="user">
		<p><b>Id:</b> ${user.id} <b>- Name:</b> ${user.nombre} <b>- Edad:</b> ${user.edad} <b>- Email:</b> ${user.email}</p>			
	</c:forEach>		
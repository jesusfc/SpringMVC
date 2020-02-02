<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/views/defs/taglibs.jsp"%>  


<h1 style="color:red !important;">angularJSTest.jsp</h1> 	

<h1>-------------------------------------------------------------------------------------</h1>

<div ng-controller="myCtrl">

	<input type="hidden" ng-init="hiddenName='hiddenvalue'">
	First Name: <input type="text" ng-model="firstName"><br>
	Last Name: <input type="text" ng-model="lastName"><br>
	<br>
	Full Name: {{firstName + " " + lastName + " " + hiddenName}}
</div>

<p>*************************************************************************</p>

<div ng-controller="TodosLosLibrosCtrl">	
	 <div class="filtro">
        <span class="buscarLibros">Buscar libros:</span> 
        <input ng-model="libroBuscado" class="filtroLibros">
    </div> 

     <table class="tablaLibros">
         <tr>
             <th>Título</th>
             <th>Autor</th>
         </tr>
        <tr ng-repeat="libro in libros | filter:libroBuscado">
            <td>{{libro.titulo}}</td>
            <td>{{libro.autor}}</td>
        </tr>
    </table>	
</div>

<p>*************************************************************************</p>

<div ng-app>
  <h1 ng-bind="'Binding ' + message"></h1>
  <input type="text" ng-model="message" ng-init="message = 'test'">
  <p ng-bind="message"></p>
  <p ng-bind="message + message"></p>
  <p ng-bind="::message === 'hello'"></p>
  <p ng-bind="1 + 2"></p>
</div>

<p>*************************************************************************</p>

<div ng-controller="ConversorController as conversor">

	<h1>Conversor Km/Millas</h1>

	Millas a Km -> <input type="text" ng-model="conversor.millas">
	<button type="submit" ng-click="conversor.convertirMillasKm()" class="btn btn-primary">
	   Convertir
	</button>
	<span id="kilometros" class="lead" ng-show="conversor.isValid()">
	   {{conversor.kilometros | number:2}} kilometros
	</span>
	<br /><br />
	Km a Millas -> <input type="text" ng-model="conversor.kilometros">
	<button type="submit" ng-click="conversor.convertirKmMillas()" class="btn btn-primary">
	   Convertir
	</button>
	<span id="millas" class="lead" ng-show="conversor.isValid()">
	   {{conversor.millas | number:2}} millas
	</span>
</div>

<p>*************************************************************************</p>


<div ng-controller="UserController as userCtrl">

	<h1>Listado usuarios (servicio Rest)</h1>
	
	 <div class="filtro">
        <span class="buscarLibros">Buscar usuario:</span> 
        <input ng-model="userBuscado" class="filtroLibros">
    </div> 
	
	<table class="tablaLibros">
		<tr>
			<th>Id</th>
        	<th>Nombre</th>
            <th>Apellido</th>
            <th>Edad</th>
            <th>Soltero</th>
            <th>Dni</th>
            <th>Telefono</th>
        	<th>Email</th>
        </tr>
        <tr data-ng-repeat="user in userCtrl.user | filter:userBuscado">
        	<td>{{user.id}}</td>
            <td>{{user.nombre}}</td>
            <td>{{user.apellido}}</td>
            <td>{{user.edad}}</td>
            <td>{{user.soltero}}</td>
            <td>{{user.dni}}</td>
            <td>{{user.telefono}}</td>
            <td>{{user.email}}</td>                       
        </tr>
    </table>
    
	<p>******* Busqueda por Id -> Id = 2 ************************************************************</p>
	
	<table class="tablaLibros">
		<tr>
			<th>Id</th>
        	<th>Nombre</th>
            <th>Apellido</th>
            <th>Edad</th>
            <th>Soltero</th>
            <th>Dni</th>
            <th>Telefono</th>
        	<th>Email</th>
        </tr>
        <tr data-ng-repeat="user in userCtrl.userId">
        	<td>{{user.id}}</td>
            <td>{{user.nombre}}</td>
            <td>{{user.apellido}}</td>
            <td>{{user.edad}}</td>
            <td>{{user.soltero}}</td>
            <td>{{user.dni}}</td>
            <td>{{user.telefono}}</td>
            <td>{{user.email}}</td>                       
        </tr>
    </table>
	
	
</div>	


<h1>-------------------------------------------------------------------------------------</h1>
https://www.concretepage.com/angular-2/angular-2-ngif-example
https://desarrolloweb.com/manuales/manual-angular-2.html
<p>https://www.w3schools.com/angular/angular_examples.asp</p>
https://www.biko2.com/angularjs/como-construir-aplicaciones-web-angular-mantenibles-y-escalables/


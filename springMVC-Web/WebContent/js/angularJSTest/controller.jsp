<%@ include file="/WEB-INF/views/defs/taglibs.jsp"%>  

<script type="text/javascript">
//<![CDATA[
	
'use strict';

var app = angular.module('angularApp', []);

app.controller('myCtrl', function($scope) {
    
	$scope.firstName= "John";
    $scope.lastName= "Doe";
    
}).controller('ConversorController', function() {
    return new Conversor();
    
}).controller('TodosLosLibrosCtrl', function ($scope) {
	
    $scope.libros = [
        {'titulo': 'The design of every day things', 'autor': 'Don Norman'},
        {'titulo': 'El nombre del viento', 'autor': 'Patrik Rufus'},
        {'titulo': 'Game of Thrones', 'autor': 'R.R. Martin'}
    ];
    
}).controller('UserController', function(userService) {

	var seft = this;	

	this.getUserList = function() {
		userService.findAll(function(response) {
			seft.user = response.data;
	    });		
	}	
	
	this.getUserId = function() {
		userService.findUserById('2', function(response) {
			seft.userId = response.data;
	    });
	}	
	
	this.getUserId();
	
	this.getUserList();
});

/**********************************************/
/************** FUNCTIONS *********************/
/**********************************************/
function Conversor() {
	
    this.millas = NaN;
    this.kilometros = NaN;
    
    this.convertirMillasKm = function() {
        this.kilometros = this.millas * 1.60934;
    };
    
    this.convertirKmMillas = function() {
        this.millas = this.kilometros * 0.621371;
    };
    
    this.isValid = function(form) {
        return !isNaN(this.kilometros);
    };
    
}


//]]>
</script>
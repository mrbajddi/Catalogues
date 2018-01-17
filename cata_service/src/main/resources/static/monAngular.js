var app = angular.module('MyApp', []);

app.controller('MyController', function($scope, $http) {
	$scope.pageProduits = null;
	
	// Simple GET request example:
	$http({
	  method: 'GET',
	  url: 'http://localhost:8080/produits'
	}).then(function successCallback(response) {
	    // this callback will be called asynchronously
	    // when the response is available
		$scope.pageProduits = response.data._embedded;
	  }, function errorCallback(response) {
	    // called asynchronously if an error occurs
	    // or server returns response with an error status.
		  console.log(response);
	  });
	
});
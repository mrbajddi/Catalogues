var app = angular.module('MyApp', []);

app.controller('MyController', function($scope, $http) {
	$scope.pageProduits = null;
	$scope.designation = "";
	$scope.pageCourante=0;
	$scope.size=5;
	$scope.pages=[];
	
	$scope.chercherProduits = function(){
		$scope.pageProduits = null;
		$scope.pageCourante = 0;
		$scope.pages=[];
		// Simple GET request example:
		$http({
		  method: 'GET',
		  url: 'http://localhost:8080/produits/search/byDesignation?designation='+ $scope.designation +'&page='+ $scope.pageCourante +'&size='+ $scope.size 
		}).then(function successCallback(response) {
		    // this callback will be called asynchronously
		    // when the response is available
			$scope.pageProduits = response.data._embedded;
			$scope.pageCourante = response.data.page.number;
			$scope.pages=new Array(response.data.page.totalPages);
		  }, function errorCallback(response) {
 			$scope.pageCourante = 0;
 			$scope.pages=[];
  		    // called asynchronously if an error occurs
		    // or server returns response with an error status.
			  console.log(response);
			  $scope.pageCourante = 0;
		  });
	};
 
	$scope.gotoPage = function(p){
		$scope.pageProduits = null;
		$scope.pageCourante=p;	
		$scope.pages=[];
		// Simple GET request example:
		$http({
		  method: 'GET',
		  url: 'http://localhost:8080/produits/search/byDesignation?designation='+ $scope.designation +'&page='+ $scope.pageCourante +'&size='+ $scope.size 
		}).then(function successCallback(response) {
		    // this callback will be called asynchronously
		    // when the response is available
			$scope.pageProduits = response.data._embedded;
			$scope.pageCourante = response.data.page.number;
			$scope.pages=new Array(response.data.page.totalPages);
		  }, function errorCallback(response) {
 			  $scope.pageCourante = 0;
 			  $scope.pages=[];
			// called asynchronously if an error occurs
		    // or server returns response with an error status.
			  console.log(response);
		  });
	};
 
});
var app = angular.module("geektic", ['ngRoute', 'GeekticCtrls']);

app.config(['$routeProvider', function($routeProvider) {
    $routeProvider.when('/', {controller : "listGeeks", templateUrl : 'partials/geekList.html'})
        .when('/interests', {controller : "listInterests", templateUrl : 'partials/interestsList.html'})
        .otherwise({redirectTo : "/"});
}])


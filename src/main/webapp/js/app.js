var app = angular.module("geektic", ['ngRoute']);

app.controller('HelloCtrl', function($scope, $http) {
    $http.get('/api/hello').success(function(helloMessage) {
        $scope.helloMessage = helloMessage;
    });

    $scope.loadFakeUsers = function() {
        $http.get('/api/users').success(function(user) {
           $scope.userList = user;
        }).error(function(data) {
            $scope.userlist = "A problem occurred";
        });
    };
});
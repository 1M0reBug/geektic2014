/**
 * Created by jordan on 29/06/15.
 */
'use strict';

var GeekCtrls = angular.module('GeekticCtrls', []);

GeekCtrls.controller('listGeeks', function($scope, $http, $location) {
    $scope.loadUsers = function() {
        $http.get('/api/users').success(function(user) {
            $scope.userList = user;
        }).error(function(data) {
            $scope.userlist = "A problem occurred";
        });
    };
    $scope.showDetails = function(user) {
        console.log('coucou !');
        $location.path('/' + user.id);
    };

    $scope.loadUsers();
});

GeekCtrls.controller('listInterests', function($scope, $http) {
    $scope.loadInterests = function() {
        $http.get('/api/interests').success(function(interests) {
            $scope.interests = interests;
        }).error(function(data) {
            $scope.interests = "A problem occurred";
        });
    };

    $scope.loadInterests();
});

GeekCtrls.controller('geekDetails', function($scope, $http, $routeParams) {
    $scope.loadUserDetails = function() {
        $http.get('/api/users/'+$routeParams.id).success(function(user) {
            $scope.user = user;
        }).error(function(data) {
           $scope.user = "A problem occurred";
        });
    }

    $scope.loadUserDetails();
});
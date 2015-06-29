/**
 * Created by jordan on 29/06/15.
 */
'use strict';

var GeekCtrls = angular.module('GeekticCtrls', []);

GeekCtrls.controller('listGeeks', function($scope, $http) {
    $scope.loadUsers = function() {
        $http.get('/api/users').success(function(user) {
            $scope.userList = user;
        }).error(function(data) {
            $scope.userlist = "A problem occurred";
        });
    };

    $scope.loadUsers();
});

GeekCtrls.controller('listInterests', function($scope, $http) {
    $scope.loadInterests = function() {
        $http.get('/api/interests').success(function(interests) {
            $scope.interests = interests;
        }).error(function(data) {
            $scope.interests = "A problem occured";
        });
    };

    $scope.loadInterests();
});
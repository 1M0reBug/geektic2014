/**
 * Created by jordan on 29/06/15.
 */
'use strict';

var GeekCtrls = angular.module('GeekticCtrls', []);

/* geekList.html */
GeekCtrls.controller('listGeeks', function ($scope, $http, $location) {
    $scope.selectedInterests = [];

    $scope.loadUsers = function () {
        $http.get('/api/users').success(function (user) {
            $scope.userList = user;
        }).error(function (data) {
            $scope.userlist = "A problem occurred";
        });
    };

    $scope.showDetails = function (user) {
        console.log('coucou !');
        $location.path('/' + user.id);
    };

    $scope.filterInterest = function (filter) {
        var url = (filter) ? '/api/interests/value/' + filter : '/api/interests';
        $http.get(url).then(function (interests) {
            $scope.interests = [];
            for (var interest in interests.data) {
                $scope.interests.push(interests.data[interest].value);
            }
        });
    };

    $scope.addElement = function (element) {
        $scope.query.interests = '';
        $scope.selectedInterests.push(element);
    };

    $scope.removeElement = function (element) {
        $scope.selectedInterests = $scope.selectedInterests.filter(function (value) {
            return value != element;
        });
    }

    $scope.searchSelectedInterests = function () {
        var interestsQueryString = $scope.selectedInterests.join(',');
        var gender = $scope.query.gender;
        var url = '';
        var baseUrl = '/api/users';
        if (interestsQueryString.length > 0) {
            url += baseUrl + '?interests=' + interestsQueryString;
        }
        if (gender == 'HOMME' || gender == 'FEMME') {
            if (url.length == 0) {
                url += basUrl + '?gender=' + gender;
            } else {
                url += '&gender=' + gender;
            }
        }
        if (url.length > 0) {
            $http.get(url).success(function (users) {
                $scope.userList = users;
            });
        }
    }

    $scope.loadUsers();
});

GeekCtrls.controller('listInterests', function ($scope, $http) {
    $scope.loadInterests = function () {
        $http.get('/api/interests').success(function (interests) {
            $scope.interests = interests;
        }).error(function (data) {
            $scope.interests = "A problem occurred";
        });
    };

    $scope.loadInterests();
});

GeekCtrls.controller('geekDetails', function ($scope, $http, $routeParams) {
    $scope.loadUserDetails = function () {
        $http.get('/api/users/' + $routeParams.id).success(function (user) {
            $scope.user = user;
        }).error(function (data) {
            $scope.user = "A problem occurred";
        });
    }

    $scope.loadUserDetails();
});
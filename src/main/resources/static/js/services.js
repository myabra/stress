'use strict';

var module = angular.module('demo.services', []);

demoApp.service("Service",
    function($http) {
        return {
            generateRandomFileData: function () {
                return $http.post("generateFileData");
            }

        }
    }
);
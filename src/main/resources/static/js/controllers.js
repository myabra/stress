'use strict';

var mainController = angular.module('demo.controllers', ["Service"]);

demoApp.controller("Controller",
    function($scope, Service) {
        $scope.url = '';
        $scope.fileName = '';
        $scope.fileContent = '';


        $scope.urlEntered = function () {
          if ($scope.url) {
              generateRandomFileData();
          }
        };


        function generateRandomFileData() {
            $scope.fileDataReceived = false;
            Service.generateRandomFileData().then(function (response) {
                $scope.fileName = response.data.fileName;
                $scope.fileContent = response.data.fileContent;
                $scope.fileDataReceived = $scope.fileName && $scope.fileContent;
            })
        }
    }
);
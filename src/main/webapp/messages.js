function fetch($scope, $http) {
    $http.get('http://localhost:8080//SpringData-GemFire-REST-1.0/rest/messages').
        success(function(data) {
            $scope.messages = data["_embedded"]["messages"];
        });
}
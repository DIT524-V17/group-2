//Script responsible for connecting to MySQL server
//Including necessary libraries
var express = require("express");         //Library for establishing connection
var mysql = require("mysql");             //MySQL library
var bodyParser = require("body-parser");  //Middleware used to extract body of an incoming request
var rest = require("./guardRest.js");     //File with the API
var app  = express();

function GuardRest(){
    var self = this;
    self.connectMysql();
};

//Connection info
GuardRest.prototype.connectMysql = function() {
    var self = this;
    //Enables caching and reusing connections
    var pool = mysql.createPool({
        connectionLimit   : 50,
        waitForConnection : true,
        host              : '129.16.155.11',
        user              : 'guard',
        password          : 'SiliconValley',
        database          : 'guard',
        debug             :  false
    });
    self.configureExpress(pool);
}

//Configures the URL route
GuardRest.prototype.configureExpress = function(pool) {
      var self = this;
      app.use(bodyParser.urlencoded({ extended: true }));
      app.use(bodyParser.json());
      var router = express.Router();
      app.use('/guard', router);
      var rest_router = new rest(router, pool);
      self.startServer();
}

//Starts the server
GuardRest.prototype.startServer = function() {
      app.listen(3000, function(){
          console.log("Connected");
      });
}

//Stops he server
GuardRest.prototype.stop = function(err) {
    console.log("Issue while connecting. ERROR: " + err);
    process.exit(1);
}

new GuardRest();
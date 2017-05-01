//Script responsible for connecting to MySQL server
//Including necessary libraries
//If changed the newest version should be uploaded to /etc/guardserver on skip server
//And run with the command 'pm2 start server.js'
var express = require("express");         //Library for establishing connection
var mysql   = require("mysql");           //MySQL library
var bodyParser  = require("body-parser"); //Middleware used to extract body of an incoming request
var auth = require("basic-auth");
var rest = require("./guardRest.js");     //File with the API
var app  = express();

function GuardRest(){
    var self = this;
    self.connectMysql();
};

//Connection info
GuardRest.prototype.connectMysql = function() {
    var self = this;
    var pool      =    mysql.createPool({
        connectionLimit : 100,
        host     : '129.16.155.11',
        user     : 'guard',
        password : 'SiliconValley',
        database : 'guard',
    });

    //Caches a connection to later reused
    pool.getConnection(function(err, connection){
        if(err) {
          self.stop(err);
        } else {
          self.configureExpress(connection);
        }
    });
}

//Configures the URL route
GuardRest.prototype.configureExpress = function(connection) {
      var self = this;
      app.use(bodyParser.urlencoded({ extended: true }));
      app.use(bodyParser.json());
      var router = express.Router();
      app.use(auth);
      app.use('/guard', router);
      app.all('/guard', auth);
      var rest_router = new rest(router, connection, auth);
      self.startServer();
}

//Message displayed in console when connected to server
GuardRest.prototype.startServer = function() {
      app.listen(3000, function(){
          console.log("Connected");
      });
}

//Message displayed in console when failed to connect to server
GuardRest.prototype.stop = function(err) {
    console.log("Issue while connecting. ERROR: " + err);
    process.exit(1);
}

new GuardRest();
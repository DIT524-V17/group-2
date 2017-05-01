//Script responsible for interaction with MySQL Database
//If changed the newest version should be uploaded to /etc/guardserver on skip server
//And run with the command 'pm2 start server.js'
var mysql = require("mysql");

function REST_ROUTER(router, connection) {
    var self = this;
    self.handleRoutes(router, connection);
}

REST_ROUTER.prototype.handleRoutes = function(router, connection) {
	
	//Command 'POST'
	//Adds new Traveller to DB
    router.post("/travellers", function(req, res){
        var query = "INSERT INTO travellers (email, password, admin_status) VALUES (?, ?, 0)";
        var table = [req.body.email, req.body.password];
        query = mysql.format(query, table);

        //JSON response
        connection.query(query, function(err, rows){
            if(err) {
                res.json({"Error" : true, 
                    "Message" : "MySQL Error while adding new Traveller"});
            } else {
                res.json({"Error" : false, 
                    "Message" : "Traveller Registered!"});
            }
        });
    });

    //Command 'GET'
    //Gets all Travellers from DB
    router.get("/travellers", function(req, res){
        var query = "SELECT * FROM travellers";
        query = mysql.format(query);

        //JSON response
        connection.query(query, function(err, rows){
            if(err) {
                res.json({"Error" : true, 
                	"Message" : "MySQLError while getting all travellers"});
            } else {
                res.json({"Error" : false, 
                	"Message" : "Success",
                	 "Travellers" : rows});
            }
        });
    });

    //Command 'GET'
    //Gets specific Traveller from DB	
    //Email must be included in route, because GET calls don't have a body,
    // and only email and password are known when users are signing in
    router.get("/travellers/:email", function(req, res){
        var query = "SELECT * FROM travellers WHERE email = ?";
        var table = [req.params.email];
        query = mysql.format(query, table);

        //JSON response
        connection.query(query,function(err, rows){
            if(err) {
                res.json({"Error" : true, 
                	"Message" : "MySQL Error while getting specific traveler"});
            } else {
                res.json({"Error" : false, 
                	"Message" : "Success", 
                	"Traveller" : rows});
            }
        });
    });

    //Command 'PUT'
    //Updates Traveler's password for specific email
    router.put("/travellers", function(req, res){
        var query = "UPDATE travellers SET password = ? WHERE email = ?";
        var table = [req.body.password, req.body.email];
        query = mysql.format(query, table);

        //JSON response
        connection.query(query,function(err, rows){
            if(err) {
                res.json({"Error" : true,
                 "Message" : "MySQL Error while updating traveller"});
            } else {
                res.json({"Error" : false,
                 "Message" : "Updated password for user: " + req.body.email});
            }
        });
    });

    //Command 'DELETE'
	//Deletes specific Traveller based on email
    router.delete("/travellers", function(req, res){
        var query = "DELETE FROM travellers WHERE email = ?";
        var table = [req.body.email];
        query = mysql.format(query, table);

        //JSON response
        connection.query(query, function(err, rows){
            if(err) {
                res.json({"Error" : true,
                 "Message" : "MySQL Error while deleting traveller"});
            } else {
                res.json({"Error" : false,
                 "Message" : "Deleted user " + req.body.email});
            }
        });
    });
}

module.exports = REST_ROUTER;
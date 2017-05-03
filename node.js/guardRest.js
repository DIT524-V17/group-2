//Script responsible for interaction with MySQL Database
var mysql = require("mysql");
var Auth = require('./authentication.js');

function REST_ROUTER(router, pool) {
    var self = this;
    self.handleRoutes(router, pool);
}

REST_ROUTER.prototype.handleRoutes = function(router, pool) {
	
	//Command 'POST'
	//Adds new Traveller to DB
    router.post("/travellers", Auth.BasicAuthentication, function(req, res){
        var query = "INSERT INTO travellers (email, password, admin_status) VALUES (?, ?, 0)";
        var table = [req.body.email, req.body.password];
        query = mysql.format(query, table);

        //Getting a connection from the pool
        pool.getConnection(function(err, connection){
            connection.query(query, function(err, rows){
                //Putting the connection back in the pool for later reuse
                connection.release();
                //JSON response
                if(err) {
                    res.json({"Error" : true, 
                    "Message" : "Error while adding new Traveller"});
                } else {
                    res.status(201).json({"Error" : false, 
                    "Message" : "Traveller Registered!"});
                }
            });
        });
    });

    //Command 'GET'
    //Gets all Travellers from DB
    router.get("/travellers", Auth.BasicAuthentication, function(req, res){
        var query = "SELECT * FROM travellers";
        query = mysql.format(query);

        //Getting a connection from the pool
        pool.getConnection(function(err, connection){
            connection.query(query, function(err, rows){
                //Putting the connection back in the pool for later reuse
                connection.release();
                //JSON response
                if(err) {
                    res.json({"Error" : true, 
                    "Message" : "Error while getting all Traveller"});
                } else {
                    res.json({"Error" : false, 
                    "Message" : "Traveller received",
                    "Travellers" : rows});
                }
            });
        });
    });

    //Command 'GET'
    //Gets specific Traveller from DB	
    router.get("/travellers/:email", Auth.BasicAuthentication, function(req, res){
        var query = "SELECT * FROM travellers WHERE email = ?";
        var table = [req.params.email];
        query = mysql.format(query, table);

        //Getting a connection from the pool
        pool.getConnection(function(err, connection){
            connection.query(query, function(err, rows){
                //Putting the connection back in the pool for later reuse
                connection.release();
                //JSON response                
                if(err) {
                    res.json({"Error" : true, 
                    "Message" : "Error while getting a Traveller"});
                } else {
                    res.json({"Error" : false, 
                    "Message" : "Traveller Receiced",
                    "Travellers" : rows});
                }
            });
        });
    });

    //Command 'PUT'
    //Updates Traveler's password for specific email
    router.put("/travellers", Auth.BasicAuthentication, function(req, res){
        var query = "UPDATE travellers SET password = ? WHERE email = ?";
        var table = [req.body.password, req.body.email];
        query = mysql.format(query, table);

        //Getting a connection from the pool
        pool.getConnection(function(err, connection){
            connection.query(query, function(err, rows){
                //Putting the connection back in the pool for later reuse
                connection.release();
                //JSON response
                if(err) {
                    res.json({"Error" : true, 
                    "Message" : "Error while updating password"});
                } else {
                    res.json({"Error" : false, 
                    "Message" : "Password updated"});
                }
            });
        });
    });

    //Command 'DELETE'
	//Deletes specific Traveller based on email
    router.delete("/travellers", Auth.BasicAuthentication, function(req, res){
        var query = "DELETE FROM travellers WHERE email = ?";
        var table = [req.body.email];
        query = mysql.format(query, table);

        //Getting a connection from the pool
        pool.getConnection(function(err, connection){
            //Putting the connection back in the pool for later reuse
            connection.query(query, function(err, rows){
                //Putting the connection back in the pool for later reuse
                connection.release();
                //JSON response
                if(err) {
                    res.json({"Error" : true, 
                    "Message" : "Error while deleting a Traveller"});
                } else {
                    res.json({"Error" : false, 
                    "Message" : "Traveller deleted!"});
                }
            });
        });
    });
}

module.exports = REST_ROUTER;
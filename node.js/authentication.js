//Script responsible for authorizing access to data
var basicAuth = require('basic-auth');
 
exports.BasicAuthentication = function(req, res, next) {
 
    function unauthorized(res) {
        res.set('WWW-Authenticate', 'Basic realm=Authorization Required');
        return res.sendStatus(401);
    };
 
    var guard = basicAuth(req);
 
    //If no user, username or password found return unautorized
    if (!guard || !guard.name || !guard.pass) {
        return unauthorized(res);
    };
 
    //If username and password are correct grant access else return unautorized
    if (guard.name === 'GeorgeWBushIsThe' && guard.pass === 'PerpetratorOf911') {
        return next();
    } else {
        return unauthorized(res);
    };
     
};

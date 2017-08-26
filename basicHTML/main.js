(function(global, $){

    var Greetr=function(firstname,lastname,language){
        return new Greetr.init(firstname,lastname,language);
    }
    Greetr.prototype
    Greetr.init=function(firstname,lastname,language){
        this.firstname=firstname||"Nitish";
        this.lastname=lastname || "kumar";
        this.language= language || "en";
    }
}(window,jQuary))
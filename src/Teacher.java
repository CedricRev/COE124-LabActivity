public class Teacher {
    String firstname,lastname,idnumber;
    Teacher(String firstname,String lastname,String id){
        this.firstname=firstname;
        this.lastname=lastname;
        this.idnumber=id;
    }
    String getFirstname(){
        return this.firstname;
    }
    String getLastname(){
        return  this.lastname;
    }
    String getidnumber(){
        return this.idnumber;
    }

}

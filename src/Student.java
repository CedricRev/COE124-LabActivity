public class Student {

    private String firstname, lastname, id_number;

    Student(String lastname, String firstname, String id_number) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.id_number = id_number;

    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getId_number() {
        return id_number;
    }

    public void setId_number(String id_number) {
        this.id_number = id_number;
    }
}

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Abunda", "Ariane Pearl", "2020-0291");
        Student s1 = new Student("Paragele", "Tracy", "2016-1123");
        System.out.println("Student Name: " + s1.getLastName() + ", " + s1.getFirstName());
        System.out.println("Teacher Name: " + t1.getLastName() + ", " + t1.getFirstName());


    }
}

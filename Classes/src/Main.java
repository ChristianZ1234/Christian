import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student christian = new Student("Christian ", 0);
        ArrayList<Course> courses = new ArrayList<>();
        System.out.println(christian.getFirstName());
        System.out.println(christian.getStudentID());
        System.out.println(christian.courses);


        Student joe = new Student("Joe ", 1);
        System.out.println(joe.getFirstName());
        System.out.println(joe.getStudentID());
        System.out.println(christian.courses);



    }
}

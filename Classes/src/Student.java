import java.util.ArrayList;

public class Student {

        String firstName;
        ArrayList<Course> courses = new ArrayList<>();
        public static int studentID = 0;
        public int personalID;

        Student(String firstName, int studentID) {
            this.firstName = firstName;
            studentID++;
            personalID = studentID;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public int getStudentID() {
            return personalID;
        }

        public void setStudentID(int studentID) {
            this.studentID = studentID;
        }

        public void addCourses(Course course){
            courses.add(course);
        }

        public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
        }

}


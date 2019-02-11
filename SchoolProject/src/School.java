import java.util.ArrayList;
// School class has a list for teachers, and students.
// Also shows principle and address of school.
public class School {
    ArrayList<Teacher> teachers = new ArrayList<>();
    ArrayList<Student> students = new ArrayList<>();
    String schoolName;
    String principleName;
    String address;
// Declare variables
    School(String schoolName, String principleName, String address) {
        this.schoolName = schoolName;
        this.principleName = principleName;
        this.address = address;

    }
// This is to set up our variables to a desired value

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setPrincipleName(String principleName) {
        this.principleName = principleName;
    }

    public String getPrincipleName() {
        return principleName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void deleteTeacher(int pos) {
        teachers.remove(pos);
    }

    public void deleteStudent(int pos) {
        students.remove(pos);
    }

    public ArrayList allTeachers() {
        return teachers;
    }

    public ArrayList allStudents() {
        return students;
    }

    public String toString() {
        return ("Teachers: " + this.allTeachers() + ".\n Students:" + this.allStudents());
    }
//Shows all Teachers and Students in the school
}

import java.util.ArrayList;

public class Course {
    String subjectNames;
    int studentGrade;
    int addedGrades;
    ArrayList grades = new ArrayList();

    Course(String subjectName, int studentGrade) {
        this.subjectNames = subjectNames;
        this.studentGrade = studentGrade;
    }


    public String getSubjectNames() {
        return subjectNames;
    }

    public void setSubjectName(String subjectNames) {
        this.subjectNames = subjectNames;
    }

    public String getNameAndGrade() {
        return subjectNames + studentGrade;
    }


    public int studentGradeAvg() {
        for (int i = 0; i < studentGrade; i++) {
            addedGrades += (int) grades.get(i);
        }
        return (addedGrades / grades.size());

    }

}
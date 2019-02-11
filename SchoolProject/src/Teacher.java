// Teacher class shows first name and last name of teacher.
// Shows the subject name that is assigned to the teacher.
public class Teacher {
    String firstName;
    String lastName;
    String subjectName;
// Declare variables
    Teacher(String firstName, String lastName, String subjectName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subjectName = subjectName;

    }
    // This is to set up our variables to a desired value

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return firstName + lastName;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String toString() {
        return "Name: " + getName()+ " Subject: " + subjectName;
    }
//Prints the name of the teacher and the subject name

}
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        School Windermere = new School("Windermere","Mr. Bob","3155 E. 27th Ave");
        Windermere.addStudent( new Student("a ", "1", 11));
        Windermere.addStudent( new Student("b ", "1", 11));
        Windermere.addStudent( new Student("c ", "1", 11));
        Windermere.addStudent( new Student("d ", "1", 11));
        Windermere.addStudent( new Student("e ", "1", 11));
        Windermere.addStudent( new Student("f ", "1", 11));
        Windermere.addStudent( new Student("g ", "1", 11));
        Windermere.addStudent( new Student("h ", "1", 11));
        Windermere.addStudent( new Student("i ", "1", 11));
        Windermere.addStudent( new Student("j ", "1", 11));

        Windermere.addTeacher( new Teacher("A ", "2","Math1"));
        Windermere.addTeacher( new Teacher("B ", "2","English1"));
        Windermere.addTeacher( new Teacher("C ", "2","Science1"));

        System.out.println(Windermere.allTeachers());
        System.out.println(Windermere.allStudents());

        Windermere.deleteStudent(2);
        Windermere.deleteTeacher(0);
        Windermere.deleteTeacher(1);


        System.out.println(Windermere.allStudents());
        System.out.println(Windermere.allTeachers());



        }


}


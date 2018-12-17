import javax.naming.Name;

public class Employee {
    public int Id;
    String firstName;
    String lastName;
    public int salary;

    public int getId(){
        return Id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return firstName + lastName;

    }

    public int getSalary() {
        return salary;
    }

    public void getSalary(int salary){
        this.salary = salary;
    }

    public int getAnnualSalary() {
        return salary*12;
    }

    public int raiseSalary(int percent){
        int newSalaray = (salary * percent) + salary;
        return newSalaray;
    }
    public String toString(){
        return "Employee[Id = " + Id + ", Name = " + firstName + lastName + ", Salary = " + salary + "]";
    }



}

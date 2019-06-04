package sample;

public class Friend {
    private String name;
    private String email;
    private String school;

    Friend(String name, String email, String school) {
        this.name = name;
        this.email = email;
        this.school = school;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getSchool() {
        return school;
    }
    @Override
    public String toString(){
        return name;
    }
}

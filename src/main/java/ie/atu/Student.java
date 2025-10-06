package ie.atu;

public class Student {

    String name;
    String email;
    String course;

    //Constructor
    public  Student()
    {
        System.out.println();
        this.name = "";
        this.email = "";
        this.course = "";
    }

    //Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    //Generated toString method that overrides the standard one
    @Override
    public String toString() {
        return "Name:'" + name + '\'' +
                ", Email:'" + email + '\'' +
                ", Course:'" + course + '\'' ;
    }
}


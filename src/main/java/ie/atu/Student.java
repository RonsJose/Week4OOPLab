package ie.atu;

public class Student {
    String name;
    String email;
    String studentID;

    public  Student()
    {
        System.out.println();
        this.name = "";
        this.email = "";
        this.studentID = "";
    }

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

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
}

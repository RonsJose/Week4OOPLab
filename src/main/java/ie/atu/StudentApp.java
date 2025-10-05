package ie.atu;
import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the number of students: ");

        System.out.println("Please enter your name: ");
        String name = sc.nextLine();
        System.out.println("Please enter your email: ");
        String email = sc.nextLine();
        System.out.println("Please enter your studentID: ");
        String studentID = sc.nextLine();

        Student student1= new Student();
        student1.setName(name);
        student1.setEmail(email);
        student1.setStudentID(studentID);
    }
}

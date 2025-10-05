package ie.atu;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class StudentApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student1;

        List<Student> studentsList = new ArrayList<Student>();

        int studentNum=0,count=0;
        System.out.println("Please enter the number of students: ");
        studentNum = sc.nextInt();
        sc.nextLine();

        while(count<studentNum)
        {
            System.out.println("Please enter your name: ");
            String name = sc.nextLine();
            System.out.println("Please enter your email: ");
            String email = sc.nextLine();
            System.out.println("Please enter your studentID: ");
            String studentID = sc.nextLine();

            student1= new Student();
            student1.setName(name);
            student1.setEmail(email);
            student1.setStudentID(studentID);
            studentsList.add(student1);

            count++;
        }
    }
}

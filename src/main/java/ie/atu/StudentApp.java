package ie.atu;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;


public class StudentApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student1;

        //Array list
        List<Student> studentsList = new ArrayList<Student>();

        //Counting system to determine the amount of times the code needs to be run
        int studentNum=0,count=0;
        System.out.println("Please enter the number of students: ");
        studentNum = sc.nextInt();
        sc.nextLine();

        //Inputs for name,email,course
        while(count<studentNum)
        {
            System.out.println("Please enter your name: ");
            String name = sc.nextLine();
            System.out.println("Please enter your email: ");
            String email = sc.nextLine();

            //Check for repeated email
            for(Student student:studentsList)
            {
                String temp=student.getEmail();
                if(temp.toLowerCase().equals(email.toLowerCase()))
                {
                    System.out.println("Please enter another email:" );
                    email = sc.nextLine();
                    break;
                }
            }

            System.out.println("Please enter your course: ");
            String course = sc.nextLine();


            //Populating the class
            student1= new Student();
            student1.setName(name);
            student1.setEmail(email);
            student1.setCourse(course);
            studentsList.add(student1);

            count++;
        }

        //Printing out student list
        System.out.println("Student List: ");
        for(Student student : studentsList)
        {
            System.out.println(student);
        }

    }
}

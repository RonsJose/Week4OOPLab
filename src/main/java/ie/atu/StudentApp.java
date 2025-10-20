package ie.atu;
import java.io.*;
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
        while(true)
        {
            System.out.println("Please enter the number of students: ");
            String studentNumStr = sc.nextLine().trim();

            try {
                studentNum = Integer.parseInt(studentNumStr);
                System.out.println("Number of students: " + studentNum);
                break;
            } catch (NumberFormatException e)
            {
                System.out.println(" Invalid input " + e.getMessage());
            }
        }

        System.out.println("Please enter the file name (e.g., students.txt): ");
        String fileName = sc.nextLine().trim();

        //Inputs for name,email,courseS
        while(count<studentNum)
        {
            System.out.println("Please enter your name: ");
            String name = sc.nextLine().trim();
            System.out.println("Please enter your email: ");
            String email = sc.nextLine().trim();

            //Check for repeated email
            for(Student student:studentsList)
            {
                while(student.getEmail().toLowerCase().equals(email.toLowerCase()))
                {
                    System.out.println("Please enter another email:" );
                    email = sc.nextLine().trim();
                }

            }

            System.out.println("Please enter your course: ");
            String course = sc.nextLine().trim();


            //Populating the class
            student1= new Student();
            student1.setName(name);
            student1.setEmail(email);
            student1.setCourse(course);
            studentsList.add(student1);

            try(PrintWriter out= new PrintWriter(new FileWriter(fileName, true)))
            {
                out.println(name+","+email+","+course);
                System.out.println("Saved to "+fileName);
            } catch (IOException ex)
            {
                System.out.println("Could not write to file " + ex.getMessage());
            }

            count++;
        }

        try
        {
            FileReader neverUsed= new FileReader("students.txt");
            BufferedReader br=new BufferedReader(neverUsed);
            System.out.println("Contents of students.txt:");
            String line;
            while((line = br.readLine())!=null)
                {
                System.out.println(" - "+line);
                }
        }catch (IOException ex)
        {
            System.out.println("Could not read from file: " + ex.getMessage());
        }

        //Printing out student list
        System.out.println("Student List: ");
        for(Student student : studentsList)
        {
            System.out.println(student);
        }

    }

}

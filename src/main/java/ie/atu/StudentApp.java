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

            //Ensures that the inputed string is a number
            try {
                studentNum = Integer.parseInt(studentNumStr); //Attempting to parse to studentNum
                System.out.println("Number of students: " + studentNum);
                break;
            } catch (NumberFormatException e)//Error handling
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

            //Writing data to file
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

        BufferedReader br = null;

        //Reading data from file
        try
        {
            FileReader neverUsed= new FileReader("students.txt");
             br=new BufferedReader(neverUsed);
            System.out.println("Contents of students.txt:");
            String line;
            //Going through file line by line for data
            while((line = br.readLine())!=null)
                {
                System.out.println(" - "+line);
                }
        }catch (IOException ex)
        {
            System.out.println("Could not read from file: " + ex.getMessage());
        }
        finally
        {
            //Checks to see if the stream is closed
            if (br != null)
            {
                try {
                    br.close(); //Attempts to close stream
                } catch (IOException closeEx) {
                    System.out.println("Could not close file:  " + closeEx.getMessage());
                }
            }
        }

        //Printing out student list
        System.out.println("Student List: ");
        for(Student student : studentsList)
        {
            System.out.println(student);
        }

    }

}

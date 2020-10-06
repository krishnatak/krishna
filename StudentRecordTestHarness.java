/**
 * To test the file StudentRecord.java and initiating objects of same class and printing the record of students
 * Author : Krishna Tak
 * Date :   07 Oct 2020
 * Time :   01:13 AM
 */
import java.util.Scanner;
public class StudentRecordTestHarness
{
    // main method to run our code 
    public static void main(String[]args)
    {
        // initiating an object with four proper arguements
        StudentRecord student1 = new StudentRecord("Andrew","Wilson",123456,99);
        //printing record of student whose info is already saved.
        System.out.println(student1.getFirstName()+" "+student1.getLastName()+" (Student ID number "+student1.getStudentID()+") has scored "+student1.getGradeCourseOne()+" marks overall and Alphabetic grade is "+student1.gradeConvertor());
        // I did not find option in this IDE to wrap text, please scroll to read
        
        //initiating another object without arguements
        StudentRecord student2 = new StudentRecord();
        
        //asking users to entry students record
        System.out.println("Please add the information of students");
        
        Scanner input = new Scanner(System.in);
        
        //getting first name from input
        System.out.println("Enter the First Name of Student");                
        student2.setFirstName(input.next());
        
        //getting last name from input
        System.out.println("Enter the last Name of Student");
        student2.setLastName(input.next());
        
        //getting student id from input
        System.out.println("Enter the ID number of Student");
        student2.setStudentID(input.nextInt());
        
        //getting numeric grade from input
        System.out.println("Enter the numeric grades of Student");
        student2.setGradeCourseOne(input.nextInt());
        
        //printing the student's record which is collected from input
        System.out.println(student2.getFirstName()+" "+student2.getLastName()+" (Student ID number "+student2.getStudentID()+") has scored "+student2.getGradeCourseOne()+" marks overall and Alphabetic grade is "+student2.gradeConvertor());
       
        
        
        
        //challenge 4
                //initiating another object without arguements
        StudentRecord student3 = new StudentRecord();
        
        //asking users to entry students record
        System.out.println("Please add the information of students");
        
        Scanner input2 = new Scanner(System.in);
        
        //getting first name from input
        System.out.println("Enter 5 letters First Name of Student");                
        student3.setFirstName(input2.next());
        
        //getting last name from input
        System.out.println("Enter the last Name of Student");
        student3.setLastName(input2.next());
        
        //getting student id from input
        System.out.println("Enter the ID number of Student");
        student3.setStudentID(input2.nextInt());
        
        //getting numeric grade from input
        System.out.println("Enter the numeric grades of Student");
        student3.setGradeCourseOne(input2.nextInt());
        
        //printing the student's record which is collected from input
        System.out.println(student3.getFirstName()+" "+student3.getLastName()+" (Student ID number "+student3.getStudentID()+") has scored "+student3.getGradeCourseOne()+" marks overall and Alphabetic grade is "+student3.gradeConvertor());
       
        
        
        // printing the number of vowels in first name
        System.out.println("There are "+student3.vovelCounter()+" vowels in your first name.");        
    }   
}

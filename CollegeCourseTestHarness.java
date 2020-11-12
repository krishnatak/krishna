/**
 * Description: This is test harness class of CollegeCourse, this program creates 200 new objects
 * with appropriate random values and printing with public class variable. also will give message if there any error
 * with use of TRY-CATCH    
 *Author: Krishna Tak 
 *Date: 10 nov 2020
 *Time: 3:25 AM
 */

import java.util.Random;   //to import Random Class
import java.util.Scanner;  //to import Scanner class

//main class
public class CollegeCourseTestHarness {
    
    public static void main(final String[] args) {

        //initiating new Random
        final Random random1 = new Random();
        

        //creating object of CollegeCourse
        final CollegeCourse[][] realCourse1 = new CollegeCourse[200][10];

        //giving the data to first 100 rows as 0 0 
        for(int i=0; i<100; i++)
        {
            for(int j=0; j<10;j++)
            {
                realCourse1[i][j]= new CollegeCourse(0,0);
            }
        }    

        //giving the data to first 100 rows as 9999 9999 
        for(int i=100; i<200; i++)
        {
            for(int j=0; j<10;j++)
            {
                realCourse1[i][j]= new CollegeCourse(9999,9999);
            }
        }
        
        //printing the states with default values as 0 and 9999
        for(int i=0; i<200; i++)
        {
            for(int j=0; j<10;j++)
            {   
                System.out.println("S.No. "+realCourse1[i][j].serialNumber+":-");
                System.out.print("Course Number of the Course is ");
                System.out.println(realCourse1[i][j].getcourseNumber());
                System.out.print("Course Reference Number of the Course is ");
                System.out.println(realCourse1[i][j].getcourseReferenceNumber());
                System.out.println("----------------------------------------------------");
                System.out.println();
            }
        }        
        //reseting the serial number, so that it will start from 0 for another list of courses
        CollegeCourse.serial=0;


        System.out.println("############################################################");
        System.out.println("############################################################");
        System.out.println("#######################      ###############################");
        System.out.println("####################### #### ###############################");
        System.out.println("############################ ###############################");
        System.out.println("############################ ###############################");
        System.out.println("#######################     ################################");
        System.out.println("####################### ####################################");
        System.out.println("####################### ####################################");
        System.out.println("####################### #### ###############################");
        System.out.println("#######################      ###############################");
        System.out.println("############################################################");
        System.out.println("############################################################"); 
        // for next phase, have to assign value of both states conditionally

        //creating object of CollegeCourse
        final CollegeCourse[][] realCourse2 = new CollegeCourse[200][10];        

        //storing course numbers is an array,
        final int[] courseNumberList= new int[]{12345,54321,45678,87654,98765};
        int courseReferenceInitial = 8888888;
        
        
        //asigning properties to objects
        for(int i=0; i<200; i++)
        {
            for(int j=0; j<10;j++)
            {                  
                final int randomMaxSix = random1.nextInt(5);                                          //to generate int (0-5)
                final int randomCourseNumber = courseNumberList[randomMaxSix];                        //get random number from array
                realCourse2[i][j]= new CollegeCourse(randomCourseNumber,courseReferenceInitial);       //assigning data to objects
                courseReferenceInitial++;
                
            }
            courseReferenceInitial++;
        }
        
        // printing all the states of customised data
        for(int i=0; i<200; i++)
        {
            for(int j=0; j<10;j++)
            {   
                System.out.println("S.No. "+realCourse2[i][j].serialNumber+" :");
                System.out.print("Course Number of the Course is ");
                System.out.println(realCourse2[i][j].getcourseNumber());
                System.out.print("Course Reference Number of the Course is ");
                System.out.println(realCourse2[i][j].getcourseReferenceNumber());
                System.out.println("----------------------------------------------------");
                System.out.println();

            }
        } 

        System.out.println("############################################################");
        System.out.println("############################################################");
        System.out.println("#######################      ###############################");
        System.out.println("####################### #### ###############################");
        System.out.println("############################ ###############################");
        System.out.println("############################ ###############################");
        System.out.println("#########################   ################################");
        System.out.println("############################ ###############################");
        System.out.println("############################ ###############################");
        System.out.println("####################### #### ###############################");
        System.out.println("#######################      ###############################");
        System.out.println("############################################################");
        System.out.println("############################################################");        
        
        //phase 3, program will print the object's detail according to user input
        int iterationOfLoop =0;
        int attempts = 5;
        while(iterationOfLoop<5)
        {
            //assigning input to variables       
            final Scanner newInput = new Scanner(System.in);
            System.out.println("You can get information for " +attempts+" times only");
            System.out.println("Input Row number");
            final int courseNumberAddress= newInput.nextInt();
            System.out.println("Input column number");
            final int courseReferenceNumberAddress= newInput.nextInt();
            
            //this will print an error if user input value greater than the array's length
            try
            { 
                final int valueOfCourseNumber = realCourse2[courseNumberAddress][courseReferenceNumberAddress].getcourseNumber();
                final int valueOfReferenceNumber = realCourse2[courseNumberAddress][courseReferenceNumberAddress].getcourseReferenceNumber();
                System.out.println("Information of course you selected is :");
                System.out.print("Course Number of the Course is ");
                System.out.println(valueOfCourseNumber);
                System.out.print("Course Reference Number of the Course is ");
                System.out.println(valueOfReferenceNumber);
                System.out.println("----------------------------------------------------");
                System.out.println();        
            }
            //to handle number out of range
            catch(final ArrayIndexOutOfBoundsException e)
            {
                System.out.println();
                System.out.println("--------------alert---------------");
                System.out.println("--------------alert---------------");
                System.out.println("Please provide a valid input!");
                System.out.println();                
                            
            }  
            
            //user will have 5 chance to get info of any course
            iterationOfLoop++;
            attempts--;
        }        
        System.out.println("Thanks for participating! End of program");
    }
}
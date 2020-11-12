/**
 * Description: This is bluePrint class , here I defined setters , getters and constructor along with 
 * a constructor with 4 arguments AND A PUBLIC VARIABLE to count the college courses
 * Author: Krishna Tak
 * Date: 10 Nov 2020
 * Time: 23:28
 */
public class CollegeCourse
{
    // instance variables - 
    private int courseReferenceNumber;
    private int courseNumber;
    public static int serial= 0;
    public int serialNumber;
    
    //  a default Constructor for objects of class CollegeCourse 
    public CollegeCourse()
    {
    }

    // a Constructor for objects of class CollegeCourse with 4 arguements
    public CollegeCourse(int courseNumber, int courseReferenceNumber)
    {
        this.courseNumber = courseNumber;
        this.courseReferenceNumber = courseReferenceNumber;
        serial++;
        this.serialNumber = serial;
    }

        //setter for int courseNumber 
    public void setcourseNumber(int courseNumber)
    {
        this.courseNumber = courseNumber;
    }
    
    //getter for same
    public int getcourseNumber()
    {
        return courseNumber;
    }
    //----------------------------------------
   

    //setter for int courseReferenceNumber 
    public void setcourseReferenceNumber(int courseReferenceNumber)
    {
        this.courseReferenceNumber = courseReferenceNumber;
    }

    //getter for same
    public int getcourseReferenceNumber()
    {
        return courseReferenceNumber;
    }
    //----------------------------------------

    //getter for serial number    
    public int getSerial()
    {
        return serial;
    }
}

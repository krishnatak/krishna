
/**
 * This is bluePrint class , here I defined setters , getters and constructor along with 
 * proper if-else statement to convert numeric grade to alphabetic  Grade
 * Author: Krishna Tak
 * Date: 06 oct 2020
 * Time: 23:28
 */
public class StudentRecord
{
    // instance variables - replace the example below with your own
    private String firstName;
    private String lastName;
    private int studentID;
    private int gradeCourseOne;
    
       //  a default Constructor for objects of class StudentRecord 
         public StudentRecord()
    {

    }

    // a Constructor for objects of class StudentRecord with 4 arguements
    public StudentRecord(String firstName, String lastName, int studentID, int gradeCourseOne)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentID = studentID;
        this.gradeCourseOne = gradeCourseOne;
    }

        //setter for String firstName 
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    
    //getter for same
    public String getFirstName()
    {
        return firstName;
    }
    //----------------------------------------

    //setter for String lastName 
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    //getter for same
    public String getLastName()
    {
        return lastName;
    }
    //----------------------------------------

    //setter for int Student ID  
    public void setStudentID(int studentID)
    {
        this.studentID = studentID;
    }

    //getter for same
    public int getStudentID()
    {
        return studentID;
    }
    //----------------------------------------

    //setter for int gradeCourseOne 
    public void setGradeCourseOne(int gradeCourseOne)
    {
        this.gradeCourseOne = gradeCourseOne;
    }

    //getter for same
    public int getGradeCourseOne()
    {
        return gradeCourseOne;
    }
    
    // my method to return Letter grade for numerics marks ranges
        public char gradeConvertor()
    {
        // declaring a default character variable to assign different values a/c to grades
        char finalGrade = 'O';
        //assigning different value to 'finalGrade' accordingly
        if(gradeCourseOne >=90 && gradeCourseOne <=100)
        {
            finalGrade = 'A';
        }  
        
        else if(gradeCourseOne >=80 && gradeCourseOne <=89)
        {
            finalGrade = 'B';
        } 
        
        else if(gradeCourseOne >=70 && gradeCourseOne <=79)
        {
            finalGrade = 'C';
        } 
        
        else if(gradeCourseOne >=60 && gradeCourseOne <=69)
        {
            finalGrade = 'D';
        } 
        
        else if(gradeCourseOne >=50 && gradeCourseOne <=59)
        {
            finalGrade = 'E';
        } 
        
        else if(gradeCourseOne <50)
        {
            finalGrade = 'F';
        } 
        
        // this method will return grade according to numberic grade
        return finalGrade;
    }   
    
    //method to determine the number of vovels in first name
    public int vovelCounter()
    {
        int totalVovels = 0;
        if(firstName.length()==5)
        {
            int i = 0;
            int sLength =firstName.length();                //storing the string lenght in an integer variable
            while(i<sLength)
            {
               char character = firstName.charAt(i);          
                    if(character=='a'|| character=='A')     //this will check whether string contains a or A
                    {
                        totalVovels++;                      //if it contains, then increase the number by 1
                    }
                    else if(character=='e'|| character=='E')
                    {
                        totalVovels++;
                    }
                    else if(character=='i'|| character=='I')
                    {
                       totalVovels++;
                    }
                    else if(character=='o'|| character=='O')
                    {
                       totalVovels++;
                    }           
                    else if(character=='u'|| character=='U')
                    {
                       totalVovels++;
                    }                
               i++;
            }               
        }   
        return totalVovels;
    }    
}

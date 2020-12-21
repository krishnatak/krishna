/**
 * Description: This is bluePrint class , here I defined setters , getters and constructor along with 
 * a default constructor for profile of players along with relevant behaviors
 * Author: Krishna Tak
 * Date: 10 Nov 2020
 * Time: 23:28
 */
public class DiceGame
{
    // instance variables -     
    private String firstName;
    private String lastName;
    private int age;
    public static int serial= 0;
    public int serialNumber;
    
    //  a default Constructor for objects of class DiceGame 
    public DiceGame()
    {        
        serial++;
        this.serialNumber = serial;
    }

    //setter for String firstName
    public void setFirstName( String firstName)
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
    public void setLastName( String lastName)
    {
        this.lastName = lastName;
    }

    //getter for same
    public String getLastName()
    {
        return lastName;
    }
    //----------------------------------------
   

    //setter for int age 
    public void setAge( int age)
    {
        this.age = age;
    }

    //getter for same
    public int getAge()
    {
        return age;
    }
    //----------------------------------------

    //getter for serial number    
    public int getSerial()
    {
        return serial;
    }

   
    public static String[][] nickNames = {
        {"John", "April"},
        {"Sam", "Curin","Modi","Sanju","Romeo","Ranu"}
    };    

    //method to determine the number of vovels in first name 
    // this will retrun a nick name according to no. of vowels in first name
    
    public static String nickNameProvider(String name)
    {
        int totalVovels = 0;
        String allotedNickName="";    
            int i = 0;
            int sLength =name.length();                //storing the string lenght in an integer variable
            while(i<sLength)
            {
               char character = name.charAt(i);          
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
           if(totalVovels<2)
           {
                allotedNickName = "Fuddu";
           }
           else
           {
                allotedNickName = "Chaman";
           }
        return allotedNickName;
    }   
    //this method will return a random nick name according to no of vowels in last name
    public static String nickNameProvider(int vowelsInLastName) 
    {
        String allotedNickName="";
        switch (vowelsInLastName) {
            case 1:
            allotedNickName =   nickNames[0] [0] ;
            break;
            case 2:
            allotedNickName =   nickNames[1][0]  ;
            break;
            case 3:
            allotedNickName =   nickNames[2] [0] ;
            break;
            case 4:
            allotedNickName =   nickNames[3][0]  ;
            break;
            case 5:
            allotedNickName =   nickNames[4][0]  ;
            break;
            case 6:
            allotedNickName =   nickNames[5][0]  ;
            break;
            case 7:
            allotedNickName =   nickNames[0][1]  ;
            break;
            case 8:
            allotedNickName =   nickNames[1][1]  ;
            break;
            case 9:
            allotedNickName =   nickNames[2][1]  ;
            break;
            case 10:
            allotedNickName =   nickNames[3][1]  ;
            break;
            case 11:
            allotedNickName =   nickNames[4][1]  ;
            break;
            case 12:
            allotedNickName =   nickNames[5][1]  ;
            break;
        
        
        }
        return allotedNickName;
    }
}

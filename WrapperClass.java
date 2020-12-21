/**
 * Description: Includes wrappers class and static method to give grades to players at the end
 * Author: Krishna Tak
 * Date: 11 Nov 2020
 * Time: 23:28
 */
public class WrapperClass
{       
        // storing grades in a char array
        public static char[] grades = {'A','B','C','D'};
        // creating Character class objcet and assinfg value from the array
        Character object1 =grades [0];
        Character object2 =grades [1];
        char gradeA = object1;
        char gradeB = object2;
                //static method to print gradwe rto the screen for players
                public static String overallPerformance(int playerNumber)
                {
                        String stringToReturn="";       
                        if(playerNumber==1)
                        {
                                stringToReturn = "Well Played, due to technical error, our grading system is not working";
                        }
                        else if(playerNumber==2)
                        {
                                stringToReturn = "Well Played, due to technical error, our grading system is not working";
                        }
                        return stringToReturn;
                }
}
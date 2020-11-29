/**
 * To test the file ReaEstateTransaction.java and initiating object of same class and testing string methods defined in the blueprint claszzs
 * Author : Krishna Tak
 * Date :   27 November 2020
 * Time :   01:13 AM
 */
import java.util.Scanner;

public class RealEstateTransactionTestHarness
{
    // main method to run our code 
    public static void main(String[]args)
    {   
        boolean loop = false;
        //initiaating new object with 4 arguements
        RealEstateTransaction newObject = new RealEstateTransaction("fourty seven", "Oxford Street", "London", "Eighty seven rupees");

        //TESTING FIRST METHOD
        System.out.println(newObject.equalDividedCases());

        //TESTING FIRST METHOD
        System.out.println(newObject.RandomNumber());  

        //third method
        Scanner inputs = new Scanner(System.in);
        while(!loop)
        {   
            //initiating scanner object
            //and assigning values from input
            System.out.println("enter the first number");
            int initial=inputs.nextInt();
            
            System.out.println("enter the second number");
            int last = inputs.nextInt();
            
            if(initial<last)
            {
                loop=true;
                System.out.println(newObject.catchAndReplace(initial,last));
            }
            inputs.close();
        }
    }
}        
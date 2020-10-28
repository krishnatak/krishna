/**
 * Description: This is test harness class of TransactionRecord, this program creates 500 new objects
 * with appropriate random values and printing with public class variable
 *Author: Krishna Tak 
 *Date: 28 oct 2020
 *Time: 3:25 AM
 */
import java.util.Random ;   //to import Random Class
import java.util.Scanner ;  //to import Scanner class

//main class
public class TransactionRecodTestHarness {
    
    public static void main(String[] args) {

        //initiating new Random
        Random random1 = new Random();

        //Creating arrays of TransactionRecord array of 500 elements(500 objects)
        TransactionRecord[] entry = new TransactionRecord[500];


        // to store value to all 500 objects
        for(int i = 0; i<500 ; i++)
        {   //this will generate random values and assign these are property of object
            entry[i]= new TransactionRecord(random1.nextBoolean() , random1.nextDouble() , random1.nextInt(), random1.nextLong());
            
        }

        // to print all the states with thw public vaiable as serial number
        for(int j = 0; j<500; j++)
        {           
            System.out.println("Serial number : "+entry[j].serialNumber);
            System.out.println("The funds are in Canadian Dollars : "+entry[j].getCanadianFunds());
            System.out.println("The current exchange rate of CAD is "+entry[j].getExchangeRate());
            System.out.println("The number of transaction is "+entry[j].getTransactionNumber());
            System.out.println("Transation Reference Number of this transation is "+entry[j].getTransactionReferenceNumber());
            System.out.println("-----------------------------------");
            System.out.println("");
        }
        System.out.println("");
        

        // second phase of test,
        Scanner newInput = new Scanner(System.in);
        System.out.println("Do you want to participate in this test? Answer in 'yes' or 'no' ");
        String userAnswer = newInput.nextLine();

        //THIS WILL CHECK WHETHER THE USER ISS INTERESTED FOR PARTICIPATION OR NOT
        if(userAnswer.equalsIgnoreCase("yes"))
        {
            // to store defailt values to all 500 objects 
            for(int i = 0; i<500 ; i++)
            {
                entry[i].setCanadianFunds(true);
                entry[i].setExchangeRate(0.1010);
                entry[i].setTransactionNumber(10101);
                entry[i].setTransactionReferenceNumber(15000000000L);
            }
            System.out.println("Thanks for participating, you can see default same value for all entries");

            //printing the states with default values
            for(int j = 0; j<500; j++)
            {           
                System.out.println("Serial number : "+entry[j].serialNumber);
                System.out.println("The funds are in Canadian Dollars : "+entry[j].getCanadianFunds());
                System.out.println("The current exchange rate of CAD is "+entry[j].getExchangeRate());
                System.out.println("The number of transaction is "+entry[j].getTransactionNumber());
                System.out.println("Transation Reference Number of this transation is "+entry[j].getTransactionReferenceNumber());
                System.out.println("-----------------------------------");
                System.out.println("");
              }
        }
        else
        {
            System.out.println("Okay, Thanks.. The program is ended");
        }
    }
}
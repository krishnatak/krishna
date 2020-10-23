/**
 * To test the file AirlineBooking.java and initiating objects of same class and printing the record of passengers with seat class.
 * Author : Krishna Tak
 * Date :   13 Oct 2020
 * Time :   01:13 AM
 */
import java.util.Scanner;
public class AirlineReservationTestHarness
{
    // main method to run our code 
    public static void main(String[]args)
    {
        // initiating an object with four proper arguements
        AirlineBooking passenger1 = new AirlineBooking("jack","blue","A45F56",48979,1);

        //printing object states in seperate lines of passeenger 1
        System.out.println("First Name of passenge is " +passenger1.getFirstName());
        System.out.println("last Name of passenge is " +passenger1.getLastName());
        System.out.println("Flight number of passenge is " +passenger1.getFlightNumber());
        System.out.println("Ticket number of passenge is " +passenger1.getTicketNumber());
        System.out.println("Seat number of passenge is " +passenger1.getSeatNumber());
        
        //declaring a Single string to print everything incluing passenger info, seat class and the portion of string acc to ticket number
        String finalString = "Full name of passenger is "+passenger1.getFirstName()+" "+passenger1.getLastName()+" boarding in flight("+passenger1.getFlightNumber()+"). "+"Ticket number of passenger is "+passenger1.getTicketNumber() +" and alloted seat is Number "+passenger1.getSeatNumber()+ " which idicate that this seat belongs to - "+passenger1.classFinder()+"...String Portion - "+passenger1.stringPortion();
         
        //printing above String
        System.out.println(finalString);
        
        //printing alert if the passenger belongs to No-fly list
        if(passenger1.wantedDetector()==9999)
        {
            for(int i=0;i<7;i++)
            {
                System.out.println("ALERT");
                
                
                for(int j = 0; j < 847483647 ; j++) {
        
                    for(int k = 0; k < 847483647 ; k++){ }
                }                
            }
                    
        }

        
      
        //initiating new empty object
        AirlineBooking passenger2 = new AirlineBooking();
        
        //asking users to entry passenger record
        System.out.println("Please add the information of passenger");
        
        Scanner input = new Scanner(System.in);
        
        //getting first name from input
        System.out.println("Enter the First Name of passenger");                
        passenger2.setFirstName(input.next());
        
        //getting last name from input
        System.out.println("Enter the last Name of passenger");
        passenger2.setLastName(input.next());
        
        //getting flight number from input
        System.out.println("Enter the flight number of passenger");
        passenger2.setFlightNumber(input.next());
        
        //getting ticket Number from input
        System.out.println("Enter the ticket number of passenger");
        passenger2.setTicketNumber(input.nextInt());
        
        //getting seat Number from input
        System.out.println("Enter the seat number of passenger");
        passenger2.setSeatNumber(input.nextInt());       
        
        //printing object states in seperate lines of passeenger 1
        System.out.println("First Name of passenge is " +passenger2.getFirstName());
        System.out.println("last Name of passenge is " +passenger2.getLastName());
        System.out.println("Flight number of passenge is " +passenger2.getFlightNumber());
        System.out.println("Ticket number of passenge is " +passenger2.getTicketNumber());
        System.out.println("Seat number of passenge is " +passenger2.getSeatNumber());
        
        //declaring a Single string to print everything incluing passenger info, seat class and the portion of string acc to ticket number
        String finalString2 = "Full name of passenger is "+passenger2.getFirstName()+" "+passenger2.getLastName()+" boarding in flight("+passenger2.getFlightNumber()+"). "+"Ticket number of passenger is "+passenger2.getTicketNumber() +" and alloted seat is Number "+passenger2.getSeatNumber()+ " which idicate that this seat belongs to - "+passenger2.classFinder()+"...String Portion - "+passenger2.stringPortion();
       
        //printing above String
        System.out.println(finalString2);
        
        //printing alert if the passenger belongs to No-fly list
        if(passenger1.wantedDetector()==9999)
        {
            for(int i=0;i<7;i++)
            {
                System.out.println("ALERT");
                
                
                for(int j = 0; j < 847483647 ; j++) {
        
                    for(int k = 0; k < 847483647 ; k++){ }
                }                
            }
                    
        }
    }
}    
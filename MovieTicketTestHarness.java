/**
 * To test the file MovieTicket.java and initiating objects of same class and printing the record of ticket with tax , and date of show
 * Author : Krishna Tak
 * Date :   22 Oct 2020
 * Time :   01:13 AM
 */
import java.util.Scanner;
public class MovieTicketTestHarness
{
    // main method to run our code 
    public static void main(String[]args)
    {

        //initiating new empty object
        MovieTicket ticket1 = new MovieTicket();
   
        //asking users to entry passenger record
        System.out.println("Please add the information of ticket");
        
        //scanner to collect info
        Scanner input = new Scanner(System.in);
        
        //getting Movie name from input
        System.out.println("Enter the Movie Name");                
        ticket1.setMovieName(input.next());
        
        //getting ticket Number from input
        System.out.println("Enter the ticket number");
        ticket1.setTicketNumber(input.nextInt());
        
        //getting theatre Number from input
        System.out.println("Enter the theatre number");
        ticket1.setTheatreNumber(input.nextInt());       
        
        //printing object states in seperate lines of passeenger 1
        System.out.println("movie Name is " +ticket1.getMovieName());
        System.out.println("Ticket number is " +ticket1.getTicketNumber());
        System.out.println("Theatre number is " +ticket1.getTheatreNumber());
        System.out.println("Price of ticket is " +MovieTicket.ticketPrice);
        System.out.println("Tax to be add is " +ticket1.netCost(MovieTicket.generalTax));
        System.out.println("Your ticket information is saved");
        
        
        //to get date of show acc to movie name
        System.out.println("Enter your movie name, select from availabe names(case sensetive!)");
        System.out.println("1. Robot");
        System.out.println("2. Shiva");
        System.out.println("3. Taxi");
        System.out.println("4. Hacker");
        
        //getting Movie name from input
        System.out.println("Enter the Movie Name");                
        String newMovieName =input.next();
        System.out.println(newMovieName+" will be live on "+ticket1.showDate(newMovieName));
        
        //acc to ticket number
        //getting ticket Number from input
        System.out.println("Enter the ticket number");
        int newTicketNumber =input.nextInt();
        System.out.println("Acc to info provided, your show will be live on "+ticket1.showDate(newTicketNumber));
        System.out.println("Enjoy your Show, Have a Nice day");
    }
}       

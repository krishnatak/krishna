/**
 * This is bluePrint class , here I defined setters , getters and constructor along with 
 * proper switch statement to provide Appropriate Seat Class according to ticket number
 * Author: Krishna Tak
 * Date: 13 oct 2020
 * Time: 23:28
 */
public class AirlineBooking
{
    // instance variables - replace the example below with your own
    private String firstName;
    private String lastName;
    private int ticketNumber;
    private int seatNumber;
    private String flightNumber;
    
       //  a default Constructor for objects of class AirlineBooking 
    public AirlineBooking()
    {

    }

    // a Constructor for objects of class AirlineBooking with 4 arguements
    public AirlineBooking(String firstName, String lastName,String flightNumber, int ticketNumber, int seatNumber)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ticketNumber = ticketNumber;
        this.seatNumber = seatNumber;
        this.flightNumber = flightNumber;
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
    
    //setter for String flightNumber 
    public void setFlightNumber(String flightNumber)
    {
        this.flightNumber = flightNumber;
    }
    
    //getter for same
    public String getFlightNumber()
    {
        return flightNumber;
    }    

    //setter for int Student ID  
    public void setTicketNumber(int ticketNumber)
    {
        this.ticketNumber = ticketNumber;
    }

    //getter for same
    public int getTicketNumber()
    {
        return ticketNumber;
    }
    //----------------------------------------

    //setter for int seatNumber 
    public void setSeatNumber(int seatNumber)
    {
        this.seatNumber = seatNumber;
    }

    //getter for same
    public int getSeatNumber()
    {
        return seatNumber;
    }
    
    
    // method to return 'seat class' according to seat number
    public String classFinder()
    {
        // initiating a char varible to return and to store different value for different cases
        String seatClass="";
        
        switch(seatNumber)
        {
            case 1:                 //if seat number = 1 , then its class will be A
                seatClass ="First Class";
                break;              // break statement to seperate each case
            case 2:
                seatClass ="First Class";
                break;
            case 3:
                seatClass ="Second Class";
                break;
            case 4:
                seatClass ="Second Class";
                break;
            case 5:
                seatClass ="Third  Class";
                break;
            case 6:
                seatClass ="Third  Class";
                break;
            case 7:
                seatClass ="Fourth Class";
                break;
            case 8:
                seatClass ="Fourth Class";
                break;                
        }   
        return seatClass;
    }    
    
    
    // chcking name of passenger in no fly list
    public int wantedDetector()
    {
        String fullName = firstName+" "+lastName;   //concenating strings
        String wanted1 = "Jack Blue";
        String wanted2 = "Jack Green";
        String wanted3 = "Jill White";             
        int code = 0;
        
        // if statement to search names of wanted in list of passengers
        if(fullName.equalsIgnoreCase(wanted1))
        {
            code = 9999;
        }    
        else if(fullName.equalsIgnoreCase(wanted2))
        {
            code = 9999;
        } 
        else if(fullName.equalsIgnoreCase(wanted3))
        {
            code = 9999;
        }              
        return code;
    }
    
    
        //method to get a portion of concanated string according to ticket number
        public String stringPortion()
        {
            //contanating all the variables in single string
            String concatString = firstName + lastName + flightNumber + ticketNumber + seatNumber;
            
            //declaring more variables for first and last letter of concat string
            String firstLetter =Integer.toString(ticketNumber).substring(0,1);
            String lastLetter = Integer.toString(ticketNumber).substring(Integer.toString(ticketNumber).length()-1,Integer.toString(ticketNumber).length());
            
            //converting above string into int
            
            int intfisrtName = Integer.parseInt(firstLetter);
            int intlastName = Integer.parseInt(lastLetter);
            
            //printing the postion of string concatString
            String finalString = concatString.substring(intfisrtName-1,intlastName);
            
            return finalString;
        }
        
    
    
}    
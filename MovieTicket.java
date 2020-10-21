/**
 * This is bluePrint class , here I defined setters , getters and constructor along with 
 * proper switch statement to collect ticket info, and will define
 * Author: Krishna Tak
 * Date: 2113 oct 2020
 * Time: 23:02
 */
public class MovieTicket
{
    // instance variables - 
    private String movieName;
    private int ticketNumber;
    private int theatreNumber;
        
       //  a default Constructor for objects of class MovieTicket 
    public MovieTicket()
    {
    }

    // a Constructor for objects of class MovieTicket with 4 arguements
    public MovieTicket(String movieName, String lastName,String flightNumber, int ticketNumber, int theatreNumber)
    {
        this.movieName = movieName;
        this.ticketNumber = ticketNumber;
        this.theatreNumber = theatreNumber;
    }

        //setter for String movieName 
    public void setMovieName(String movieName)
    {
        this.movieName = movieName;
    }
    
    //getter for same
    public String getMovieName()
    {
        return movieName;
    }
    //----------------------------------------


    //setter for int seat numbr 
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

    //setter for int theatreNumber 
    public void setTheatreNumber(int theatreNumber)
    {
        this.theatreNumber = theatreNumber;
    }

    //getter for same
    public int getTheatreNumber()
    {
        return theatreNumber;
    }
    
    //hardcoded initial value for ticket price:
    public static int ticketPrice = 100;
    public static int generalTax = 13;
    //static method to calculate the net cost including tax
    public static double netCost(int tax)
    {
        //formula to calucalte percentage, obtained/total*100 = %
        double taxAmount = tax*ticketPrice/100;
        double netCost = ticketPrice + taxAmount;
        return taxAmount;
    }
        
    //4 hardcoded show times
    public static String batchOne = "Monday 02 Oct";
    public static String batchTwo = "Tuesday 03 Oct";
    public static String batchThree = "Thursday 04 Oct";
    public static String batchFour = "Sunday 07 Oct";
    public static String movieDate = "";
    // non=static method to get date according to movie name;
    public String showDate(String movieName)
    {
        String movieDate = "";
        switch(movieName)
        {    
            case "Robot":
                movieDate = batchOne;
                break;
            case "Shiva":
                movieDate = batchTwo; 
                break;
            case "Taxi":
                movieDate = batchThree;
                break;
            case "Hacker":
                movieDate = batchFour;       
                break;
        
        }
        return movieDate;
    }
    
    // non-static method to get date according to ticket number's first digit
    public String showDate(int ticketNumber)
    {
        
        String stringTicketNumber = Integer.toString(ticketNumber);
        
        //getting first digit of ticket number
        String firstLetter = stringTicketNumber.substring(0,1);
        int firstDigit = Integer.parseInt(firstLetter);
        
        
        switch(firstDigit)
        {   
            //this will give the date according to last digit of ticket number
            case 1:
                movieDate = batchOne;   
                break;
            case 2:
                movieDate = batchOne; 
                break;
            case 3:
                movieDate = batchOne; 
                break;
            case 4:
                movieDate = batchTwo;    
                break;
            case 5:
                movieDate = batchTwo;   
                break;
            case 6:
                movieDate =batchThree; 
                break;
            case 7:
                movieDate =batchThree; 
                break;
            case 8:
                movieDate = batchFour;
                break;
            case 9:
                movieDate = batchFour; 
                break;
            case 0:
                movieDate = batchFour;      
                break;
        }   
        return movieDate;
    }
    
}    
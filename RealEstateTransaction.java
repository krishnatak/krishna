/**
 * Description: This is bluePrString class , here I defined setters , getters and constructor along with 
 * a constructor with 4 arguments FOR transaction, along with some string methods using random and scanner class
 * Author: Krishna Tak
 * Date: 27 Nov 2020
 * Time: 23:28
 */
import java.util.Random;
public class RealEstateTransaction
{
    // instance variables - 
    private String streetNumber;
    private String streetName;
    private String cityName;
    private String purchasePrice;
    public static int serial= 0;
    public int serialNumber;
    
    //  a default Constructor for objects of class RealEstateTransaction 
    public RealEstateTransaction()
    {
        serial++;
        this.serialNumber = serial;
    }

    // a Constructor for objects of class RealEstateTransaction with 4 arguements
    public RealEstateTransaction( String streetNumber,String streetName, String cityName, String purchasePrice)
    {
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.cityName = cityName;
        this.purchasePrice = purchasePrice;
        serial++;
        this.serialNumber = serial;
    }

        //setter for String streetName 
    public void setstreetName(String streetName)
    {
        this.streetName = streetName;
    }
    
    //getter for same
    public String getstreetName()
    {
        return streetName;
    }
    //----------------------------------------
   

    //setter for String streetNumber 
    public void setstreetNumber(String streetNumber)
    {
        this.streetNumber = streetNumber;
    }

    //getter for same
    public String getstreetNumber()
    {
        return streetNumber;
    }
    //----------------------------------------

    //setter for String cityName 
    public void setCityName(String cityName)
    {
        this.cityName = cityName;
    }

    //getter for same
    public String getcityName()
    {
        return cityName;
    }
    //----------------------------------------

    //setter for String cityName 
    public void setPurchasePrice(String purchasePrice)
    {
        this.purchasePrice = purchasePrice;
    }

    //getter for same
    public String getPurchasePrice()
    {
        return purchasePrice;
    }
    //----------------------------------------    

    //getter for serial number    
    public int getSerial()
    {
        return serial;
    }


    //first method to concanate states and print in different cases

    public String equalDividedCases()
    {
        String oneString = streetName+streetNumber+ cityName +purchasePrice;
        int length = oneString.length();

        String firstHalf = oneString.substring(0,length/2);
        String secondHalf = oneString.substring(length/2,length);

        String finalString = firstHalf.toLowerCase()+secondHalf.toUpperCase() ;

        return finalString;
    }

    //SECOND METHOD
    public String RandomNumber()
    {
        //CONCANETING STRING
        String oneString = streetName+streetNumber+ cityName +purchasePrice;
        int length = oneString.length();
        //INITIATING RANDOM OBJECT
        Random random1 = new Random(); 
        int randomNumber1 =random1.nextInt(length);

        //ASSIGNING PART OF STRING TO DIFFERENT VARIABLES
        String firstInput = oneString.substring(0, randomNumber1);
        String lastInput = oneString.substring(randomNumber1,length);

        //CHANGING CASES
        oneString=firstInput.toLowerCase().concat(lastInput.toUpperCase());
        return oneString;
    }

    //third method to print string in two cases according to random number

    public String catchAndReplace(int firstInput, int lastInput)
    {   //concataneting strings
        String oneString = streetName + streetNumber + cityName + purchasePrice;
        int length = oneString.length();

        //storing characters of string in array
        char[] charCollection = oneString.toCharArray();

        //loop will replace all the indicated characters 
        if(firstInput<lastInput && lastInput<length)
        {
            for(int i= lastInput;i<length;i=i+3)
            {
                charCollection[i] = oneString.charAt(firstInput);
            }
            oneString = String.valueOf(charCollection); 
        }

        else
        {
             return "limit exceeded"; 
        }
        return oneString;
    }

    

}
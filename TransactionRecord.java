/**
 * Description: This is bluePrint class , here I defined setters , getters and constructor along with 
 * a constructor with 4 arguments AND A PUBLIC VARIABLE
 * Author: Krishna Tak
 * Date: 27 oct 2020
 * Time: 23:28
 */
public class TransactionRecord
{
    // instance variables - replace the example below with your own
    private boolean canadianFunds;
    private double exchangeRate;
    private int transactionNumber;
    private long transactionReferenceNumber;
    public static int serial= 0;
    public int serialNumber;
    
    //  a default Constructor for objects of class TransactionRecord 
    public TransactionRecord()
    {

    }

    // a Constructor for objects of class TransactionRecord with 4 arguements
    public TransactionRecord(boolean canadianFunds, double exchangeRate, int transactionNumber, long transactionReferenceNumber)
    {
        this.canadianFunds = canadianFunds;
        this.exchangeRate = exchangeRate;
        this.transactionNumber = transactionNumber;
        this.transactionReferenceNumber = transactionReferenceNumber;
        serial++;
        this.serialNumber = serial;

    }

        //setter for boolean canadianFunds 
    public void setCanadianFunds(boolean canadianFunds)
    {
        this.canadianFunds = canadianFunds;
    }
    
    //getter for same
    public boolean getCanadianFunds()
    {
        return canadianFunds;
    }
    //----------------------------------------

    //setter for double exchangeRate 
    public void setExchangeRate(double exchangeRate)
    {
        this.exchangeRate = exchangeRate;
    }

    //getter for same
    public double getExchangeRate()
    {
        return exchangeRate;
    }
    //----------------------------------------

    //setter for int transactionNumber 
    public void setTransactionNumber(int transactionNumber)
    {
        this.transactionNumber = transactionNumber;
    }

    //getter for same
    public int getTransactionNumber()
    {
        return transactionNumber;
    }
    //----------------------------------------

    //setter for long transactionReferenceNumber 
    public void setTransactionReferenceNumber(long transactionReferenceNumber)
    {
        this.transactionReferenceNumber = transactionReferenceNumber;
    }

    //getter for same
    public long getTransactionReferenceNumber()
    {
        return transactionReferenceNumber;
    }
    
    public int getSerial()
    {
        return serial;
    }
}

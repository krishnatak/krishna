/** Application Purpose: To Define the constructor for class, defining instance variable and method for getters and setters
 *  Author: Krishna Tak
 *  Date: 29 September 2020
 *  Time: 2:36 AM
 */ 

import java.util.Calendar;
public class ChequingAccount
{	
	//instance variables to store bank details privately
	private String firstName;
	private String lastName;
	private double closingBalance;
	private int accountNumber;


	//constructor of upper class with four arguements
	public ChequingAccount(String firstName,String lastName,double closingBalance,int accountNumber)
	{
		//storing local variable(from arguement) to instance variable
		this.firstName = firstName;		
		this.lastName = lastName;		
		this.closingBalance = closingBalance;	
		this.accountNumber = accountNumber;
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

	//setter for double closingBalance  
	public void setClosingBalance(double closingBalance)
	{
		this.closingBalance = closingBalance;
	}

	//getter for same
	public double getClosingBalance()
	{
		return closingBalance;
	}
	//----------------------------------------

	//setter for int accountNumber 
	public void setAccountNumber(int accountNumber)
	{
		this.accountNumber = accountNumber;
	}

	//getter for same
	public int getAccountNumber()
	{
		return accountNumber;
	}
	//----------------------------------------
}

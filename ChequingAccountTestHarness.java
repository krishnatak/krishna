/**	Application Purpose: to initiate ChequingAccount object with all properties and 
*	printing with appropriate get methods
*	Author: Krishna Tak
*	Date: 29 September 2020
*	Time: 4:51 AM
*/

public class ChequingAccountTestHarness{

	public static void main(String[]args){

	//Creating new object from contructor of another file with appropriate arguments
	ChequingAccount customer = new ChequingAccount("Krishna","Tak",124.312445d,13456789);
	
	//printing firstName of a customer
	System.out.println("Name of Beneficiary is "+customer.getFirstName());

	//printing lastName of a customer
	System.out.println("lastName of Beneficiary is "+customer.getLastName());

	//printing balance of a customer
	System.out.println("balance of Beneficiary is "+customer.getClosingBalance());

	//printing accountn number of a customer
	System.out.println("accountn number of Beneficiary is "+customer.getAccountNumber());


		
	//challenge 3

	//replacing first name and last name of customer with set method
	
	customer.setFirstName("Narendra");
	customer.setLastName("Modi");

	//REPRINTING our customer's information


	//printing firstName of a customer
	System.out.println("Name of Beneficiary is "+customer.getFirstName());

	//printing lastName of a customer
	System.out.println("lastName of Beneficiary is "+customer.getLastName());

	//printing balance of a customer
	System.out.println("balance of Beneficiary is "+customer.getClosingBalance());

	//printing accountn number of a customer
	System.out.println("accountn number of Beneficiary is "+customer.getAccountNumber());

	}
}
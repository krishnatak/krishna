/**	Application Purpose:The JavaCodeTester2 program performs different string functions
*	Author: Krishna Tak
*	Date: 29 September 2020
*	Time: 3:12 AM
*/
public class JavaCodeTester2{

	public static void main(String[]args){
	
		//string Concatenation

		String firstStep = "footprinting";
		String secondStep = " break ";
		String thirdStep = "access";
		String hacking = firstStep+secondStep+thirdStep ;
		System.out.println(hacking);


		// printing the particular characters of string along with text

		System.out.println(hacking.charAt(2)+""+hacking.charAt(4)+""+ hacking.charAt(6)+
		" These characters are 3rd, 5th and 7th character of the string(footprinting break access"); 


		// Checking whether the string started with "test" or not

		System.out.println(hacking.startsWith("test"));


		// transforming the string to upper-case letters
                 
		System.out.println(hacking.toUpperCase());


		// increment operation

		int sampleNumber = 45;               
		System.out.println(++sampleNumber);
                

		int anotherNumber = 50;               
		System.out.println(anotherNumber++);



		// program to check whether the number is even or odd

		int testNumber = 58;

		if (testNumber %2==0)
		{
			System.out.println("the number is even");
		}
		else
		{
			System.out.println("the number is odd");
		}     

	}
}

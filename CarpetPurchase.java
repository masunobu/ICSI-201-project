package project2;

import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;

/**
 * Write a program that creates customers’ bills for a carpet company.
 * @author Naganobu Masuda
 * @version 1.0
 */

public class CarpetPurchase{
	/**
	* Reads the user input, and determine the carpet price by specified values.
	* @param args A reference to a string array containing command-line arguments
	*/
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		Random randomId = new Random();
		String firstName, lastName, inputLastName, inputFirstName, firstName1, lastName1, firstName2, lastName2, customerId;
		double costSquare, charges, tax, totalPrice;
		int length, width, randomNum, area;
		final double SALES_TAX = 0.085;

		//Input
		//1. Read the customer’s first name entered by user.
		System.out.print("Enter your first name: ");
		inputFirstName = scan.next();
		
		//2. Read the customer’s last name entered by user.
		System.out.print("Enter your last name: ");
		inputLastName = scan.next();
		
		//3. Read the length of the carpet in feet entered by user.
		System.out.print("Enter length of room (feet): ");
		length = scan.nextInt();
		
		//4. Read the width of the carpet in feet entered by user.
		System.out.print("Enter width of room (feet): ");
		width = scan.nextInt();
		
		//5. Read the carpet price per square foot entered by user.
		System.out.print("Enter cost per square foot: ");
		costSquare = scan.nextDouble();

		
		//Process
		//6. Capitalize the first character of customer’s last name and first name.
		lastName1 = inputLastName.substring(0,1);
		lastName1 = lastName1.toUpperCase();
		firstName1 = inputFirstName.substring(0,1);
		firstName1 = firstName1.toUpperCase();
		
		//7. Uncapitalized from the second character of the customer’s last name and first name.
		lastName2 = inputLastName.substring(1);
		lastName2 = lastName2.toLowerCase();
		firstName2 = inputFirstName.substring(1);
		firstName2 = firstName2.toLowerCase();

		//8. Put the capitalized first character and uncapitalized from the second character of customer’s last name and first name together.
		lastName = lastName1.concat(lastName2);
		firstName = firstName1.concat(firstName2);
		
		//9. Put the first character of first name and first five characters of last name together, and add random two-digit number in the range 10 to 99 in the last to get ID.
		randomNum = randomId.nextInt(90)+10;
		if (lastName.length() >= 5){
			customerId = firstName.substring(0,1) + lastName.substring(0,5) + randomNum;
		}else{
			customerId = firstName.substring(0,1) + lastName.substring(0) + randomNum;
		}
		
		//10. Multiply the length and width to get area of the carpet.
		area = length * width;
		
		//11. Multiply the result by the carpet price per square foot to get charges.
		charges = area * costSquare;
		
		//12. Multiply the result by percentage of tax to get charged tax.
		tax = charges * SALES_TAX;
		
		//13. Sum the charges and charged tax up to get total price.
		totalPrice = charges + tax;
		
		//Output
		System.out.println("\nCUSTOMER");
		//14. Display the last name.
		System.out.println("Last Name\t" + lastName);
		//15. Display the first name.
		System.out.println("First Name\t" + firstName);
		//16. Display the result of ID.
		System.out.println("ID\t\t" + customerId);
		
		DecimalFormat dfMea = new DecimalFormat("000");
		System.out.println("\nMEASUREMENT");
		//17. Display the length of the carpet in feet.
		System.out.println("Length\t\t" + dfMea.format(length) + " feet");
		//18. Display the width of the carpet in feet.
		System.out.println("Width\t\t" + dfMea.format(width) + " feet");
		//19. Display the area of the carpet in feet.
		System.out.println("Area\t\t" + dfMea.format(area) + " square feet");
		
		System.out.println("\nCHARGES");
		System.out.println("Description\t" + "Cost/Sq.Ft.\t" + "Charges");
		System.out.println("-----------\t" + "-----------\t" + "--------");
		
		System.out.print("Carpet\t\t");
		//20. Display the carpet price per square foot entered by user.
		DecimalFormat dfCost = new DecimalFormat("00.00");
		System.out.print(dfCost.format(costSquare) + "\t\t");
		//21. Display the result of charges.
		DecimalFormat dfChar = new DecimalFormat("0000.00");
		System.out.println("$" + dfChar.format(charges));
		
		System.out.print("Tax\t\t");
		//22. Display the percentage of tax.
		DecimalFormat dfPer = new DecimalFormat(" 0.00%");
		System.out.print(dfPer.format(SALES_TAX) + "\t\t");
		//23. Display the result of charged tax.
		System.out.println(" " + dfChar.format(tax));
		
		System.out.println("\t\t\t\t--------");
		
		System.out.print("Total\t\t\t\t");
		//24. Display the result of total price.
		System.out.println("$" + dfChar.format(totalPrice));
	
		scan.close();
	}
}

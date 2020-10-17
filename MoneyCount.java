package project1;

import java.util.Scanner;

/**
 * Determine the fewest number of each bill and coin needed to represent that amount.
 * @author Naganobu Masuda
 * @version 1.0
 */

public class MoneyCount{
	/**
	* Reads a amount, and determine the fewest number of each bill and coin needed
	* to represent that amount.
	* @param args A reference to a string array containing command-line arguments
	*/
	public static void main(String[] args){
		double originalAmount;
		int amountInPennies, remainBalance, tenDollar, fiveDollar, oneDollar, quarter, dime, nickel, penny;
		Scanner scan = new Scanner(System.in);

		//1. Read a amount entered by user.
		System.out.print("Enter monetary amount:");
		originalAmount = scan.nextDouble();

		//2. Multiply the amount by 100 to convert as penny amount.
		amountInPennies = (int)(originalAmount * 100);

		//3. Divide the amount in pennies by 1000 to find the number of using $10 bills.
		//4. And then, divide the amount by 1000 and take the remainder.
		tenDollar = amountInPennies / 1000;
		remainBalance = amountInPennies % 1000;

		//5. Divide the remainder by 500 to find the number of using $5 bills.
		//6. And then, divide the remainder by 500 and take the remainder again.
		fiveDollar = remainBalance / 500;
		remainBalance = remainBalance % 500;

		//7. Divide the remainder by 100 to find the number of using $1 bills.
		//8. And then, divide the remainder by 100 and take the remainder again.
		oneDollar = remainBalance / 100;
		remainBalance = remainBalance % 100;

		//9. Divide the remainder by 25 to find the number of using $0.25 coins.
		//10. And then, divide the remainder by 25 and take the remainder again.
		quarter = remainBalance / 25;
		remainBalance = remainBalance % 25;

		//11. Divide the remainder by 10 to find the number of using $0.10 coins.
		//12. And then, divide the remainder by 10 and take the remainder again.
		dime = remainBalance / 10;
		remainBalance = remainBalance % 10;

		//13. Divide the remainder by 5 to find the number of using $0.05 coins.
		//14. And then, divide the remainder by 5 and take the remainder again.
		nickel = remainBalance / 5;
		remainBalance = remainBalance % 5;

		//15. Divide the remainder by 1 to find the number of using $0.01 coins.
		penny = remainBalance / 1;

		//16. Display the determined fewest number of each bill and coin.
		System.out.println("That's equivalent to:");
		System.out.println( tenDollar + " ten dollar bills");
		System.out.println( fiveDollar + " five dollar bills");
		System.out.println( oneDollar + " one dollar bills");
		System.out.println( quarter + " quarters");
		System.out.println( dime + " dimes");
		System.out.println( nickel + " nickels");
		System.out.println( penny + " pennies");

		scan.close();
	}
}

package project3;

import java.util.Scanner;

/**
* Write a program to prompt the user for 2 dates consisting of a month and a year 
* and display the number of years and months between these 2 dates.
* @author Naganobu Masuda
* @version 1.0
*/

public class YearDifference{
	/**
	* Reads the user input, and display the number of years and months between these 2 dates.
	* @param args A reference to a string array containing command-line arguments
	*/
	public static void main(String[] args) {
		String firstMonth, secondMonth;
		int firstYear, secondYear, diffYear, diffMonth;
		int firstMonthNumber=0, secondMonthNumber=0;
		Scanner input = new Scanner(System.in);
		
		// 1. Read the first month and year entered by user.
		System.out.println("For the first date,");
		System.out.println("Enter month: ");
		firstMonth = input.next();
		System.out.println("Enter year: ");
		firstYear = input.nextInt();
		
		// 2. Read the second month and year entered by user.
		System.out.println("For the second date,");
		System.out.println("Enter month: ");
		secondMonth = input.next();
		System.out.println("Enter year: ");
		secondYear = input.nextInt();
		
		// 3. Store the first month as a String value and as an integer value.
		if(firstMonth.equalsIgnoreCase("January")){
			 firstMonthNumber = 1;
		}else if(firstMonth.equalsIgnoreCase("February")){
			 firstMonthNumber = 2;
		}else if(firstMonth.equalsIgnoreCase("March")){
			 firstMonthNumber = 3;
		}else if(firstMonth.equalsIgnoreCase("April")){
			 firstMonthNumber = 4;
		}else if(firstMonth.equalsIgnoreCase("May")){
			 firstMonthNumber = 5;
		}else if(firstMonth.equalsIgnoreCase("June")){
			 firstMonthNumber = 6;
		}else if(firstMonth.equalsIgnoreCase("July")){
			 firstMonthNumber = 7;
		}else if(firstMonth.equalsIgnoreCase("August")){
			 firstMonthNumber = 8;
		}else if(firstMonth.equalsIgnoreCase("September")){
			 firstMonthNumber = 9;
		}else if(firstMonth.equalsIgnoreCase("October")){
			 firstMonthNumber = 10;
		}else if(firstMonth.equalsIgnoreCase("November")){
			 firstMonthNumber = 11;
		}else if(firstMonth.equalsIgnoreCase("December")){
			 firstMonthNumber = 12;
		}
		
		// 4. Store the second month as a String value and as an integer value.
		if(secondMonth.equalsIgnoreCase("January")){
			secondMonthNumber = 1;
		}else if(secondMonth.equalsIgnoreCase("February")){
			secondMonthNumber = 2;
		}else if(secondMonth.equalsIgnoreCase("March")){
			secondMonthNumber = 3;
		}else if(secondMonth.equalsIgnoreCase("April")){
			secondMonthNumber = 4;
		}else if(secondMonth.equalsIgnoreCase("May")){
			secondMonthNumber = 5;
		}else if(secondMonth.equalsIgnoreCase("June")){
			secondMonthNumber = 6;
		}else if(secondMonth.equalsIgnoreCase("July")){
			secondMonthNumber = 7;
		}else if(secondMonth.equalsIgnoreCase("August")){
			secondMonthNumber = 8;
		}else if(secondMonth.equalsIgnoreCase("September")){
			secondMonthNumber = 9;
		}else if(secondMonth.equalsIgnoreCase("October")){
			secondMonthNumber = 10;
		}else if(secondMonth.equalsIgnoreCase("November")){
			secondMonthNumber = 11;
		}else if(secondMonth.equalsIgnoreCase("December")){
			secondMonthNumber = 12;
		}
		
		// 5. Subtract the earlier year from the later year to get the year difference.
		// 6. Subtract the month associated with the earlier year from the month associated with the later year.
		if(firstYear < secondYear){
			diffYear = secondYear - firstYear;
			if(secondMonthNumber >= firstMonthNumber){
				diffMonth = secondMonthNumber - firstMonthNumber;
			}else{
				diffYear -=1;
				diffMonth = (secondMonthNumber + 12) - firstMonthNumber;
			}
		}
		
		else if(firstYear == secondYear){
			diffYear = 0;			
			if(secondMonthNumber >= firstMonthNumber){
				diffMonth = secondMonthNumber - firstMonthNumber;
			}else{
				diffMonth = firstMonthNumber - secondMonthNumber;
			}
		}
		
		else{
			diffYear = firstYear - secondYear;
			if(firstMonthNumber >= secondMonthNumber){
				diffMonth = firstMonthNumber - secondMonthNumber;
			}else{
				diffYear -=1;
				diffMonth = (firstMonthNumber + 12) - secondMonthNumber;
			}
		}
		
		// 7. Display the result of first/second date difference.
		System.out.println("These dates are " + diffYear + " years and " + diffMonth + " months apart.");
		input.close();
	}
}
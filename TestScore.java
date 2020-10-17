package project4;

import java.text.DecimalFormat;
import java.util.Scanner; 
import java.io.PrintWriter; 
import java.io.IOException;
import java.io.File;

/**
* Write a program to read test scores, process scores, and display a final report
* or save the report into a text file. 
* A report is generated for a class of 4 students. 
* @author Naganobu Masuda
* @version 1.0
*/

public class TestScore{
	/**
	* Let user process the scores so that
	* user can display a report, save the report into a file.
	* @param args A reference to a string array containing command-line arguments
	*/
	public static void main(String[] args)  throws IOException{
		String fileName;
		int choice = 0, score;
		final int GRADE_REPORT = 1;
		final int GRADE_REPORT_IN_FILE = 2;
		final int EXIT = 3;
		final int TEST = 2;
		Scanner scan = new Scanner(System.in);
		PrintWriter outputFile;
		DecimalFormat dfTest = new DecimalFormat("000");
		DecimalFormat dfAve = new DecimalFormat("000.0");
		
		int[] testOne = new int[4]; 
		int[] testTwo = new int[4]; 
		double[] average = new double[4];
		char[] grade = new char[4];
		
		do{
			// 1. Let user select to display a final report or to save the report into a text file.
			// 2. The same menu is displayed for more choices till users select to quit. 
			System.out.println("Welcome to Grade Center!");
			System.out.println("Enter 1 to generate and display a grade report.");
			System.out.println("Enter 2 to generate a grade report and save it into a file.");
			System.out.println("Enter 3 to quit.");
			System.out.print("Enter a choice: ");
			choice = scan.nextInt();
			System.out.println();
			
			switch(choice){
				// 3. Code for if users select to display a final report.
				// 4. Prompt user to enter grades for test1 and test2 of four students.
				case GRADE_REPORT:
					System.out.println("Enter grades for test1 and test2");
					for(int i = 0; i < TEST; i++){
						System.out.println("For test " + (i+1) + ",");
						switch(i){
							case 0:
								for(int j = 0; j < testOne.length; j++){
									System.out.print("Enter score " + (j+1) + ": ");
									score = scan.nextInt();
									testOne[j] = score;
								}
								System.out.println();
								break;
							case 1:
								for(int j = 0; j < testTwo.length; j++){
									System.out.print("Enter score " + (j+1) + ": ");
									score = scan.nextInt();
									testTwo[j] = score;
								}
								System.out.println();
								break;
						}
					}
					// 5. Display the report which have test scores, average scores, and assigned letter grades.
					System.out.println("Test 1\t" + "Test 2\t" + "Average\t" +"Grade");
					System.out.println("------\t" + "------\t" + "------\t" +"------");
					for(int i = 0; i<testOne.length; i++){
						average[i] = (testOne[i] + testTwo[i]) / 2;
						System.out.print(dfTest.format(testOne[i]) + "\t");
						System.out.print(dfTest.format(testTwo[i]) + "\t");
						System.out.print(dfAve.format(average[i]) + "\t");
						if(average[i] > 90){
							grade[i] = 'A';
						}else if(average[i] > 80){
							grade[i] = 'B';
						}else if(average[i] > 70){
							grade[i] = 'C';
						}else{
							grade[i] = 'F';
						}
						System.out.println(grade[i]);
					}
					System.out.println("\n");
					break;
				
				// 6. Code for if users select to save the report into a text file.
				// 7. Prompt user to enter grades for test1 and test2 of four students.
				case GRADE_REPORT_IN_FILE:
					System.out.println("Enter grades for test1 and test2");
					for(int i = 0; i < TEST; i++){
						System.out.println("For test " + (i+1) + ",");
						switch(i){
							case 0:
								for(int j = 0; j < testOne.length; j++){
									System.out.print("Enter score " + (j+1) + ": ");
									score = scan.nextInt();
									testOne[j] = score;
								}
								System.out.println();
								break;
							case 1:
								for(int j = 0; j < testTwo.length; j++){
									System.out.print("Enter score " + (j+1) + ": ");
									score = scan.nextInt();
									testTwo[j] = score;
								}
								System.out.println();
								break;
						}
					}
					// 8. Create report and save it into file whose name scanned by user.
					System.out.println("A new file will be created for the report.");
					System.out.println("Enter the new file name(For example, MyReport.txt.):");
			        fileName = scan.next();
					System.out.println("Report written into a file: " + fileName);
			        File file = new File(fileName);
				    outputFile = new PrintWriter(file);
				    outputFile.println("Test 1\t" + "Test 2\t" + "Average\t" +"Grade");
				    outputFile.println("------\t" + "------\t" + "------\t" +"------");
					for(int i = 0; i<testOne.length; i++){
						average[i] = (testOne[i] + testTwo[i]) / 2;
						outputFile.print(dfTest.format(testOne[i]) + "\t");
						outputFile.print(dfTest.format(testTwo[i]) + "\t");
						outputFile.print(dfAve.format(average[i]) + "\t");
						if(average[i] > 90){
							grade[i] = 'A';
						}else if(average[i] > 80){
							grade[i] = 'B';
						}else if(average[i] > 70){
							grade[i] = 'C';
						}else{
							grade[i] = 'F';
						}
						outputFile.println(grade[i]);
					}
					outputFile.close();
					break;
					
				// 9. Quit the program if users select.
				case EXIT:
					break;
			}
		}while(choice==GRADE_REPORT || choice==GRADE_REPORT_IN_FILE);
		scan.close();
	}
}
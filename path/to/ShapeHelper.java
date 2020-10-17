package project5;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
* Write a program to model a generic shape and a list of 
* specific shapes such as a rectangle, a triangle, and a circle.
* @author Naganobu Masuda
* @version 1.0
*/

public class ShapeHelper {
	public static void start() throws FileNotFoundException{
		Scanner input = new Scanner(System.in);
		String fileName;
		ArrayList<Shape> shapes;
		
		/*
		 * prompts user to enter file name to read data.
		 */
		System.out.println("Enter a file name: ");
		fileName = input.nextLine();
		
		/*
		 * calls create that returns a list of shapes.
		 * calls display to print the list of shapes in order.
		 */
		shapes = create(fileName);
		display(shapes);
		input.close();
		}
	
	public static ArrayList<Shape> create(String fileName) throws FileNotFoundException{
		/*
		 * shape data is stored in data file named "shape.txt" in myDataSource directory.
		 * enter the file name in order to read data from it.
		 */
		Scanner inputfile = new Scanner(new File("./myDataSource/" + fileName));
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		

		while (inputfile.hasNextLine()){
			
			String x = inputfile.next();
			
			/*
			 * reads if there are data following Strings "Rectangle".
			 * adds its parameter into Array list. 
			 */
			if(x.equals("Rectangle")){
				inputfile.nextLine();
				String line = inputfile.nextLine();
				double value = inputfile.nextDouble();
				shapes.add(new Rectangle());
				shapes.add(new Rectangle(line, value, value));
			}
			
			/*
			 * reads if there are data following Strings "Triangle".
			 * adds its parameter into Array list. 
			 */
			else if(x.equals("Triangle")){
				inputfile.nextLine();
				String line = inputfile.nextLine();
				double value = inputfile.nextDouble();
				shapes.add(new Triangle());
				shapes.add(new Triangle(line, value, value, value));
			}
			
			/*
			 * reads if there are data following Strings "Circle".
			 * adds its parameter into Array list. 
			 */
			else if(x.equals("Circle")){
				inputfile.nextLine();
				String line = inputfile.nextLine();
				double value = inputfile.nextDouble();
				shapes.add(new Circle());
				shapes.add(new Circle(line, value));
			}
		}
		/*
		 * closes input.
		 */
		inputfile.close();
		return shapes;
	}
	
	/*
	 * displays each values that stored into array list.
	 */
	public static void display(ArrayList<Shape> shapes){
		for(int i = 0; i < shapes.size(); i++){
			System.out.println(shapes.get(i));
		}
	}

}
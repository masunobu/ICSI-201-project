package project5;

/**
* Write a program to model a generic shape and a list of 
* specific shapes such as a rectangle, a triangle, and a circle.
* @author Naganobu Masuda
* @version 1.0
*/
public class InvalidTriangleException extends Exception {
	 public InvalidTriangleException(String message) {
		 super(message);
	 }
}
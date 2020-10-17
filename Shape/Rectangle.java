package project5;

/**
* Write a program to model a generic shape and a list of 
* specific shapes such as a rectangle, a triangle, and a circle.
* @author Naganobu Masuda
* @version 1.0
*/

public class Rectangle extends Shape {
	
	/** 
	 * The length of Rectangle
	 */
	
	private double length;
	/** 
	 * The width of Rectangle
	 */
	
	private double width;
	
	/**
	 *  Constructs a newly created Rectangle object.
	 */
	public Rectangle(){
		super("Rectangle");
		this.length = 1.0;
		this.width = 1.0;
	}
	
	/**
	 * Constructs a newly created Rectangle object that represents parameter of Rectangle.
	 * @param The name, length and width of Rectangle
	 */
	public Rectangle(String name, double length, double width){
		super(name);
		this.length = length;
		this.width = width;
	}
	
	/**
	 * Returns the length of Rectangle.
	 * @return The length of Rectangle
	 */
	public double getLength(){
		return this.length;
	}
	
	/**
	 * Changes the length of Rectangle.
	 * @param The length of Rectangle
	 */
	public void setLength(double length){
		this.length = length;
	}
	
	/**
	 * Returns the width of Rectangle.
	 * @return The width of Rectangle
	 */
	public double getWidth(){
		return this.width;
	}
	
	/**
	 * Changes the length of Rectangle.
	 * @param The length of Rectangle
	 */
	public void setWidth(double width){
		this.width = width;
	}
	
	/**
	 * Creates the abstract method that calls equation of area of the Rectangle.
	 */
	public double area(){
		return this.length * this.width;
	}
	
	/**
	 * Returns a string representation of this shape name, value of its calculated area and parameter.
	 * @return A String specifying the name of this shape and value of its calculated area.
	 */
	public String toString(){
		return super.toString() + "\t\tlength:" + this.length + ",\twidth:" + this.width + "\n";
	}
	
	/**
	 * Indicates if this shape is "equal to" some other object. If the other object is a diagram, 
	 * this shape is equal to the other shape if they have the same names, lengths and widths. If the other object is
	 * not a shape, this shape is not equal to the other object. 
	 * @param obj An Object reference to a specific object
	 * @return A boolean value specifying whether this shape is equal to some other object
	 */
	public boolean equals(Object obj){
		if(!(obj instanceof Rectangle))
			return false;
		
		Rectangle other = (Rectangle)obj;
		return super.equals(other) && this.length == other.length && this.width == other.width;
	}
}

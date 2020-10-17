package project5;

/**
* Write a program to model a generic shape and a list of 
* specific shapes such as a rectangle, a triangle, and a circle.
* @author Naganobu Masuda
* @version 1.0
*/

public class Circle extends Shape {
	
	/** 
	 * The radius of Circle
	 */
	private double radius;
	
	/**
	 *  Constructs a newly created Circle object.
	 */
	public Circle(){
		super("Circle");
		this.radius = 1.0;
	}
	
	/**
	 * Constructs a newly created Circle object that represents parameter of Circle.
	 * @param The name and radius of Circle
	 */
	public Circle(String name, double radius){
		super(name);
		this.radius = radius;
	}
	
	/**
	 * Returns the radius of Circle.
	 * @return The radius of Circle
	 */
	public double getRadius(){
		return this.radius;
	}
	
	/**
	 * Changes the radius of Circle.
	 * @param The radius of Circle
	 */
	public void setRadius(double radius){
		this.radius = radius;
	}
	
	/**
	 * Creates the abstract method that calls equation of area of the Circle.
	 */
	public double area(){
		return Math.pow(this.radius,2) * Math.PI;
	}
	
	/**
	 * Returns a string representation of this shape name, value of its calculated area and parameter.
	 * @return A String specifying the name of this shape and value of its calculated area.
	 */
	public String toString(){
		return super.toString() + "\t\tradius:" + this.radius + "\n";
	}
	
	/**
	 * Indicates if this shape is "equal to" some other object. If the other object is a diagram, 
	 * this shape is equal to the other shape if they have the same names and radius. If the other object is
	 * not a shape, this shape is not equal to the other object. 
	 * @param obj An Object reference to a specific object
	 * @return A boolean value specifying whether this shape is equal to some other object
	 */
	public boolean equals(Object obj){
		if(!(obj instanceof Circle))
			return false;
		
		Circle other = (Circle)obj;
		return super.equals(other) && this.radius == other.radius;
	}
}

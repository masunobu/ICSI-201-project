package project5;

/**
* Write a program to model a generic shape and a list of 
* specific shapes such as a rectangle, a triangle, and a circle.
* @author Naganobu Masuda
* @version 1.0
*/

public abstract class Shape {
	
	/** 
	 * The name of shape
	 */
	protected String name;
	
	/**
	 *  Constructs a newly created Shape object.
	 */
	protected Shape(){
	}
	
	/**
	 * Constructs a newly created Shape object that represents the name of shape.
	 * @param The name of shape
	 */
	protected Shape(String name){
		this.name = name;
	}

	/**
	 * Returns the name of shape.
	 * @return The name of shape.
	 */
	public String getName (){
	  return this.name;
	}
	
	/**
	 * Changes the name of shape.
	 * @param The name of shape
	 */
	public void setName (String name){
	  this.name = name;
	}
	
	/**
	 * Creates the abstract method that calls equation of area of the shape.
	 */
	public abstract double area();
	
	/**
	 * Returns a string representation of this shape name and value of its calculated area.
	 * @return A String specifying the name of this shape and value of its calculated area.
	 */
	public String toString(){
		return "[" + this.getClass().getSimpleName() + "] : " + this.name + ", [Area] : " + this.area() + "\n";
	}
	
	/**
	 * Indicates if this shape is "equal to" some other object. If the other object is a diagram, 
	 * this shape is equal to the other shape if they have the same names. If the other object is
	 * not a shape, this shape is not equal to the other object. 
	 * @param obj An Object reference to a specific object
	 * @return A boolean value specifying whether this shape is equal to some other object
	 */
	public boolean equals(Object obj){
		if(!(obj instanceof Shape))
			return false;
		
		Shape other = (Shape)obj;
		return this.name == other.name;
	}
}
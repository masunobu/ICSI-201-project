package project5;

/**
* Write a program to model a generic shape and a list of 
* specific shapes such as a rectangle, a triangle, and a circle.
* @author Naganobu Masuda
* @version 1.0
*/

public class Triangle extends Shape {
	
	/** 
	 * The first length of side of Triangle
	 */
	private double sideOne;
	
	/** 
	 * The second length of side of Triangle
	 */
	private double sideTwo;
	
	/** 
	 * The third length of side of Triangle
	 */
	private double sideThree;
	
	/**
	 *  Constructs a newly created Triangle object.
	 */
	public Triangle(){
		super("Triangle");
		this.sideOne = 1.0;
		this.sideTwo = 1.0;
		this.sideThree = 1.0;
	}
	
	/**
	 * Constructs a newly created Triangle object that represents parameter of Triangle.
	 * Judges whether each sides of triangle are able to make proper Triangle.
	 * @param The name, first side, second side and third side of Triangle
	 */
	public Triangle(String name, double sideOne, double sideTwo, double sideThree){
		super(name);
		try{
			if(sideOne + sideTwo >= sideThree &&
					sideTwo + sideThree >= sideOne &&
					sideOne + sideThree >= sideTwo){
				this.sideOne = sideOne;
				this.sideTwo = sideTwo;
				this.sideThree = sideThree;
			}else{
				throw new InvalidTriangleException("it will not make triangle");
			}
		}catch (InvalidTriangleException ex){
			ex.printStackTrace();
		}catch (Exception ex){
			ex.printStackTrace();
		}
	}
	
	/**
	 * Returns the first side of Triangle.
	 * @return The first side of Triangle
	 */
	public double getSideOne(){
		return this.sideOne;
	}
	
	/**
	 * Changes the first side of Triangle.
	 * @param The first side of Triangle
	 */
	public void setSideOne(double sideOne){
		this.sideOne = sideOne;
	}
	
	/**
	 * Returns the second side of Triangle.
	 * @return The second side of Triangle
	 */
	public double getSideTwo(){
		return this.sideTwo;
	}
	
	/**
	 * Changes the second side of Triangle.
	 * @param The second side of Triangle
	 */
	public void setSideTwo(double sideTwo){
		this.sideTwo = sideTwo;
	}
	
	/**
	 * Returns the third side of Triangle.
	 * @return The third side of Triangle
	 */
	public double getSideThree(){
		return this.sideThree;
	}
	
	/**
	 * Changes the third side of Triangle.
	 * @param The third side of Triangle
	 */
	public void setSideThree(double sideThree){
		this.sideThree= sideThree;
	}
	
	/**
	 * Creates the abstract method that calls equation of area of the Triangle.
	 */
	public double area(){
		double semiPeri = (this.sideOne + this.sideTwo + this.sideThree) / 2;
		double triangleArea = Math.sqrt(semiPeri * (semiPeri - this.sideOne) * 
								(semiPeri - this.sideTwo) * (semiPeri - this.sideThree));
		return triangleArea;
	}
	
	/**
	 * Returns a string representation of this shape name, value of its calculated area and parameter.
	 * @return A String specifying the name of this shape and value of its calculated area.
	 */
	public String toString(){
		return super.toString() + "\t\tsideOne:" + this.sideOne + ",\tsideTwo:" + this.sideTwo + "\tsideThree:" + this.sideThree + "\n";
	}
	
	/**
	 * Indicates if this shape is "equal to" some other object. If the other object is a diagram, 
	 * this shape is equal to the other shape if they have the same names and each sides. If the other object is
	 * not a shape, this shape is not equal to the other object. 
	 * @param obj An Object reference to a specific object
	 * @return A boolean value specifying whether this shape is equal to some other object
	 */
	public boolean equals(Object obj){
		if(!(obj instanceof Triangle))
			return false;
		
		Triangle other = (Triangle)obj;
		return super.equals(other) && this.sideOne == other.sideOne 
				&& this.sideTwo == other.sideTwo && this.sideThree == other.sideThree;
	}
}

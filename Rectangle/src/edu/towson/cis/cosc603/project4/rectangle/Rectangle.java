package edu.towson.cis.cosc603.project4.rectangle;

// TODO: Auto-generated Javadoc
/**
 * The Class Rectangle.
 */
public class Rectangle {
	
	/** The p2. */
	private Point p1, p2;
	private double width, length;  
	//created new variable width and length: A = width * height
	
	/**
	 * Instantiates a new rectangle.
	 *
	 * @param p1 the p1
	 * @param p2 the p2
	 */
	Rectangle(Point p1, Point p2) {
		this.p1 = p1;
		this.p2 = p2;
		
		//initialized the new variable 
		width = this.p2.x - this.p1.x; 
		length = this.p2.y - this.p1.y; 
	}
	
	/**
	 * Gets the area.
	 *
	 * @return the area
	 */
	public Double getArea() {
		
		double area= Math.abs(length  * width); 
		
		return area; 
		
	}
	
	
	/**
	 * Gets the diagonal.
	 *
	 * @return the diagonal
	 */
	public Double getDiagonal() {
		double diag; 
		
		double i = Math.pow(length, 2); 
		double j = Math.pow(width, 2); 
		
		diag = Math.sqrt(i + j); 
		return diag; 
	}
}

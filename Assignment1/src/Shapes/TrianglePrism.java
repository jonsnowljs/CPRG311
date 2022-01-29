package Shapes;

public class TrianglePrism extends Prism {

	/**
	 * Constructor with height and side
	 * @param height height of the TrianglePrism
	 * @param side side of the TrianglePrism
	 */
	public TrianglePrism(double height, double side) {
		super(height, side);
	}
	
	@Override
	public double calcVolume() {
		return calcBaseArea() * this.height;	
	}

	@Override
	public double calcBaseArea() {
		return (Math.pow(getSide(), 2) * Math.sqrt(3)) / 4;
	}

	/**
	 * Gets the side of the TrianglePrism 
	 * @return side of the TrianglePrism
	 */
	public double getSide() {
		return side;
	}

	/**
	 * Sets the side of the TrianglePrism
	 * @param side new side value
	 */
	public void setSide(double side) {
		this.side = side;
	}
	
	/**
	 * Gets the height of the TrianglePrism 
	 * @return height of the TrianglePrism
	 */
	public double getHeight() {
		return height;
	}
	
	/**
	 * Sets the height of the TrianglePrism
	 * @param height new height value
	 */
	public void setHeight(double height) {
		this.height = height;
	}
	
	/**
	 * toString method to display the object
	 */
	@Override
	public String toString() {
		return "Triangular Prism: " + getHeight() + " " + getSide();
	}

}

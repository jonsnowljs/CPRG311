package shapes;

public class SquarePrism extends Prism {

	/**
	 * Constructor with height and side
	 * @param height height of the SquarePrism
	 * @param side side of the SquarePrism
	 */
	public SquarePrism(double height, double side) {
		super(height, side);
	}
	
	@Override
	public double calcVolume() {
		return Math.pow(this.side, 2) * this.height;	
	}

	@Override
	public double calcBaseArea() {
		return Math.pow(getSide(), 2);
	}
	
	/**
	 * Gets the side of the SquarePrism 
	 * @return side of the SquarePrism
	 */
	public double getSide() {
		return side;
	}

	/**
	 * Sets the side of the SquarePrism
	 * @param side new side value
	 */
	public void setSide(double side) {
		this.side = side;
	}
	
	/**
	 * Gets the height of the SquarePrism 
	 * @return height of the SquarePrism
	 */
	public double getHeight() {
		return height;
	}
	
	/**
	 * Sets the height of the SquarePrism
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
		return "Square Prism: " +  + getHeight() + " " + getSide();
	}
}

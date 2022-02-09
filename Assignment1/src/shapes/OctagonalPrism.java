package Shapes;

public class OctagonalPrism extends Prism {

	/**
	 * Constructor with height and side
	 * 
	 * @param height height of the OctagonalPrism
	 * @param side   side of the OctagonalPrism
	 */
	public OctagonalPrism(double height, double side) {
		super(height, side);
	}

	@Override
	public double calcVolume() {
		return calcBaseArea() * this.height;
	}

	@Override
	public double calcBaseArea() {
		return 2 * (1 + Math.sqrt(2)) * Math.pow(getSide(), 2);
	}

	/**
	 * Gets the side of the OctagonalPrism
	 * 
	 * @return side of the OctagonalPrism
	 */
	public double getSide() {
		return side;
	}

	/**
	 * Sets the side of the OctagonalPrism
	 * 
	 * @param side new side value
	 */
	public void setSide(double side) {
		this.side = side;
	}

	/**
	 * Gets the height of the OctagonalPrism
	 * 
	 * @return height of the OctagonalPrism
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * Sets the height of the OctagonalPrism
	 * 
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
		return "Octagonal Prism: " + getHeight() + " " + getSide();
	}
}

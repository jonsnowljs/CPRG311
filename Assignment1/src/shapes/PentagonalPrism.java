package shapes;

/**
 * Inherit from shape class, represent the Pentagonal Prism shape
 * 
 * @author Desmond Yuen
 *
 */

public class PentagonalPrism extends Prism {

	/**
	 * Constructor with height and side for Pentagonal Prism
	 * 
	 * @param height height of the PentagonalPrism
	 * @param side   side of the PentagonalPrism
	 */
	public PentagonalPrism(double height, double side) {
		super(height, side);
	}

	/**
	 * Calculates volume of a Pentagonal Prism
	 *
	 * @return double returns the volume of a given Pentagonal Prism
	 */
	@Override
	public double calcVolume() {
		return calcBaseArea() * this.height;
	}

	/**
	 * Calculates base area of a Pentagonal Prism
	 *
	 * @return double returns the base area of a given Pentagonal Prism
	 */
	@Override
	public double calcBaseArea() {
		return 0.25 * Math.sqrt(5 * (5 + 2 * Math.sqrt(5))) * Math.pow(getSide(), 2);
	}

	/**
	 * Gets the side of the PentagonalPrism
	 * 
	 * @return side of the PentagonalPrism
	 */
	public double getSide() {
		return side;
	}

	/**
	 * Sets the side of the PentagonalPrism
	 * 
	 * @param side new side value
	 */
	public void setSide(double side) {
		this.side = side;
	}

	/**
	 * Gets the height of the PentagonalPrism
	 * 
	 * @return height of the PentagonalPrism
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * Sets the height of the PentagonalPrism
	 * 
	 * @param height new height value
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	/**
	 * Prints the PentagonalPrism Shape
	 *
	 * @return String Returns the PentagonalPrism Object
	 */
	@Override
	public String toString() {
		return "Pentagonal " + super.toString() + "\n";
	}

}

package shapes;

/**
 * Inherit from shape class, represent the Triangular Prism shape
 * 
 * @author Hardish Chander
 *
 */

public class TrianglePrism extends Prism {

	/**
	 * Constructor for a TrianglePrism with height and side
	 * 
	 * @param height height of the TrianglePrism
	 * @param side   side of the TrianglePrism
	 */
	public TrianglePrism(double height, double side) {
		super(height, side);
	}

	/**
	 * Calculates volume of a Triangular Prism
	 *
	 * @return double returns the volume of a given Triangular Prism
	 */
	@Override
	public double calcVolume() {
		return calcBaseArea() * this.height;
	}

	/**
	 * Calculates base area of a Triangular Prism
	 *
	 * @return double returns the base area of a given Triangular Prism
	 */
	@Override
	public double calcBaseArea() {
		return (Math.pow(getSide(), 2) * Math.sqrt(3)) / 4;
	}

	/**
	 * Gets the side of the TrianglePrism
	 * 
	 * @return side of the TrianglePrism
	 */
	public double getSide() {
		return side;
	}

	/**
	 * Sets the side of the TrianglePrism
	 * 
	 * @param side new side value
	 */
	public void setSide(double side) {
		this.side = side;
	}

	/**
	 * Prints the TrianglePrism Shape
	 *
	 * @return String Returns the TrianglePrism Object
	 */
	@Override
	public String toString() {
		return String.format("%-20s %s\n", "Triangle Prism:=", super.toString());

	}

}

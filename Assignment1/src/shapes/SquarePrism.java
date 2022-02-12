package shapes;

/**
 * Inherit from shape class, represent the Square Prism shape
 * 
 * @author Hardish Chander
 *
 */

public class SquarePrism extends Prism {

	/**
	 * Constructor for a Square Prism with height and side
	 * 
	 * @param height height of the SquarePrism
	 * @param side   side of the SquarePrism
	 */
	public SquarePrism(double height, double side) {
		super(height, side);
	}

	/**
	 * Calculates volume of a Square Prism
	 *
	 * @return double returns the volume of a given Square Prism
	 */
	@Override
	public double calcVolume() {
		return Math.pow(this.side, 2) * this.height;
	}

	/**
	 * Calculates base area of a Square Prism
	 *
	 * @return double returns the base area of a given Square Prism
	 */
	@Override
	public double calcBaseArea() {
		return Math.pow(getSide(), 2);
	}

	/**
	 * Gets the side of the SquarePrism
	 * 
	 * @return side of the SquarePrism
	 */
	public double getSide() {
		return side;
	}

	/**
	 * Sets the side of the SquarePrism
	 * 
	 * @param side new side value
	 */
	public void setSide(double side) {
		this.side = side;
	}

	/**
	 * Prints the SquarePrism Shape
	 *
	 * @return String Returns the SquarePrism Object
	 */
	@Override
	public String toString() {
		return "Square " + super.toString() + "\n";
	}
}

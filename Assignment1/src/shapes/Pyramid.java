package shapes;

/**
 * Inherit from shape class, represent the Pyramid shape
 * 
 * @author Hardish Chander
 *
 */

public class Pyramid extends Shape {
	double side;

	/**
	 * Constructor for a Pyramid with height and side
	 * 
	 * @param height height of the Pyramid
	 * @param side   side of the Pyramid
	 */
	public Pyramid(double height, double side) {
		this.height = height;
		this.side = side;
	}

	/**
	 * Calculates volume of a Pyramid
	 * 
	 * @return double returns the volume of a given Pyramid
	 */
	@Override
	public double calcVolume() {
		return (this.side * this.side * this.height) / 3;
	}

	/**
	 * Calculates base area of a Pyramid
	 * 
	 * @return double returns the base area of a given Pyramid
	 */
	@Override
	public double calcBaseArea() {
		return Math.pow(getSide(), 2);
	}

	/**
	 * Gets the side of the Pyramid
	 * 
	 * @return side of the Pyramid
	 */
	public double getSide() {
		return side;
	}

	/**
	 * Sets the side of the Pyramid
	 * 
	 * @param side new side value
	 */
	public void setSide(double side) {
		this.side = side;
	}

	/**
	 * Prints the Pyramid Shape
	 *
	 * @return String Returns the Pyramid Object
	 */
	@Override
	public String toString() {
		return "Pyramid:= " + "Radius: " + this.getSide() + ", " + super.toString() + "\n";
	}

}

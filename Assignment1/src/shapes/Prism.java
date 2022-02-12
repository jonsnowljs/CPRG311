package shapes;

/**
 * Inherit from shape class, represent a Prism shape superclass
 * 
 * @author Jiasheng Lu
 *
 */

public class Prism extends Shape {
	double side;

	/**
	 * Constructor for a Prism with height and side
	 * 
	 * @param height height of the Prism
	 * @param radius radius of the Prism
	 */
	public Prism(double height, double side) {
		super();
		this.height = height;
		this.side = side;
	}

	/**
	 * Calculates volume of a Prism
	 *
	 * @return double returns the volume of a given Prism
	 */
	@Override
	public double calcVolume() {
		return 0;
	}

	/**
	 * Calculates base area of a Prism
	 *
	 * @return double returns the base area of a given Prism
	 */
	@Override
	public double calcBaseArea() {
		return 0;
	}

	/**
	 * Get the side of a Prism
	 * 
	 * @return the side of a prism shape
	 */
	public double getSide() {
		return side;
	}

	/**
	 * Set the side of a Prism
	 * 
	 * @param side the side of a prism shape
	 */
	public void setSide(double side) {
		this.side = side;
	}

	/**
	 * Prints the Prism Shape
	 *
	 * @return String Returns the Prism Object
	 */
	@Override
	public String toString() {
		return "Prism:= " + "Radius: " + this.getSide() + ", " + super.toString();
	}
}

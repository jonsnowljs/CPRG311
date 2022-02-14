package shapes;

public class OctagonalPrism extends Prism {

	/**
	 * Constructor with height and side
	 * 
	 * @param height height of the PentagonalPrism
	 * @param side   side of the PentagonalPrism
	 */
	public OctagonalPrism(double height, double side) {
		super(height, side);
	}

	/**
	 * Gets the volume of the OctagonalPrism
	 * 
	 * @return volume of the OctagonalPrism
	 */
	@Override
	public double calcVolume() {
		return calcBaseArea() * height;
	}

	/**
	 * Gets the base area of the OctagonalPrism
	 * 
	 * @return base area of the OctagonalPrism
	 */
	@Override
	public double calcBaseArea() {
		return 5 * Math.pow(side, 2) * Math.tan(54 * Math.PI / 180);
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
	 * @param side new height value
	 */
	public void setSide(double side) {
		this.side = side;
	}

	/**
	 * Prints the OctagonalPrism Shape
	 *
	 * @return String Returns the OctagonalPrism Object
	 */
	@Override
	public String toString() {
		return String.format("%-20s %s\n", "Octagonal Prism:=", super.toString());

	}
}
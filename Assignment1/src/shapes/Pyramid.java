package shapes;

public class Pyramid extends Shape {
	double side;

	/**
	 * no-args constructor
	 */
	public Pyramid() {

	}

	/**
	 * Constructor with height and side
	 * 
	 * @param height height of the Pyramid
	 * @param side side of the Pyramid
	 */
	public Pyramid(double height, double side) {
		this.height = height;
		this.side = side;
	}

	@Override
	public double calcVolume() {
		return (this.side * this.side * this.height) / 3;
	}

	@Override
	public double calcBaseArea() {
		return Math.pow(getSide(), 2);
	}

	/**
	 * Gets the side of the Pyramid 
	 * @return side of the Pyramid
	 */
	public double getSide() {
		return side;
	}

	/**
	 * Sets the side of the Pyramid
	 * @param side new side value
	 */
	public void setSide(double side) {
		this.side = side;
	}

	
	@Override
	public String toString() {
		return "Pyramid: " + getHeight() + " " + getSide();
	}

}

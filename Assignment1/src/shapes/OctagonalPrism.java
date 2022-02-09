package shapes;

public class OctagonalPrism extends Prism {
	
	/**
	 * Constructor with height and side
	 * @param height
	 * @param side
	 */
	public OctagonalPrism(double height, double side) {
		super(height, side);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double calcVolume() {		
		return calcBaseArea() * height;
	}
	
	@Override
	public double calcBaseArea() {
		return 5 * Math.pow(side, 2) * Math.tan(54 * Math.PI / 180);
	}

	/**
	 * @return the side
	 */
	public double getSide() {
		return side;
	}

	/**
	 * @param side the side to set
	 */
	public void setSide(double side) {
		this.side = side;
	}

	/**
	 * toString method to display the object
	 */
	@Override
	public String toString() {
		return "Square Prism: " + getHeight() + " " + getSide();
	}
}
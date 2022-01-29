package Shapes;

public class Prism extends Shape {
	double side;

	public Prism(double height, double side) {
		super();
		this.height = height;
		this.side = side;
	}

	@Override
	public double calcVolume() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calcBaseArea() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}
	
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	/**
	 * toString method to display the object
	 */
	@Override
	public String toString() {
		return "Prism: " + getHeight() + " " + getSide();
	}
}

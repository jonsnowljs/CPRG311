package shapes;

/**
 * Inherit from shape class, represent the Cylinder shape
 * @author Jiasheng Lu
 * new changes
 *
 */
public class Cylinder extends Shape {
	double radius;

	/**
	 * no-args constructor
	 */
	public Cylinder() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Constructor with height and radius
	 * 
	 * @param height
	 * @param radius
	 */
	public Cylinder(double height, double radius) {
		this.height = height;
		this.radius = radius;
	}

	/**
	 * get the height of cylinder
	 * 
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * set the height of cylinder
	 * 
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}


	/**
	 * Get the radius of cylinder
	 * 
	 * @return the radius
	 */
	public double getRadius() {
		return radius;
	}


	/**
	 * Set the radius of cylinder
	 * 
	 * @param radius the radius to set
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}


	/**
	 * {@inheritDoc}
	 */
	@Override
	public double calcVolume() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(radius, 2) * height;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public double calcBaseArea() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(radius, 2);
	}
	
	@Override
	public String toString() {
		return "Cylinder" + " "+ this.getHeight() + " " + this.getRadius();
	}

}

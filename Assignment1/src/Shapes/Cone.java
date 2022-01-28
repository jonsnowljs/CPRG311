package Shapes;

/**
 * Inherit from shape class, represent the Cone shape
 * @author Jiasheng Lu
 *
 */
public class Cone extends Shape {
	double radius;

	/**
	 * no-args constructor
	 */
	public Cone() {

	}	

	/**
	 * Constructor with height and radius, create a cone object
	 * @param radius
	 */
	public Cone(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}	

	/**
	 * get the height of cone
	 * 
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * set the height of cone
	 * 
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	/**
	 * Get the radius of cone
	 * 
	 * @return the radius
	 */
	public double getRadius() {
		return radius;
	}

	/**
	 * Set the radius of cone
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
		return 1/3 * Math.PI * Math.pow(radius, 2) * height;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public double calcBaseArea() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(radius, 2);
	}

}

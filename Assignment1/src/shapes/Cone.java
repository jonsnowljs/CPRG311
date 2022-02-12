package shapes;

/**
 * Inherit from shape class, represent the Cone shape
 * 
 * @author Jiasheng Lu
 *
 */
public class Cone extends Shape {
	double radius;

	/**
	 * Constructor for a Cone with height and radius
	 * 
	 * @param height height of the cone
	 * @param radius radius of the cone
	 */
	public Cone(double height, double radius) {
		this.radius = radius;
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
	 * Gets the volume of the Cone
	 * 
	 * @return volume of the Cone
	 */
	@Override
	public double calcVolume() {
		return 1.0 / 3.0 * Math.PI * Math.pow(radius, 2) * height;
	}

	/**
	 * Gets the base area of the Cone
	 * 
	 * @return base area of the Cone
	 */
	@Override
	public double calcBaseArea() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(radius, 2);
	}

	/**
	 * Prints the Cone Shape
	 *
	 * @return String Returns the Cone Object
	 */
	@Override
	public String toString() {
		return "Cone:= " + "Radius: " + this.getRadius() + ", " + super.toString() + "\n";
	}

}

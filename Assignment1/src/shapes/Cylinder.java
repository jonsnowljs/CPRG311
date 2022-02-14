package shapes;

/**
 * Inherit from shape class, represent the Cylinder shape
 * 
 * @author Jiasheng Lu
 */
public class Cylinder extends Shape {
	double radius;

	/**
	 * Constructor for a Cylinder with height and radius
	 * 
	 * @param height height of the Cylinder
	 * @param radius radius of the Cylinder
	 */
	public Cylinder(double height, double radius) {
		this.height = height;
		this.radius = radius;
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
	 * Gets the volume of the Cylinder
	 * 
	 * @return volume of the Cylinder
	 */
	@Override
	public double calcVolume() {

		return Math.PI * Math.pow(radius, 2) * height;
	}

	/**
	 * Gets the base area of the Cylinder
	 * 
	 * @return base area of the Cylinder
	 */
	@Override
	public double calcBaseArea() {

		return Math.PI * Math.pow(radius, 2);
	}

	/**
	 * Prints the Cylinder Shape
	 *
	 * @return String Returns the Cylinder Object
	 */
	@Override
	public String toString() {
		return String.format("%-20s Radius: %10.2f, %s\n","Cylinder:=", this.getRadius(), super.toString());
	}

}

package shapes;

/**
 * Represents a Shape Abstract class
 * 
 * @author Jiasheng Lu
 *
 */

public abstract class Shape implements Comparable<Shape> {
	// Fields
	double height;

	/**
	 * Get the Height of a Shape
	 * 
	 * @return the Height of a Shape
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * Set the side of a Shape
	 * 
	 * @param side the side of a shape
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	/**
	 * Calculates the volume of the shape
	 * 
	 * @return volume
	 */
	public abstract double calcVolume();

	/**
	 * Calculates the base area of the shape
	 * 
	 * @return base area
	 */
	public abstract double calcBaseArea();

	/**
	 * Compares two shapes based on their heights, uses Comparable
	 *
	 * @param o 2nd Shape object to compare the first one with
	 * @return int returns positive if 1st shape is bigger than 2nd, 
	 * 		   negative if 1st shape is smaller than 2nd,
	 *         0 if both shapes are equal
	 */
	@Override
	public int compareTo(Shape o) {
		return (int) Math.signum(this.height - o.height);
	};

	/**
	 * Prints the Shape
	 *
	 * @return String Returns the Shape Object
	 */
	@Override
	public String toString() {
		return String.format("Height: %8.2f,   Base Area: %15.2f,   Volume: %20.2f", getHeight(), calcBaseArea(), calcVolume());
	}

}

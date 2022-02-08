package shapes;

public abstract class Shape implements Comparable<Shape> {
	//Fields
	double height;
	
	
	
	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	/**
	 * Calculates the volume of the shape
	 * @return volume
	 */
	public abstract double calcVolume();
	
	/**
	 * Calculates the base area of the shape
	 * @return base area
	 */
	public abstract double calcBaseArea();
	
	@Override
	public int compareTo(Shape o) {
		return (int) (this.height - o.height);
	};
	
}

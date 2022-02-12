package compare_interface;

import java.util.Comparator;

import shapes.Shape;

/**
 * Volume comparator Class
 * 
 * @author Jiasheng Lu, Hardish Chander
 */
public class VolumeComp implements Comparator<Shape> {
	/**
	 * no-args Constructor, creates a Volume compare object
	 */
	public VolumeComp() {

	}

	/**
	 * Compares two shapes based on their volumes, uses Comparator
	 *
	 * @param o1 1st Shape object
	 * @param o2 2nd Shape object
	 * @return int returns positive if 1st shape is bigger than 2nd,
	 *         negative if 1st shape is smaller than 2nd,
	 *         0 if both shapes are equal
	 */
	@Override
	public int compare(Shape o1, Shape o2) {
		return (int) Math.signum(o1.calcVolume() - o2.calcVolume());
	}

}

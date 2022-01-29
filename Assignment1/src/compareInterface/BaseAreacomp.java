/**
 * 
 */
package compareInterface;

import java.util.Comparator;

import Shapes.Shape;

/**
 * @author Jason
 *
 */
public interface BaseAreacomp extends Comparator<Shape> {
	@Override
	default int compare(Shape o1, Shape o2) {
		// TODO Auto-generated method stub
		return 0;
	}
}

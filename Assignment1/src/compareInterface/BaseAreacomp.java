package compareInterface;

import java.util.Comparator;

import shapes.Shape;

public class BaseAreaComp implements Comparator<Shape> {
	Shape o1;
	Shape o2;
	
	/**
	 * @param o1
	 * @param o2
	 */
	public BaseAreaComp(Shape o1, Shape o2) {
		this.o1 = o1;
		this.o2 = o2;

	}
	
	public boolean IfSwap() {
		if (compare(o1, o2) > 0) {
			return true;
		} else {
			return false;
		}
	}



	@Override
	public int compare(Shape o1, Shape o2) {
		// TODO Auto-generated method stub
		return (int) Math.signum(o1.calcBaseArea() - o2.calcBaseArea());
	}

}

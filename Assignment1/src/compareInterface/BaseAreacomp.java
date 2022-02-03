package compareInterface;

import java.util.Comparator;

import shapes.Shape;

public class BaseAreaComp implements Comparator<Shape> {

	@Override
	public int compare(Shape o1, Shape o2) {
		// TODO Auto-generated method stub
		return (int) Math.signum(o1.calcBaseArea() - o2.calcBaseArea());
	}

}

package compareInterface;

import java.util.Comparator;

import shapes.Shape;

public class BaseAreaComp implements Comparator<Shape> {
	public BaseAreaComp() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Shape o1, Shape o2) {
		// TODO Auto-generated method stub
		return (int) Math.signum(o1.calcBaseArea() - o2.calcBaseArea());
	}

}

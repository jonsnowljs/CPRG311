package compareInterface;

import java.util.Comparator;

import shapes.Shape;

public class HeightComp implements Comparator<Shape> {

	public HeightComp() {
		
	}

	@Override
	public int compare(Shape o1, Shape o2) {
		
		return (int) Math.signum(o1.getHeight() - o2.getHeight());
	}
	
	

}

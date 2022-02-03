package test;

import compareInterface.BaseAreaComp;
import shapes.Cone;
import shapes.Cylinder;
import shapes.Shape;
import shapes.SquarePrism;
import sorting.AllSorts;

public class TestAreaComp {

	public static void main(String[] args) {
		Cone c1 = new Cone(18, 12);
		Cone c2 = new Cone(13, 10);
		Cylinder c3 = new Cylinder(15, 15);
		SquarePrism c4 = new SquarePrism(16, 16);
		Shape[] shapes = {c1, c2, c3, c4};
		for (int i = 0; i < shapes.length; i++) {
			System.out.println(shapes[i]);
			}

		AllSorts.bubbleSort(shapes);

		
		for (int i = 0; i < shapes.length; i++) {
			System.out.println(shapes[i]);
			}

	}

}

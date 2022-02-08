package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

import compareInterface.BaseAreaComp;
import shapes.Cylinder;
import shapes.Cone;
import shapes.OctagonalPrism;
import shapes.PentagonalPrism;
import shapes.Pyramid;
import shapes.Shape;
import shapes.SquarePrism;
import shapes.TrianglePrism;
import sorting.AllSorts;

public class MyTestShape {

	public static void main(String[] args) {
		File file = new File("./data/polyfor1.txt");
		try {
			Scanner in = new Scanner(file);
			

			int totalShapes = in.nextInt();
			Shape[] shapes = new Shape[totalShapes];

			for (int i = 0; i < totalShapes; i++) {
				String shape = in.next();
				double height = Double.parseDouble(in.next());
				double side = Double.parseDouble(in.next());
				
//				Class reflected = Class.forName(shape);
				

				switch (shape) {
				case "Cylinder": {
					shapes[i] = new Cylinder(height, side);
					break;
				}
				case "Cone": {
					shapes[i] = new Cone(height, side);
					break;
				}
				case "Pyramid": {
					shapes[i] = new Pyramid(height, side);
					break;
				}
				case "OctagonalPrism": {
					shapes[i] = new OctagonalPrism(height, side);
					break;
				}
				case "PentagonalPrism": {
					shapes[i] = new OctagonalPrism(height, side);
					break;
				}
				case "SquarePrism": {
					shapes[i] = new SquarePrism(height, side);
					break;
				}
				case "TriangularPrism": {
					shapes[i] = new TrianglePrism(height, side);
					break;
				}
				}
			}
			
			
			Comparator<Shape> baseAreaComparator = new BaseAreaComp();
			AllSorts.bubbleSort(shapes, baseAreaComparator);
			
			for (int i = 0; i < shapes.length; i++) {
				System.out.println(shapes[i]);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
		}

	}

}
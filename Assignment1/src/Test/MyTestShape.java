package Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Scanner;

import Shapes.Cone;
import Shapes.Cylinder;
import Shapes.OctagonalPrism;
import Shapes.PentagonalPrism;
import Shapes.Pyramid;
import Shapes.Shape;
import Shapes.SquarePrism;
import Shapes.TrianglePrism;

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
			
			for (int i = 0; i < shapes.length; i++) {
				System.out.println(shapes[i]);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}

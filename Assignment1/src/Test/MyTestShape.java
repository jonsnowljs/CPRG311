package Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import Shapes.Cylinder;

public class MyTestShape {

	public static void main(String[] args) {
		File file = new File("./data/polyfor1.txt");
		try {
			Scanner in = new Scanner(file);
			

			int totalShapes = in.nextInt();

			for (int i = 0; i <= totalShapes; i++) {
				String shape = in.next();
				double height = Double.parseDouble(in.next());
				double radius = Double.parseDouble(in.next());

				switch (shape) {
				case "Cylinder": {
					Cylinder cylinder = new Cylinder(height, radius);

				}
				}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}

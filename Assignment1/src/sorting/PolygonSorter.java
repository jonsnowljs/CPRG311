package sorting;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.Scanner;

import compareInterface.BaseAreaComp;
import compareInterface.VolumeComp;
import shapes.Cylinder;
import shapes.Cone;
import shapes.OctagonalPrism;
import shapes.PentagonalPrism;
import shapes.Pyramid;
import shapes.Shape;
import shapes.SquarePrism;
import shapes.TrianglePrism;

public class PolygonSorter extends Exception {

	private String[] args;
	private String file;
	private String type;
	private String sort;
	private Shape[] shapes;
	private Comparator comparator;

	public PolygonSorter(String[] args) {

		try {
			if (args.length != 3) {
				throw new Exception("Please use three arguments");
			}
			this.args = args;

		} catch (Exception e) {

		}

	}

	
	/**
	 * @return the args
	 */
	public String[] getArgs() {
		return args;
	}

	/**
	 * @param args the args to set
	 */
	public void setArgs(String[] args) {
		this.args = args;
	}

	/**
	 * @return the file
	 */
	public String getFile() {
		return file;
	}

	/**
	 * @param file the file to set
	 */
	public void setFile(String file) {
		this.file = file;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the sort
	 */
	public String getSort() {
		return sort;
	}

	/**
	 * @param sort the sort to set
	 */
	public void setSort(String sort) {
		this.sort = sort;
	}
	
	

	/**
	 * @return the shapes
	 */
	public Shape[] getShapes() {
		return shapes;
	}

	/**
	 * @param shapes the shapes to set
	 */
	public void setShapes(Shape[] shapes) {
		this.shapes = shapes;
	}

	public void argsParser(String arg) {
		int dashIndex = arg.indexOf("-");
		char commandCheck = arg.charAt(dashIndex + 1);
		if (dashIndex == 0) {
			switch (commandCheck) {
				case 'f':
					this.file = arg.substring(arg.indexOf(commandCheck) + 1);
					break;
				case 't':
					this.type = arg.substring(arg.indexOf(commandCheck) + 1);
					break;
				case 's':
					this.sort = arg.substring(arg.indexOf(commandCheck) + 1);
					break;
			}
		}
	}

	public void loadPolygonArray() {
		// TODO Auto-generated method stub
		File file = new File(this.file);
		try {
			Scanner in = new Scanner(file);

			int totalShapes = in.nextInt();
			shapes = new Shape[totalShapes];

			for (int i = 0; i < totalShapes; i++) {
				String shape = in.next();
				double height = Double.parseDouble(in.next());
				double side = Double.parseDouble(in.next());

				// Class reflected = Class.forName(shape);

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
						shapes[i] = new PentagonalPrism(height, side);
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

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void Sortpolygon() {
		switch (type) {
			case "v":
				comparator = new VolumeComp();
				break;
			
			case "h":
				comparator = null;
				break;

			case "a":
				comparator = new BaseAreaComp();
				break;

			default:
				new Exception("v is volume, h is height, a is base area");
				break;

		}


		switch (sort) {
			case "b":
				if (comparator == null){
					AllSorts.bubbleSort(shapes);
					break;
				}
				AllSorts.bubbleSort(shapes, comparator);
				
				break;
			case "s":
				if (comparator == null){
					AllSorts.selectionSort(shapes);
					break;
				}
				AllSorts.selectionSort(shapes, comparator);
				break;
		
			case "i":
				if (comparator == null) {
					AllSorts.insertionSort(shapes);
					break;
				}
				AllSorts.insertionSort(shapes, comparator);
				break;

			case "m":
				if (comparator == null) {
					AllSorts.mergeSort(shapes);
				}
				AllSorts.mergeSort(shapes, comparator);
				break;

			case "q":
				if (comparator == null) {
					AllSorts.quickSort(shapes);
				}
				AllSorts.quickSort(shapes, comparator);
				break;
			case "z":
				if (comparator == null) {
					AllSorts.heapSort(shapes);
				}
				AllSorts.heapSort(shapes, comparator);
				break;
			default:
				new Exception("b is bubble, s is selection, i is insertion, m is merge, q is quick, and your choice of sorting algorithm is z");
		}
	}

}

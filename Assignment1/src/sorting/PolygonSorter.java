package sorting;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.Scanner;

import compare_interface.*;
import shapes.*;

/**
 * Identifies and parses Input from the user and uses appropriate type of sort
 * and sorting method.
 *
 * @author Jiasheng Lu, Hardish Chander, Desmond Yuen
 *
 */

public class PolygonSorter extends Exception {

	// Fields
	private String[] args;
	private String file; // The file address to be read
	private String type; // The type to be compared
	private String sort; // The sort method to be used
	private Shape[] shapes; // The shapes array
	private Comparator comparator; // Comparator used to compare the shape

	/**
	 * Constructor for Polygon Sorter
	 * 
	 * @param args user input array from the commandline
	 * @throws Exception throws an exception if the user input has more than 3
	 *                   arguments
	 */
	public PolygonSorter(String[] args) throws Exception {

		if (args.length != 3) {
			throw new Exception("Please use three arguments, one for File, one for type of comparison, one for type of sort");
		}
		this.args = args;

	}

	/**
	 * Gets the user input (args) array
	 * 
	 * @return the args array
	 */
	public String[] getArgs() {
		return args;
	}

	/**
	 * Sets the user input to args array
	 * 
	 * @param new args array
	 */
	public void setArgs(String[] args) {
		this.args = args;
	}

	/**
	 * Gets the file input from args array
	 * 
	 * @return file input from args array
	 */
	public String getFile() {
		return file;
	}

	/**
	 * Sets the file input to specified file
	 * 
	 * @param new file input
	 */
	public void setFile(String file) {
		this.file = file;
	}

	/**
	 * Gets the type of compare input from args array
	 * 
	 * @return type of compare input from args array
	 */
	public String getType() {
		return type;
	}

	/**
	 * Sets the type of compare to specified type
	 * 
	 * @param new type of compare input
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * Gets the sort type input from args array
	 * 
	 * @return sort type input from args array
	 */
	public String getSort() {
		return sort;
	}

	/**
	 * Sets the sort type to specified sort
	 * 
	 * @param new sort type input
	 */
	public void setSort(String sort) {
		this.sort = sort;
	}

	/**
	 * Gets the Shape array
	 * 
	 * @return the shape array
	 */
	public Shape[] getShapes() {
		return shapes;
	}

	/**
	 * Parses user input in the appropriate fields; file input in File, type input
	 * in Type, sort input in Sort
	 *
	 * @param args input array
	 * @throws Exception throws an exception if user uses wrong arguments
	 */
	public void argsParser(String[] args) throws Exception {
		for (int i = 0; i < 3; i++) {
			String arg = args[i].toLowerCase();
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
					default:
						throw new Exception(
								"Please use proper arguments. -f for file name, -t for type of comparison and -s for sort method");
				}
			}
		}

	}

	/**
	 * Reads the file and loads all the shapes in the Shapes array
	 */
	public void loadPolygonArray() {

		try {
			File file = new File("data/" + this.file);

			Scanner in = new Scanner(file);

			// Total number of shapes specified in the beginning of the input file
			int totalShapes = in.nextInt();
			shapes = new Shape[totalShapes];

			// Loop through the file and create objects depending on the shape
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
			System.out.println("Please only write the name of the txt file.");
		}
	}

	/**
	 * Determines which kind of comparison and sorting method to use depending on
	 * the input
	 *
	 * @throws Exception throws an exception if wrong input is used
	 */
	public void Sortpolygon() throws Exception {
		// finds the type of comparison
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
				throw new Exception(
						"Please use v for volume comparison, h for height comparison and a for base area comparison");

		}

		// finds the type of sorting method to use
		switch (sort) {
			case "b":
				if (comparator == null) {
					AllSorts.bubbleSort(shapes);
					break;
				}
				AllSorts.bubbleSort(shapes, comparator);

				break;
			case "s":
				if (comparator == null) {
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
				throw new Exception(
						"Please use -b for bubble sort, -s for selection sort, -i for insertion sort, -m for merge sort, -q for quick sort or -z for heap sort");
		}
	}

}

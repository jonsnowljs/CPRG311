/**
 * 
 */
package driver;

import java.util.Arrays;
import sorting.PolygonSorter;

/**
 * The Driver for this application
 * 
 * @author Hardish Chander, Jiasheng Lu
 *
 */
public class AppDriver {
	/**
	 * @param args the args passed by user
	 * @throws Exception inherits exceptions from PolygonSorter class
	 */
	public static void main(String[] args) throws Exception {

		// Create polygon sorter object
		PolygonSorter sorter = new PolygonSorter(args);

		// Sorter parse the args and check what file, sort, type the user what to use
		sorter.argsParser(args);

		// Load the array from file
		sorter.loadPolygonArray();

		// Check how many millisecond it takes to run the sort method
		long startTime = System.currentTimeMillis();
		// Run the specified sorting method
		sorter.Sortpolygon();
		long endTime = System.currentTimeMillis();
		long duration = (endTime - startTime);

		// Prints out the sorted shape array
		System.out.println(Arrays.toString(sorter.getShapes()));

		// Prints the time it took to sort
		System.out.println("Time taken to perform the sort: " + duration + " ms");

	}

}

/**
 * 
 */
package driver;

import sorting.PolygonSorter;

/**
 * @author Jiasheng
 *
 */
public class AppDriver {
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println();
		PolygonSorter sorter = new PolygonSorter(args);

		sorter.argsParser(args[0]);
		sorter.argsParser(args[1]);
		sorter.argsParser(args[2]);
		sorter.loadPolygonArray();
		sorter.Sortpolygon();
		System.out.println(sorter.getFile());
		System.out.println(sorter.getSort());
		System.out.println(sorter.getType());
		System.out.println(sorter.getShapes().toString());

		// sorter.loadPolygonArray();
		// sorter.Sortpolygon();

	}

}

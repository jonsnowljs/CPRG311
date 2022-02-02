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
		
		// TODO Auto-generated method stub
		PolygonSorter sorter = new PolygonSorter();
		
		sorter.loadPolygonArray();
		sorter.Sortpolygon();
		

	}

}

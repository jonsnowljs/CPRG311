/**
 * 
 */
package shapes;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Chinedu Alake
 *
 */
public class TrianglePrismTest {

	//Test Values
	
	double height = 30;
	double side = 50;
	
	/**
	 * Test method for {@link shapes.TrianglePrism#calcVolume()}.
	 */
	@Test
	public void testCalcVolumeOfTrianglePrism() {

		TrianglePrism tPrism = new TrianglePrism(height, side); 
		
		//Find volume with given parameters (30, 50)
		double expected = 32475;
		
		double actual = tPrism.calcVolume();
		
		assertEquals(expected, actual, side);
		
		System.out.println("Test ran succesfully");
	}

	/**
	 * Test method for {@link shapes.TrianglePrism#calcBaseArea()}.
	 */
	@Test
	public void testCalcBaseArea() {
		
		TrianglePrism tPrism = new TrianglePrism(height, side); 
		
		//Find baseArea with given parameters (15, 22)
		double expected = 1082;
		
		double actual = tPrism.calcBaseArea();
		
		assertEquals(expected, actual, side);
		
		System.out.println("Test ran succesfully");
	}

}

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

	/**
	 * Test method for {@link shapes.TrianglePrism#calcVolume()}.
	 */
	@Test
	public void testCalcVolumeOfTrianglePrism() {
		double height = 30;
		double side = 50;
		
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
		fail("Not yet implemented");
	}

}

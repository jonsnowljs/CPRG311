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
public class OctagonalPrismTest {

	/**
	 * Test method for {@link shapes.OctagonalPrism#calcVolume()}.
	 */
	@Test
	public void testCalcVolume() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link shapes.OctagonalPrism#calcBaseArea()}.
	 */
	@Test
	public void testCaclcBaseAreaOfOctagonalPrism() {
		double height = 10;
		double side = 31;
		
		OctagonalPrism octa = new OctagonalPrism(height, side); 
		
		//Find volume with given parameters (10, 31)
		double expected = 6613;
		
		double actual = octa.calcBaseArea();
		
		assertEquals(expected, actual, side);
		
		System.out.println("Test ran succesfully");
	}

}

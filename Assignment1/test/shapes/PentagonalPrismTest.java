/**
 * 
 */
package shapes;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 * @author Chinedu Alake
 */
public class PentagonalPrismTest {

	/**
	 * Test method for {@link shapes.PentagonalPrism#calcVolume()}.
	 */
	@Test
	public void testCalcVolumeOfPentagonalPrism() {
		double height = 15;
		double side = 22;
		
		PentagonalPrism pri = new PentagonalPrism(height, side); 
		
		//Find volume with given parameters (15, 22)
		double expected = 12490;
		
		double actual = pri.calcVolume();
		
		assertEquals(expected, actual, side);
		
		System.out.println("Test ran succesfully");
	}

	/**
	 * Test method for {@link shapes.PentagonalPrism#calcBaseArea()}.
	 */
	@Test
	public void testCalcBaseArea() {
		fail("Not yet implemented");
	}

}

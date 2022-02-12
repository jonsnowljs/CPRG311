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
public class PyramidTest {

	/**
	 * Test method for {@link shapes.Pyramid#calcVolume()}.
	 */
	@Test
	public void testCalcVolumeOfPyramid() {
		double height = 25;
		double side = 5;
		
		Pyramid pyr = new Pyramid(height, side); 
		
		//Find volume with given parameters (25, 5)
		double expected = 208;
		
		double actual = pyr.calcVolume();
		
		assertEquals(expected, actual, side);
		
		System.out.println("Test ran succesfully");
	}

	/**
	 * Test method for {@link shapes.Pyramid#calcBaseArea()}.
	 */
	@Test
	public void testCalcBaseArea() {
		fail("Not yet implemented");
	}

}

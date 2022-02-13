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
	
	//Test Values
	
	double height = 25;
	double side = 5;

	/**
	 * Test method for {@link shapes.Pyramid#calcVolume()}.
	 */
	@Test
	public void testCalcVolumeOfPyramid() {

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
		
		PentagonalPrism pri = new PentagonalPrism(height, side); 
		
		//Find baseArea with given parameters (15, 22)
		double expected = 43;
		
		double actual = pri.calcBaseArea();
		
		assertEquals(expected, actual, side);
		
		System.out.println("Test ran succesfully");
	}

}

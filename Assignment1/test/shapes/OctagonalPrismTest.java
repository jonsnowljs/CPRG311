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
	
//Test Values
	
	double side = 31;
	
	double height = 55;
	
	
	/**
	 * Test method for {@link shapes.OctagonalPrism#calcVolume()}.
	 */
	@Test
	public void testCalcVolume() {
		
		//Find volume with given parameters (height 55)
		
		OctagonalPrism octa = new OctagonalPrism(height, side);
		
		double expected = 363_743;
		
		double actual = octa.calcVolume();
		
		assertEquals(expected, actual, side);
		
		System.out.println("Test ran succesfully");
	}

	/**
	 * Test method for {@link shapes.OctagonalPrism#calcBaseArea()}.
	 */
	@Test
	public void testCaclcBaseAreaOfOctagonalPrism() {

		OctagonalPrism octa = new OctagonalPrism(height, side); 
		
		//Find volume with given parameters (side 31)
		double expected = 6613;
		
		double actual = octa.calcBaseArea();
		
		assertEquals(expected, actual, side);
		
		System.out.println("Test ran succesfully");
	}

}

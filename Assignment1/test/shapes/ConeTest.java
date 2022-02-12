package shapes;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * @author Chinedu Alake
 *
 */
public class ConeTest {

	@Test
	public void testCalcVolume() {
		double radius = 2;
		double height = 10;
		
		Cone cone = new Cone(height, radius); 
		
		//Find volume with given parameters (10, 2)
		double expected = 41.88;
		
		double actual = cone.calcVolume();
		
		assertEquals(expected, actual, radius);
		
		System.out.println("Test ran succesfully");
	}

	@Test
	public void testCalcBaseArea() {
		fail("Not yet implemented");
	}

}

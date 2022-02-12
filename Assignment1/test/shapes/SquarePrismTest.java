package shapes;

import static org.junit.Assert.*;

import org.junit.Test;

public class SquarePrismTest {

	@Test
	public void testCalcVolumeOfSquarePrism() {
		double height = 100;
		double side = 20;
		
		SquarePrism sPrism = new SquarePrism(height, side); 
		
		//Find volume with given parameters (100, 20)
		double expected = 40000;
		
		double actual = sPrism.calcVolume();
		
		assertEquals(expected, actual, side);
		
		System.out.println("Test ran succesfully");
	}
	
	@Test
	public void testCalcBaseArea() {
		fail("Not yet implemented");
	}

}

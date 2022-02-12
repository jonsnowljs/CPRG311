package shapes;

import static org.junit.Assert.*;

import org.junit.Test;

public class PrismTest {

	@Test
	public void testCalcVolumeOfPrism() {
		double height = 10;
		double side = 10;
		
		Prism prism = new Prism(height, side); 
		
		//Find volume with given parameters (10, 10)
		double expected = 0;
		
		double actual = prism.calcVolume();
		
		assertEquals(expected, actual, side);
		
		System.out.println("Test ran succesfully");
	}

}

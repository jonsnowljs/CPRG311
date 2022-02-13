package shapes;

import static org.junit.Assert.*;

import org.junit.Test;

public class SquarePrismTest {
	
	//TestValues 
	
	double height = 100;
	double side = 20;

	@Test
	public void testCalcVolumeOfSquarePrism() {
		
		SquarePrism sPrism = new SquarePrism(height, side); 
		
		//Find volume with given parameters (100, 20)
		double expected = 40000;
		
		double actual = sPrism.calcVolume();
		
		assertEquals(expected, actual, side);
		
		System.out.println("Test ran succesfully");
	}
	
	@Test
	public void testCalcBaseArea() {
		
		SquarePrism sPrism = new SquarePrism(height, side); 
		
		//Find BaseArea with given parameters (100, 20)
		double expected = 400;
		
		double actual = sPrism.calcBaseArea();
		
		assertEquals(expected, actual, side);
		
		System.out.println("Test ran succesfully");
	}

}

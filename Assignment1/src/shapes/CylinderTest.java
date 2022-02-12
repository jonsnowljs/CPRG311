package shapes;

import static org.junit.Assert.*;

import org.junit.Test;

public class CylinderTest {

	@Test
	public void testCaclcVolumeOfCylinder() {
		double radius = 10;
		double height = 31;
		
		Cylinder cylinder = new Cylinder(height, radius); 
		
		//Find volume with given parameters (10, 31)
		double expected = 9738.93;
		
		double actual = cylinder.calcVolume();
		
		assertEquals(expected, actual, radius);
		
		System.out.println("Test ran succesfully");
	}

}

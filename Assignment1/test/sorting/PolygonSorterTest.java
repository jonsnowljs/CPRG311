/**
 * 
 */
package sorting;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import compare_interface.BaseAreaComp;
import compare_interface.VolumeComp;

/**
 * Test the polygonSorter class
 * 
 * @author Jiasheng Lu
 *
 */
public class PolygonSorterTest {
	String[] args1 = { "-fpolyfor1.txt", "-tv", "-sz", "-44" };
	String[] args2 = { "-fpolyfortest.txt", "-tv", "-sz" };
	String[] args3 = { "-FPOlyfortest.txt", "-Ta", "-SI" };

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for
	 * {@link sorting.PolygonSorter#PolygonSorter(java.lang.String[])}.
	 * 
	 * @throws Exception
	 */
	@SuppressWarnings("deprecation")
	@Test
	public void testPolygonSorter() throws Exception {
		// Test if 4 arguments throw exception		
		try {
			PolygonSorter pSorter = new PolygonSorter(args1);

		} catch (IllegalArgumentException e) {
			String message = "Please use three arguments, one for File, one for type of comparison, one for type of sort";
			assertTrue(message.equals(e.getMessage()));
		}

		// Test if  3 arguments pass the test
		PolygonSorter pSorter = new PolygonSorter(args2);
		assertEquals(args2, pSorter.getArgs());

	}

	/**
	 * Test method for {@link sorting.PolygonSorter#argsParser(java.lang.String[])}.
	 * @throws Exception 
	 */
	@Test
	public void testArgsParser() throws Exception {
		// Test if argsParser parse can parse args in lowercase
		PolygonSorter pSorter = new PolygonSorter(args2);
		pSorter.argsParser(args2);
		assertTrue(pSorter.getFile().equals("polyfortest.txt"));
		assertTrue(pSorter.getType().equals("v"));
		assertTrue(pSorter.getSort().equals("z"));
		
		// Test if argsParser parse can parse capitalized args
		PolygonSorter pSorter1 = new PolygonSorter(args3);
		pSorter1.argsParser(args3);
		assertTrue(pSorter1.getFile().equals("polyfortest.txt"));
		assertTrue(pSorter1.getType().equals("a"));
		assertTrue(pSorter1.getSort().equals("i"));
			
	}

	/**
	 * Test method for {@link sorting.PolygonSorter#Sortpolygon()}.
	 * @throws Exception 
	 */
	@Test
	public void testSortpolygon() throws Exception {
		// Test if the sortpolygon method can select right type 
		PolygonSorter pSorter = new PolygonSorter(args2);
		pSorter.argsParser(args2);
		pSorter.loadPolygonArray();
		pSorter.Sortpolygon();
		assertTrue( new VolumeComp().getClass().equals(pSorter.getComparator().getClass()));

		// Test ifthe sortpolygon method can select right comparator
		PolygonSorter pSorter1 = new PolygonSorter(args3);
		pSorter1.argsParser(args3);
		pSorter1.loadPolygonArray();
		pSorter1.Sortpolygon();
		assertTrue(new BaseAreaComp().getClass().equals(pSorter1.getComparator().getClass()));

	}

}

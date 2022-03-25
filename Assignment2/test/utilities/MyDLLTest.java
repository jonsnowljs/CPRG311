package utilities;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyDLLTest {
	
	MyDLL<Integer>  myDLL = new MyDLL<>();
	private Integer one = 11;
	private Integer two = 12;
	private Integer three = 13;
	private Integer four = 14;
	private Integer five = 15;
	private Integer six = 16;
	private Integer new1 = 17;
	private Integer new2 = 18;
	
	@Before
	public void setUp() throws Exception {
		one = new Integer(11);
		two = new Integer(12);
		three = new Integer(13);
		four = new Integer(14);
		five = new Integer(15);
		
	}
	

	@After
	public void tearDown() throws Exception {
		myDLL = null;
		one = null;
		two = null;
		three = null;
		four = null;
		five = null;
	}


	@Test
	public void testSize() {
		int expected = 5;
		int actual = myDLL.size();
		assertEquals(exptected, actual);
	}

	@Test
	public void testClear() {
		int expected = 0;
		myDLL.clear();
		int actual = myDLL.size();
		assertEquals(expected, actual);
	}

	@Test
	public void testAddIntE() {
		myDLL.add(6, six);
	}

	@Test
	public void testAddE() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddAll() {
		fail("Not yet implemented");
	}

	@Test
	public void testGet() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveE() {
		fail("Not yet implemented");
	}

	@Test
	public void testSet() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsEmpty() {
		fail("Not yet implemented");
	}

	@Test
	public void testContains() {
		fail("Not yet implemented");
	}

	@Test
	public void testToArrayEArray() {
		fail("Not yet implemented");
	}

	@Test
	public void testToArray() {
		fail("Not yet implemented");
	}

	@Test
	public void testIterator() {
		fail("Not yet implemented");
	}

}

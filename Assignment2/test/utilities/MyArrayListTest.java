package utilities;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import utilities.MyArrayList;

public class MyArrayListTest {
	
	//Attributes
		MyArrayList<Integer> mylist = new MyArrayList();
		private Integer one;
		private Integer two;
		private Integer three;
		private Integer four;
		private Integer five;

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
		mylist = null;
		one = null;
		two = null;
		three = null;
		four = null;
		five = null;
	}

	@Test
	public void testSize() {
		int expected = 5;
		mylist.add(11);
		mylist.add(12);
		mylist.add(13);
		mylist.add(14);
		mylist.add(15);
		int actual = mylist.size();
		assertEquals(expected,actual);
		
		
	}

}
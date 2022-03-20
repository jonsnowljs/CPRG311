package utilities;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import utilities.MyArrayList;
import utilities.MyStack;

public class MyStackTest {
	//Attributes
			MyStack<Integer> stack;
			private Integer one;
			private Integer two;
			private Integer three;
			private Integer four;
			private Integer five;

	@Before
	public void setUp() throws Exception {
		stack = new MyStack();
		one = new Integer(11);
		two = new Integer(12);
		three = new Integer(13);
		four = new Integer(14);
		five = new Integer(15);
	}

	@After
	public void tearDown() throws Exception {
		stack = null;
		one = null;
		two = null;
		three = null;
		four = null;
		five = null;
	}

	@Test
	public void teststackcont() {
		boolean expected = true;
		boolean actual = stack != null;
		assertEquals(expected, actual);
	}

}

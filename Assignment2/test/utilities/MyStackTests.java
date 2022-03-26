package utilities;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import utilities.MyArrayList;
import utilities.MyStack;

public class MyStackTests<E> {
	//Attributes
	MyStack<Integer> stack;
	private Integer zero;
	private Integer one;
	private Integer two;
	private Integer three;
	private Integer four;
	private Integer five;

	@Before
	public void setUp() throws Exception {
		zero = Integer.valueOf(10);
		one = Integer.valueOf(11);
		two = Integer.valueOf(12);
		three = Integer.valueOf(13);
		four = Integer.valueOf(14);
		five = Integer.valueOf(15);


		stack.push(zero);
		stack.push(one);
		stack.push(two);
		stack.push(three);
		stack.push(four);
		stack.push(five);
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


	@Test
	public void testMyStack() {
		fail("Not yet implemented");
	}

	@Test
	public void testHasNext() {
		fail("Not yet implemented");
	}

	@Test
	public void testNext() {
		fail("Not yet implemented");
	}

	@Test
	public void testPush() {
		stack.push(one);
		stack.push(two);
		
		assertEquals(stack.peek(), two);
	}

	@Test
	public void testPop() {
		fail("Not yet implemented");
	}

	@Test
	public void testPeek() {
		fail("Not yet implemented");
	}

	@Test
	public void testClear() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsEmpty() {
		fail("Not yet implemented");
	}

	@Test
	public void testToArray() {
		fail("Not yet implemented");
	}

	@Test
	public void testToArrayEArray() {
		fail("Not yet implemented");
	}

	@Test
	public void testContains() {
		fail("Not yet implemented");
	}

	@Test
	public void testSearch() {
		fail("Not yet implemented");
	}

	@Test
	public void testIterator() {
		 Iterator<Integer> iterator = stack.iterator();
		 assertEquals(iterator.next(), zero);
		 
	}

	@Test
	public void testEqualsStackADTOfE() {
		fail("Not yet implemented");
	}

	@Test
	public void testSize() {
		fail("Not yet implemented");
	}

}

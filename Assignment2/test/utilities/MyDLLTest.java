package utilities;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyDLLTest {

	MyDLL<Integer> myDLL = new MyDLL<>();
	private Integer zero;
	private Integer one;
	private Integer two;
	private Integer three;
	private Integer four;
	private Integer five;
	private Integer new1;
	private Integer new2;
	private Integer nullInteger;

	@Before
	public void setUp() throws Exception {
		zero = Integer.valueOf(10);
		one = Integer.valueOf(11);
		two = Integer.valueOf(12);
		three = Integer.valueOf(13);
		four = Integer.valueOf(14);
		five = Integer.valueOf(15);
		new1 = Integer.valueOf(16);
		new2 = Integer.valueOf(17);

		myDLL.add(zero);
		myDLL.add(one);
		myDLL.add(two);
		myDLL.add(three);
		myDLL.add(four);
		myDLL.add(five);
	}

	@After
	public void tearDown() throws Exception {
		myDLL = null;
		one = null;
		two = null;
		three = null;
		four = null;
		five = null;
		new1 = null;
		new2 = null;
	}

	@Test
	public void testSize() {
		int expected = 6;
		int actual = myDLL.size();
		assertEquals(expected, actual);
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
		// test on exceptions
		assertThrows(IndexOutOfBoundsException.class, () -> myDLL.add(8, new1));
		assertThrows(IndexOutOfBoundsException.class, () -> myDLL.add(7, new1));
		assertThrows(NullPointerException.class, () -> myDLL.add(2, nullInteger));

		// test if new node is added
		myDLL.add(6, new1);
		Integer expected = myDLL.get(6);
		Integer actual = new1;
		assertEquals(expected, actual);

		myDLL.add(3, new2);
		Integer expected1 = myDLL.get(3);
		Integer actual1 = new2;
		assertEquals(expected1, actual1);

	}

	@Test
	public void testAddE() {
		// test if nullpointException is thrown
		assertThrows(NullPointerException.class, () -> myDLL.add(nullInteger));

		// test if new node is added
		myDLL.add(new1);
		Integer expected = myDLL.get(6);
		Integer actual = new1;
		assertEquals(expected, actual);

		myDLL.add(7, new2);
		Integer expected1 = myDLL.get(7);
		Integer actual1 = new2;
		assertEquals(expected1, actual1);
	}

	@Test
	public void testAddAll() {
		// create new toadd DLL
		MyDLL<Integer> newMyDLL = new MyDLL<>();
		// test if nullpointException is thrown
		assertThrows(NullPointerException.class, () -> myDLL.addAll(newMyDLL));
		// setup
		newMyDLL.add(new1);
		newMyDLL.add(new2);

		// test if all the new DLL is added
		myDLL.addAll(newMyDLL);
		Integer expected = myDLL.get(6);
		Integer actual = new1;
		assertEquals(expected, actual);

		Integer expected1 = myDLL.get(7);
		Integer actual1 = new2;
		assertEquals(expected1, actual1);
	}

	@Test
	public void testGet() {
		// test if indexOutOfBoundsException is thrown
		assertThrows(IndexOutOfBoundsException.class, () -> myDLL.get(6));
		// test if can get right number
		Integer expected = myDLL.get(0);
		Integer actual = zero;
		assertEquals(expected, actual);

		Integer expected1 = myDLL.get(1);
		Integer actual1 = one;
		assertEquals(expected1, actual1);

		Integer expected2 = myDLL.get(2);
		Integer actual2 = two;
		assertEquals(expected2, actual2);

		Integer expected3 = myDLL.get(3);
		Integer actual3 = three;
		assertEquals(expected3, actual3);

		Integer expected4 = myDLL.get(4);
		Integer actual4 = four;
		assertEquals(expected4, actual4);

		Integer expected5 = myDLL.get(5);
		Integer actual5 = five;
		assertEquals(expected5, actual5);
	}

	@Test
	public void testRemoveInt() {
		
		Integer expected = myDLL.remove(0);;
		Integer actual = zero;
		assertEquals(expected, actual);

		Integer expected1 = myDLL.remove(1);
		Integer actual1 = one;
		assertEquals(expected1, actual1);

		Integer expected2 = myDLL.remove(2);
		Integer actual2 = two;
		assertEquals(expected2, actual2);

		Integer expected3 = myDLL.remove(3);
		Integer actual3 = three;
		assertEquals(expected3, actual3);

		Integer expected4 = myDLL.remove(4);
		Integer actual4 = four;
		assertEquals(expected4, actual4);

		Integer expected5 = myDLL.remove(5);
		Integer actual5 = five;
		assertEquals(expected5, actual5);
	}

	@Test
	public void testRemoveE() {
		//set up
		Integer zeroDuplicate = Integer.valueOf(10);
		myDLL.add(0, zeroDuplicate);
		// test if only first elements are removed
		Integer expected = myDLL.remove(zero);
		Integer actual = zero;
		assertEquals(expected, actual);

		// test if the elements are removed
		Integer actual1 = myDLL.get(1);
		myDLL.remove(one);
		Integer expected1 = myDLL.get(0);
		assertEquals(expected1, actual1);

		actual1 = myDLL.get(1);
		myDLL.remove(two);
		expected1 = myDLL.get(0);
		assertEquals(expected1, actual1);
		
		actual1 = myDLL.get(1);
		myDLL.remove(three);
		expected1 = myDLL.get(0);
		assertEquals(expected1, actual1);
		
		actual1 = myDLL.get(1);
		myDLL.remove(four);
		expected1 = myDLL.get(0);
		assertEquals(expected1, actual1);
		
		actual1 = myDLL.get(1);
		myDLL.remove(five);
		expected1 = myDLL.get(0);
		assertEquals(expected1, actual1);
		
		assertTrue(myDLL.size() == 0);	
		
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
		Integer[] holdList = new Integer[5];
		holdList = myDLL.toArray(holdList);
		Integer expected = zero; 
		Integer actual = holdList[0];
		assertEquals(expected, actual);		
	
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

package utilities;

import static org.junit.Assert.*;

import java.util.NoSuchElementException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyDLLTest {

	MyDLL<Integer> myDLL = new MyDLL<>();

	private Integer element0;
	private Integer element1;
	private Integer element2;
	private Integer element3;
	private Integer element4;
	private Integer element5;
	private Integer newElement1;
	private Integer newElement2;
	private Integer nullInteger;
	private Integer expected;
	private Integer actual;

	@Before
	public void setUp() throws Exception {
		element0 = Integer.valueOf(10);
		element1 = Integer.valueOf(11);
		element2 = Integer.valueOf(12);
		element3 = Integer.valueOf(13);
		element4 = Integer.valueOf(14);
		element5 = Integer.valueOf(15);
		newElement1 = Integer.valueOf(16);
		newElement2 = Integer.valueOf(17);

		myDLL.add(element0);
		myDLL.add(element1);
		myDLL.add(element2);
		myDLL.add(element3);
		myDLL.add(element4);
		myDLL.add(element5);

	}

	@After
	public void tearDown() throws Exception {
		myDLL = null;
		element1 = null;
		element2 = null;
		element3 = null;
		element4 = null;
		element5 = null;
		newElement1 = null;
		newElement2 = null;
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
		assertThrows(IndexOutOfBoundsException.class, () -> myDLL.add(8, newElement1));
		assertThrows(IndexOutOfBoundsException.class, () -> myDLL.add(7, newElement1));
		assertThrows(NullPointerException.class, () -> myDLL.add(2, nullInteger));

		// test if new node is added
		myDLL.add(6, newElement1);
		expected = myDLL.get(6);
		actual = newElement1;
		assertEquals(expected, actual);

		myDLL.add(3, newElement2);
		expected = myDLL.get(3);
		actual = newElement2;
		assertEquals(expected, actual);

	}

	@Test
	public void testAddE() {
		// test if nullpointException is thrown
		assertThrows(NullPointerException.class, () -> myDLL.add(nullInteger));

		// test if new node is added
		myDLL.add(newElement1);
		expected = myDLL.get(6);
		actual = newElement1;
		assertEquals(expected, actual);

		myDLL.add(7, newElement2);
		expected = myDLL.get(7);
		actual = newElement2;
		assertEquals(expected, actual);
	}

	@Test
	public void testAddAll() {
		// create new toadd DLL
		MyDLL<Integer> newMyDLL = new MyDLL<>();
		// test if nullpointException is thrown
		assertThrows(NullPointerException.class, () -> myDLL.addAll(newMyDLL));
		// setup
		newMyDLL.add(newElement1);
		newMyDLL.add(newElement2);

		// test if all the new DLL is added
		myDLL.addAll(newMyDLL);
		expected = myDLL.get(6);
		actual = newElement1;
		assertEquals(expected, actual);

		expected = myDLL.get(7);
		actual = newElement2;
		assertEquals(expected, actual);
	}

	@Test
	public void testGet() {
		// test if indexOutOfBoundsException is thrown
		assertThrows(IndexOutOfBoundsException.class, () -> myDLL.get(6));
		// test if can get right number
		expected = myDLL.get(0);
		actual = element0;
		assertEquals(expected, actual);

		expected = myDLL.get(1);
		actual = element1;
		assertEquals(expected, actual);

		expected = myDLL.get(2);
		actual = element2;
		assertEquals(expected, actual);

		expected = myDLL.get(3);
		actual = element3;
		assertEquals(expected, actual);

		expected = myDLL.get(4);
		actual = element4;
		assertEquals(expected, actual);

		expected = myDLL.get(5);
		actual = element5;
		assertEquals(expected, actual);
	}

	@Test
	public void testRemoveInt() {
		// test if IndexOutOfBoundsException is thrown
		assertThrows(IndexOutOfBoundsException.class, () -> myDLL.remove(6));
		assertThrows(IndexOutOfBoundsException.class, () -> myDLL.remove(-1));

		// test if the element is removed at position
		expected = myDLL.remove(0);
		;
		actual = element0;
		assertEquals(expected, actual);

		expected = myDLL.remove(0);
		actual = element1;
		assertEquals(expected, actual);

		expected = myDLL.remove(0);
		actual = element2;
		assertEquals(expected, actual);

		expected = myDLL.remove(0);
		actual = element3;
		assertEquals(expected, actual);

		expected = myDLL.remove(0);
		actual = element4;
		assertEquals(expected, actual);

		expected = myDLL.remove(0);
		actual = element5;
		assertEquals(expected, actual);

		assertEquals(0, myDLL.size());
	}

	@Test
	public void testRemoveE() {
		// set up
		Integer zeroDuplicate = Integer.valueOf(10);
		myDLL.add(0, zeroDuplicate);
		// test if only first elements are removed
		expected = myDLL.remove(element0);
		actual = element0;
		assertEquals(expected, actual);

		// test if NullPointerException is thrown
		assertThrows(NullPointerException.class, () -> myDLL.remove(null));

		// test if the elements are removed
		actual = myDLL.get(1);
		myDLL.remove(element0);
		expected = myDLL.get(0);
		assertEquals(expected, actual);

		actual = myDLL.get(1);
		myDLL.remove(element1);
		expected = myDLL.get(0);
		assertEquals(expected, actual);

		actual = myDLL.get(1);
		myDLL.remove(element2);
		expected = myDLL.get(0);
		assertEquals(expected, actual);

		actual = myDLL.get(1);
		myDLL.remove(element3);
		expected = myDLL.get(0);
		assertEquals(expected, actual);

		actual = myDLL.get(1);
		myDLL.remove(element4);
		expected = myDLL.get(0);
		assertEquals(expected, actual);

		expected = myDLL.get(0);
		actual = myDLL.remove(element5);
		assertEquals(expected, actual);

		assertTrue(myDLL.size() == 0);

	}

	@Test
	public void testSet() {
		// test if excpetions are thrown
		assertThrows(IndexOutOfBoundsException.class, () -> myDLL.set(6, newElement1));
		assertThrows(NullPointerException.class, () -> myDLL.set(1, nullInteger));

		Integer actualAfterSet;
		// test the return value after set
		expected = myDLL.get(0);
		actual = myDLL.set(0, newElement1);
		assertEquals(expected, actual);

		// test if the value is set
		expected = newElement1;
		actual = myDLL.get(0);
		assertEquals(expected, actual);

	}

	@Test
	public void testIsEmpty() {
		// set up a new empty DLL
		MyDLL<Integer> myNullDLL = new MyDLL<>();

		// check if is empty
		assertTrue(myNullDLL.isEmpty());

		// check if is not empty
		assertFalse(myDLL.isEmpty());
	}

	@Test
	public void testContains() {
		// check if the element is in the DLL
		assertTrue(myDLL.contains(element0));
		assertTrue(myDLL.contains(element1));
		assertTrue(myDLL.contains(element2));
		assertTrue(myDLL.contains(element3));
		assertTrue(myDLL.contains(element4));
		assertTrue(myDLL.contains(element5));
		// check if the element is not in the DLL
		assertFalse(myDLL.contains(newElement1));
		// check if newElement1 is added to the DLL
		myDLL.add(newElement1);
		assertTrue(myDLL.contains(newElement1));
	}

	@Test
	public void testToArrayEArray() {
		// test if NUllPointerException is thrown
		assertThrows(NullPointerException.class, () -> myDLL.toArray(null));

		// test if DLL is transformed to array when toHold is smaller than DLL
		Integer[] holdList = new Integer[2];
		holdList = myDLL.toArray(holdList);
		for (int i = 0; i < myDLL.size(); i++) {
			assertEquals(myDLL.get(i), holdList[i]);
		}

		// test if DLL is transformed to array when toHold is bigger than DLL
		holdList = new Integer[10];
		holdList = myDLL.toArray(holdList);
		for (int i = 0; i < myDLL.size(); i++) {
			assertEquals(myDLL.get(i), holdList[i]);
		}

	}

	@Test
	public void testToArray() {
		// test if DLL is transformed to array
		Object[] actualArray = myDLL.toArray();
		Object[] expectedArray = { 10, 11, 12, 13, 14, 15 };
		assertArrayEquals(expectedArray, actualArray);

	}

	@Test
	public void testIterator() {
		// setup before test
		Iterator<Integer> iterator = myDLL.iterator();

		// test if the first element is returned
		expected = iterator.next();
		actual = element0;
		assertEquals(expected, actual);

		// test if the second element is returned
		expected = iterator.next();
		actual = element1;
		assertEquals(expected, actual);

		// test if the third element is returned
		expected = iterator.next();
		actual = element2;
		assertEquals(expected, actual);

		// test if the fourth element is returned
		expected = iterator.next();
		actual = element3;
		assertEquals(expected, actual);

		// test if the fifth element is returned
		expected = iterator.next();
		actual = element4;
		assertEquals(expected, actual);

		// test if the sixth element is returned
		expected = iterator.next();
		actual = element5;
		assertEquals(expected, actual);

		// test if there is no more elements
		assertFalse(iterator.hasNext());

		// test if NullPointerException is thrown
		assertThrows(NoSuchElementException.class, () -> iterator.next());
	}

}

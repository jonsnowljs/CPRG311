package utilities;

import static org.junit.Assert.*;

import java.util.NoSuchElementException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyDLLTest {
	// Attributes for Integer test
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

	// Attributes for String test
	MyDLL<String> myStringDLL = new MyDLL<>();
	private String string0;
	private String string1;
	private String string2;
	private String string3;
	private String string4;
	private String string5;
	private String newString1;
	private String newString2;
	private String nullString;
	private String expectedString;
	private String actualString;

	@Before
	public void setUp() throws Exception {
		// Integer test
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

		// String test
		string0 = "Hello";
		string1 = "World";
		string2 = "!";
		string3 = "?";
		string4 = ".";
		string5 = ",";
		newString1 = "How";
		newString2 = "are";

		myStringDLL.add(string0);
		myStringDLL.add(string1);
		myStringDLL.add(string2);
		myStringDLL.add(string3);
		myStringDLL.add(string4);
		myStringDLL.add(string5);
	}

	@After
	public void tearDown() throws Exception {
		// Integer test
		myDLL = null;
		element1 = null;
		element2 = null;
		element3 = null;
		element4 = null;
		element5 = null;
		newElement1 = null;
		newElement2 = null;

		// String test
		myStringDLL = null;
		string1 = null;
		string2 = null;
		string3 = null;
		string4 = null;
		string5 = null;
		newString1 = null;
		newString2 = null;
	}

	@Test
	public void testSize() {
		// Integer test
		int expected = 6;
		int actual = myDLL.size();
		assertEquals(expected, actual);

		// String test
		int expectedString = 6;
		int actualString = myStringDLL.size();
		assertEquals(expectedString, actualString);
	}

	@Test
	public void testClear() {
		// Integer test
		int expected = 0;
		myDLL.clear();
		int actual = myDLL.size();
		assertEquals(expected, actual);

		// String test
		int expectedString = 0;
		myStringDLL.clear();
		int actualString = myStringDLL.size();
		assertEquals(expectedString, actualString);
	}

	@Test
	public void testAddIntE() {
		// Integer test
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

		// String test
		// test if new node is added
		myStringDLL.add(6, newString1);
		expectedString = myStringDLL.get(6);
		actualString = newString1;
		assertEquals(expectedString, actualString);

		myStringDLL.add(3, newString2);
		expectedString = myStringDLL.get(3);
		actualString = newString2;
		assertEquals(expectedString, actualString);

	}

	@Test
	public void testAddE() {
		// Integer test
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

		// String test
		// test if new node is added
		myStringDLL.add(newString1);
		expectedString = myStringDLL.get(6);
		actualString = newString1;
		assertEquals(expectedString, actualString);

		myStringDLL.add(7, newString2);
		expectedString = myStringDLL.get(7);
		actualString = newString2;
		assertEquals(expectedString, actualString);
	}

	@Test
	public void testAddAll() {
		// Integer test
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

		// String test
		// create new toadd DLL
		MyDLL<String> newMyStringDLL = new MyDLL<>();
		// setup
		newMyStringDLL.add(newString1);
		newMyStringDLL.add(newString2);

		// test if all the new DLL is added
		myStringDLL.addAll(newMyStringDLL);
		expectedString = myStringDLL.get(6);
		actualString = newString1;
		assertEquals(expectedString, actualString);

		expectedString = myStringDLL.get(7);
		actualString = newString2;
		assertEquals(expectedString, actualString);

	}

	@Test
	public void testGet() {
		// Integer test
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

		// String test
		// test if can get right string
		expectedString = myStringDLL.get(0);
		actualString = string0;
		assertEquals(expectedString, actualString);

		expectedString = myStringDLL.get(1);
		actualString = string1;
		assertEquals(expectedString, actualString);

		expectedString = myStringDLL.get(2);
		actualString = string2;
		assertEquals(expectedString, actualString);

		expectedString = myStringDLL.get(3);
		actualString = string3;
		assertEquals(expectedString, actualString);

		expectedString = myStringDLL.get(4);
		actualString = string4;
		assertEquals(expectedString, actualString);

		expectedString = myStringDLL.get(5);
		actualString = string5;
		assertEquals(expectedString, actualString);
	}

	@Test
	public void testRemoveInt() {
		// Integer test
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

		// String test
		// test if the element is removed at position
		expectedString = myStringDLL.remove(0);
		actualString = string0;
		assertEquals(expectedString, actualString);

		expectedString = myStringDLL.remove(0);
		actualString = string1;
		assertEquals(expectedString, actualString);

		expectedString = myStringDLL.remove(0);
		actualString = string2;
		assertEquals(expectedString, actualString);

		expectedString = myStringDLL.remove(0);
		actualString = string3;
		assertEquals(expectedString, actualString);

		expectedString = myStringDLL.remove(0);
		actualString = string4;
		assertEquals(expectedString, actualString);

		expectedString = myStringDLL.remove(0);
		actualString = string5;
		assertEquals(expectedString, actualString);

		assertEquals(0, myStringDLL.size());

	}

	@Test
	public void testRemoveE() {
		// Integer test
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

		// String test
		// set up
		String helloDuplicateString = "Hello";
		myStringDLL.add(0, helloDuplicateString);
		// test if only first elements are removed
		expectedString = myStringDLL.remove(string0);
		actualString = string0;
		assertEquals(expectedString, actualString);

		// test if the elements are removed
		actualString = myStringDLL.get(1);
		myStringDLL.remove(string0);
		expectedString = myStringDLL.get(0);
		assertEquals(expectedString, actualString);

		actualString = myStringDLL.get(1);
		myStringDLL.remove(string1);
		expectedString = myStringDLL.get(0);
		assertEquals(expectedString, actualString);

		actualString = myStringDLL.get(1);
		myStringDLL.remove(string2);
		expectedString = myStringDLL.get(0);
		assertEquals(expectedString, actualString);

		actualString = myStringDLL.get(1);
		myStringDLL.remove(string3);
		expectedString = myStringDLL.get(0);
		assertEquals(expectedString, actualString);

		actualString = myStringDLL.get(1);
		myStringDLL.remove(string4);
		expectedString = myStringDLL.get(0);
		assertEquals(expectedString, actualString);

		expectedString = myStringDLL.get(0);
		actualString = myStringDLL.remove(string5);
		assertEquals(expectedString, actualString);

		assertTrue(myStringDLL.size() == 0);

	}

	@Test
	public void testSet() {
		// Integer test
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

		// String test
		String actualAfterSetString;
		// test the return value after set
		expectedString = myStringDLL.get(0);
		actualString = myStringDLL.set(0, newString1);
		assertEquals(expectedString, actualString);

		// test if the value is set
		expectedString = newString1;
		actualString = myStringDLL.get(0);
		assertEquals(expectedString, actualString);

	}

	@Test
	public void testIsEmpty() {
		// Integer test
		// set up a new empty DLL
		MyDLL<Integer> myNullDLL = new MyDLL<>();

		// check if is empty
		assertTrue(myNullDLL.isEmpty());

		// check if is not empty
		assertFalse(myDLL.isEmpty());

		// String test
		// set up a new empty DLL
		MyDLL<String> myNullStringDLL = new MyDLL<>();

		// check if is empty
		assertTrue(myNullStringDLL.isEmpty());

		// check if is not empty
		assertFalse(myStringDLL.isEmpty());

	}

	@Test
	public void testContains() {
		// Integer test
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

		// String test
		// check if the element is in the DLL
		assertTrue(myStringDLL.contains(string0));
		assertTrue(myStringDLL.contains(string1));
		assertTrue(myStringDLL.contains(string2));
		assertTrue(myStringDLL.contains(string3));
		assertTrue(myStringDLL.contains(string4));
		assertTrue(myStringDLL.contains(string5));
		// check if the element is not in the DLL
		assertFalse(myStringDLL.contains(newString1));
		// check if newString1 is added to the DLL
		myStringDLL.add(newString1);
		assertTrue(myStringDLL.contains(newString1));
	}

	@Test
	public void testToArrayEArray() {
		// Integer test
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

		// String test
		// test if DLL is transformed to array when toHold is smaller than DLL
		String[] holdListString = new String[2];
		holdListString = myStringDLL.toArray(holdListString);
		for (int i = 0; i < myStringDLL.size(); i++) {
			assertEquals(myStringDLL.get(i), holdListString[i]);
		}

		// test if DLL is transformed to array when toHold is bigger than DLL
		holdListString = new String[10];
		holdListString = myStringDLL.toArray(holdListString);
		for (int i = 0; i < myStringDLL.size(); i++) {
			assertEquals(myStringDLL.get(i), holdListString[i]);
		}
	}

	@Test
	public void testToArray() {
		// Integer test
		// test if DLL is transformed to array
		Object[] actualArray = myDLL.toArray();
		Object[] expectedArray = { 10, 11, 12, 13, 14, 15 };
		assertArrayEquals(expectedArray, actualArray);

		// String test
		// test if DLL is transformed to array
		Object[] actualArrayString = myStringDLL.toArray();

		Object[] expectedArrayString = { "Hello", "World", "!", "?", ".", "," };
		assertArrayEquals(expectedArrayString, actualArrayString);

	}

	@Test
	public void testIterator() {
		// Integer test
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

		// String test
		// setup before test
		Iterator<String> stringIterator = myStringDLL.iterator();

		// test if the first element is returned
		expectedString = stringIterator.next();
		actualString = string0;
		assertEquals(expectedString, actualString);

		// test if the second element is returned
		expectedString = stringIterator.next();
		actualString = string1;
		assertEquals(expectedString, actualString);

		// test if the third element is returned
		expectedString = stringIterator.next();
		actualString = string2;
		assertEquals(expectedString, actualString);

		// test if the fourth element is returned
		expectedString = stringIterator.next();
		actualString = string3;
		assertEquals(expectedString, actualString);

		// test if the fifth element is returned
		expectedString = stringIterator.next();
		actualString = string4;
		assertEquals(expectedString, actualString);

		// test if the sixth element is returned
		expectedString = stringIterator.next();
		actualString = string5;
		assertEquals(expectedString, actualString);

		// test if there is no more elements
		assertFalse(stringIterator.hasNext());

		// test if NullPointerException is thrown
		assertThrows(NoSuchElementException.class, () -> stringIterator.next());

	}

}

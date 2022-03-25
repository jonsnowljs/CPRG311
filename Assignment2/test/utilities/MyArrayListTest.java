package utilities;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import utilities.MyArrayList;

public class MyArrayListTest {

	// Attributes
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
		mylist.add(11);
		mylist.add(12);
		mylist.add(13);
		mylist.add(14);
		mylist.add(15);
		int actual = mylist.size();
		assertEquals(5, actual);

	}

	@Test
	public void testGet() {
		MyArrayList<String> list = new MyArrayList<String>();
		list.add(0, "test");
		String actual = list.get(0);
		assertEquals("test", actual);

	}

	@Test
	public void testAdd() {
		MyArrayList<String> list = new MyArrayList<String>();
		boolean actual = list.add("test");
		list.add("test");
		list.add("test");
		list.add("test");
		list.add("test");
		list.add("test");
		list.add("test");
		list.add("test");
		list.add("test");
		assertEquals(true, actual);

	}

	@Test
	public void testAddWithIndex() {
		MyArrayList<Integer> list = new MyArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(0, 0);
		int actual = list.get(0);
		assertEquals(0, actual);

	}

	@Test
	public void testAddAll() {
		MyArrayList<Integer> list = new MyArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		MyArrayList<Integer> list2 = new MyArrayList<Integer>();
		list2.add(4);
		list2.add(5);
		list2.add(6);
		boolean actual = list.addAll(list2);
		assertEquals(true, actual);

	}

	@Test
	public void testGrow() {
		MyArrayList<Integer> list = new MyArrayList<Integer>();
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		int actual = list.size();
		assertEquals(6, actual);

	}
	
	@Test
	public void testClear() {
		MyArrayList<Integer> list = new MyArrayList<Integer>();
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		list.clear();
		int actual = list.size();
		assertEquals(0, actual);

	}
	
	@Test
	public void testRemove() {
		MyArrayList<Integer> list = new MyArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.remove(0);
		int actual = list.get(0);
		assertEquals(2, actual);

	}
	
	@Test
	public void testRemoveByElement() {
		MyArrayList<String> list = new MyArrayList<String>();
		list.add("test");
		list.add("test2");
		list.remove("test");
		assertEquals("test2", list.get(0));

	}
	
	@Test
	public void testSet() {
		MyArrayList<Integer> list = new MyArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.set(0, 5);
		int actual = list.get(0);
		assertEquals(5, actual);

	}
	
	@Test
	public void testIsEmpty() {
		MyArrayList<Integer> list = new MyArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		boolean actual = list.isEmpty();
		assertEquals(false, actual);

	}
	
	@Test
	public void testContains() {
		MyArrayList<Integer> list = new MyArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		assertEquals(true, list.contains(3));

	}
	
	@Test
	public void testToArrayByToHold() {
		MyArrayList<Integer> list = new MyArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		Integer[] toHold = new Integer[2];
		Object[] tempArray = list.toArray(toHold);
		int actual = (int) tempArray[0];
		assertEquals(1, actual);

	}
	
	@Test
	public void testToArray() {
		MyArrayList<Integer> list = new MyArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		Object[] tempArray = list.toArray();
		int actual = (int) tempArray[0];
		assertEquals(1, actual);

	}
	
	@Test
	public void testHasNextAndNext() {
		MyArrayList<Integer> list = new MyArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		assertEquals(true, list.hasNext());
		int actual = list.next();
		assertEquals(2, actual);
		

	}

}
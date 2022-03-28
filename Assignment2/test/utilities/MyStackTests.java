package utilities;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import utilities.MyArrayList;
import utilities.MyStack;
/**
 * JUnit testing for MyStack
 * 
 * @author Chinedu Alake, Desmond Yuen, Hardish Chander, Jiasheng Lu
 *
 */
public class MyStackTests<E> {
	// Attributes
	MyStack<Integer> stackInteger = new MyStack<>();
	private int intElement1 = 10;
	private int intElement2 = 11;
	private int intElement3 = 12;

	MyStack<String> stackString = new MyStack<>();
	private String stringElement1 = "Ten";
	private String stringElement2 = "Eleven";
	private String stringElement3 = "Twelve";

	MyStack<Double> stackDouble = new MyStack<>();
	private double doubleElement1 = 10.0;
	private double doubleElement2 = 11.0;
	private double doubleElement3 = 12.0;

	@Before
	public void setUp() throws Exception {

		// adding data to integer stack
		stackInteger.push(intElement1);
		stackInteger.push(intElement2);
		stackInteger.push(intElement3);

		// adding data to string stack
		stackString.push(stringElement1);
		stackString.push(stringElement2);
		stackString.push(stringElement3);

		// adding data to double stack
		stackDouble.push(doubleElement1);
		stackDouble.push(doubleElement2);
		stackDouble.push(doubleElement3);
	}

	@After
	public void tearDown() throws Exception {
		stackInteger.clear();
	}

	@Test
	public void testPush() {

		// Integer data type
		int testInt = 500;
		stackInteger.push(testInt);
		int actualInt = stackInteger.peek();

		// expected value is testInt added to the stackInteger and actual value is
		// returned by peek method
		assertEquals(testInt, actualInt);

		// String data type
		String testString = "Five Hundred";
		stackString.push(testString);
		String actualString = stackString.peek();

		// expected value is testString added to the stackString and actual value is
		// returned by peek method
		assertEquals(testString, actualString);

		// Double data type
		Double testDouble = 500.0;
		stackDouble.push(testDouble);
		Double actualDouble = stackDouble.peek();

		// expected value is testDouble added to the stackDouble and actual value is
		// returned by peek method
		assertEquals(testDouble, actualDouble);

		// Throws NullPointerException if null is pushed to stack
		assertThrows(NullPointerException.class, () -> stackDouble.push(null));

	}

	@Test
	public void testPop() {
		// Last element is 12
		int testInt = 12;
		int actualInt = stackInteger.pop();

		// Expected value is 12 and it is removed from the stack
		assertEquals(testInt, actualInt);

		// Next in stack is 11
		testInt = 11;
		actualInt = stackInteger.pop();

		// Expected value is 12 and it is removed from the stack
		assertEquals(testInt, actualInt);

		// Last element is Twelve
		String testString = "Twelve";
		String actualString = stackString.pop();
		// Expected value is Twelve
		assertEquals(testString, actualString);

		// Throws EmptyStackException if stack is empty
		stackDouble.clear();
		assertThrows(EmptyStackException.class, () -> stackDouble.pop());

	}

	@Test
	public void testPeek() {
		// Last element is 12
		int testInt = 12;
		int actualInt = stackInteger.peek();
		// Expected value is 12
		assertEquals(testInt, actualInt);

		// Last element is Twelve
		String testString = "Twelve";
		String actualString = stackString.peek();
		// Expected value is Twelve
		assertEquals(testString, actualString);

		// added "Hundred" to the stack
		testString = "Hundred";
		stackString.push(testString);
		actualString = stackString.peek();
		// Expected value is "Hundred"
		assertEquals(testString, actualString);

		// Throws EmptyStackException if stack is empty
		stackDouble.clear();
		assertThrows(EmptyStackException.class, () -> stackDouble.pop());
	}

	@Test
	public void testClear() {

		// clearing the stack
		stackInteger.clear();
		int testInt = 0;
		int actualInt = stackInteger.size();
		assertEquals(testInt, actualInt);

	}

	@Test
	public void testIsEmpty() {
		// clearing the stack then checking if empty
		stackInteger.clear();
		assertTrue(stackInteger.isEmpty());

		// to check if non empty stack returns false
		assertFalse(stackDouble.isEmpty());
	}

	@Test
	public void testToArray() {
		// Object array
		Object[] stackArray;

		// Integer test, converts stack to array
		stackArray = stackInteger.toArray();

		Object actualInt = stackArray[0];

		// Test if value at 0 index is 10
		assertEquals(stackArray[0], intElement1);
		// Test if value at 0 index is 10
		assertEquals(stackArray[2], intElement3);

	}

	@Test
	public void testToArrayEArray() {
		// creating int array of size 3
		Double[] arrayDouble = new Double[3];
		arrayDouble = stackDouble.toArray(arrayDouble);
		// first value of the stack
		Double testDouble = doubleElement1;

		// first value of array should be first value of stack
		assertEquals(arrayDouble[0], testDouble);

		// last value of the stack
		testDouble = doubleElement3;
		// last value of array should be last value of stack
		assertEquals(arrayDouble[2], testDouble);

		// Size test
		int stackSize = stackDouble.size();
		int arraySize = arrayDouble.length;

		// Size of the array should be same as stack
		assertEquals(stackSize, arraySize);

		// Throws NullPointerException if the passed array is null
		Double[] arrayDoubleNull = null;
		assertThrows(NullPointerException.class, () -> stackDouble.toArray(arrayDoubleNull));

	}

	@Test
	public void testContains() {
		// first element of the stack is 10
		int testInt = intElement1;
		assertTrue(stackInteger.contains(testInt));

		// stack does not contain 500
		testInt = 500;
		assertFalse(stackInteger.contains(testInt));

		// Throws NullPointerException if the passed value is null
		assertThrows(NullPointerException.class, () -> stackInteger.contains(null));

	}

	@Test
	public void testSearch() {
		// stack contains 12 at index 1
		int testValue = intElement3;
		int testInt = 1;
		int actualInt = stackInteger.search(testValue);

		assertEquals(testInt, actualInt);

		// 10 is at index 3
		testValue = intElement1;
		testInt = 3;
		actualInt = stackInteger.search(testValue);

		assertEquals(testInt, actualInt);

		// element does not exist
		testValue = 500;
		testInt = -1;
		actualInt = stackInteger.search(testValue);

		assertEquals(testInt, actualInt);

	}

	@Test
	public void testIterator() {
		// creating Iterator over Stack Object
		Iterator<Integer> iterator = stackInteger.iterator();

		// expected value is last element added
		int expectedInt = intElement3;
		int actualInt = iterator.next();

		// This test should pass because intElement3 is the last element
		assertEquals(expectedInt, actualInt);

		expectedInt = intElement2;
		actualInt = iterator.next();

		// This test should pass because intElement2 is the last element
		assertEquals(expectedInt, actualInt);
	}

	@Test
	public void testEqualsStackADTOfE() {
		// creating new stack
		MyStack<Integer> stackTest = new MyStack<>();
		
		// pushing elements manually
		stackTest.push(10);
		stackTest.push(11);
		stackTest.push(12);
		
		// comparing with integer stack, should return true
		assertTrue(stackInteger.equals(stackTest));
		
		// adding element new element to test stack
		stackTest.push(500);
		
		// comparing with integer stack, should return false
		assertFalse(stackInteger.equals(stackTest));

	}

	@Test
	public void testSize() {
		// stack has 3 elements
		int expectedSize = 3;
		int actualSize = stackInteger.size();
		assertEquals(expectedSize, actualSize);
		
		// pushing 3 new elements, new size = 6
		stackInteger.push(500);
		stackInteger.push(600);
		stackInteger.push(700);
		expectedSize = 6;
		actualSize = stackInteger.size();
		assertEquals(expectedSize, actualSize);
		
		// removing last element, new size = 5
		stackInteger.pop();
		expectedSize = 5;
		actualSize = stackInteger.size();
		assertEquals(expectedSize, actualSize);
		
	}

}

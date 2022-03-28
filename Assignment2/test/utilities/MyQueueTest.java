package utilities;

import static org.junit.Assert.*;

import java.util.EmptyStackException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import exceptions.EmptyQueueException;
/**
 * JUnit Testing for MyQueue
 * 
 * @author Chinedu Alake, Desmond Yuen, Hardish Chander, Jiasheng Lu
 *
 */
public class MyQueueTest<E> {
	//Attributes
	//Integer data
	MyQueue<Integer> queueInteger = new MyQueue<>();
	private int intElement1 = 25;
	private int intElement2 = 26;
	private int intElement3 = 27;

	//String data
	MyQueue<String> queueString = new MyQueue<>();
	private String stringElement1 = "Twenty-five";
	private String stringElement2 = "Twenty-six";
	private String stringElement3 = "Twenty-seven";


	@Before
	public void setUp() throws Exception {
		//Adding Data To Integer Queue
		queueInteger.enqueue(intElement1);
		queueInteger.enqueue(intElement2);
		queueInteger.enqueue(intElement3);
		
		//Adding Data To String Queue
		queueString.enqueue(stringElement1);
		queueString.enqueue(stringElement2);
		queueString.enqueue(stringElement3);
	}

	@After
	public void tearDown() throws Exception {
		queueInteger.dequeueAll();
		queueString.dequeueAll();
	}

	@Test
	public void testEnqueue() {
				
		//Test 1: if string data is added to queue 
		String testString = stringElement3;
		queueString.enqueue(testString);
		
		String[] stringArray = new String[queueString.size()];
		stringArray = queueString.toArray(stringArray);
		
		String actualString = stringArray[2];
		assertEquals(testString, actualString);
		
		//Test 2
		String testString2 = stringElement1;
		queueString.enqueue(testString2);
		
		String actualString2 = stringArray[0];
		assertEquals(testString2, actualString2);
		
		
		//Throws exception if data being added is null
		assertThrows(NullPointerException.class, () -> queueInteger.enqueue(null));
	}
	
	@Test
	public void testDequeue() {
		//Testing if int data is removed from queue 
		//Element at end of queue is 27
		int testInt = 25;
		int actualInt = queueInteger.dequeue();
		
		assertEquals(testInt, actualInt);
		
		//Testing if string data is removed from queue 
		//Element at end of queue is Twenty-Seven
		String testString = "Twenty-five";
		String actualString = queueString.dequeue();
		
		assertEquals(testString, actualString);
		
		
//		Throws exception when queue is empty
		queueInteger.dequeueAll();
		assertThrows(EmptyQueueException.class, () -> queueInteger.dequeue());
	}
	
	@Test
	public void testDequeueAll() {
		//Clearing the queue
		queueInteger.dequeueAll();
		int testInt = 0;
		int actualInt = queueInteger.size();
		assertEquals(testInt, actualInt);
		
		//Returns false if element is in queue
		assertFalse(actualInt > 0);
		
		queueInteger.dequeueAll();
		assertThrows(EmptyQueueException.class, () -> queueInteger.dequeue());
	}
	
	@Test
	public void testPeek() {
		//Testing peek in Integer Queue
		int testInt = 25;
		int actualInt = queueInteger.peek();
		assertEquals(testInt, actualInt);
		
		//Testing peek in String Queue
		String testString = "Twenty-five";
		String actualString = queueString.peek();
		assertEquals(testString, actualString);
		
		//Throw exception when queue is empty
		queueInteger.dequeueAll();
		assertThrows(EmptyQueueException.class, () -> queueInteger.dequeue());
	}
	
	@Test
	public void testIterator() {
		//Creating Iterator over Queue
		Iterator<Integer> iterator = queueInteger.iterator();
		
		//Expected int is first element in queueInteger
		int expectedInt = intElement1;
		int actualInt = iterator.next();
		
		assertEquals(expectedInt, actualInt);
		
		//Expected int is 2nd Element in queueInteger
		expectedInt = intElement2;
		actualInt = iterator.next();

		assertEquals(expectedInt, actualInt);
	}
	
	@Test
	public void testQueueEquals() {
		MyQueue<Integer> queueTest = new MyQueue<>();
		
		//Adding element to queue
		queueTest.enqueue(25);
		queueTest.enqueue(26);
		queueTest.enqueue(27);
		
		//Comparing queueTest with queueInteger 
		//Should return true
		assertTrue(queueInteger.equals(queueTest));
		
		queueTest.dequeue();
		assertFalse(queueInteger.equals(queueTest));
		
		
	}
	
	@Test
	public void testIsEmpty() {
		//Testing if queue is empty
		//Queue cleared first for test
		queueInteger.dequeueAll();
		assertTrue(queueInteger.isEmpty());
		
		int firstT = 10;
		queueInteger.enqueue(firstT);
		assertFalse(queueInteger.isEmpty());
	}
	
	@Test
	public void testIsFull() {
		//Checking if queue Integer is full
		 int size = queueInteger.size();
		 int actualIntegrSize = queueInteger.size();
		assertEquals(size, actualIntegrSize);
		
		int size2 = 5;
		assertFalse(queueInteger.equals(size2));
		
	}
	
	@Test
	public void testToArray() {
		Object[] queueArray;
		
		queueArray = queueInteger.toArray();
		Object actualInt = queueArray[0];
		
		//Test if eleemt at index[0] is 25
		assertEquals(queueArray[0], intElement1);
		
		//Test if element at index[2] is 27
		assertEquals(queueArray[2], intElement3);
	}
	
	@Test
	public void testToArrayEArray() {
		String[] arrayString = new String[3];
		
		queueString.toArray(arrayString);
		
		int queueSize = queueInteger.size();
		int arraySize = arrayString.length;
		
		assertEquals(queueSize, arraySize);
		
		assertEquals(arrayString[0], stringElement1);
		
		assertEquals(arrayString[2], stringElement3);
		
		//Throw null exception if data is null
		assertThrows(NullPointerException.class, () -> queueInteger.enqueue(null));
		
	}
	
	@Test
	public void testSize() {
		// Queue Integer has 3 elements. Size = 3
		int expectedSize= 3;
		int actualSize = queueInteger.size();
		assertEquals(expectedSize, actualSize);		
				
		// Adding 2 more elements. Size = 3 + 2 = 5		
		queueInteger.enqueue(50);
		queueInteger.enqueue(60);
		expectedSize = 5;
		actualSize = queueInteger.size();
		assertEquals(expectedSize, actualSize);		
		
		queueInteger.dequeue();
		expectedSize = 4;
		actualSize = queueInteger.size();
		assertEquals(expectedSize, actualSize);
		
		//Throws exception if queue empty OR Therefore if Size = 0 throw exception;
		queueInteger.dequeueAll();
		assertThrows(EmptyQueueException.class, () -> queueInteger.dequeue());
	}

}

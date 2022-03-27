package utilities;

import static org.junit.Assert.*;

import java.util.EmptyStackException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

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
		//Testing if int data is added to queue 
		int testInt = 25;
		queueInteger.enqueue(testInt);
		int actualInt = queueInteger.peek();
		
		assertEquals(testInt, actualInt);
		
		//Testing if string data is added to queue 
		String testString = "Twenty-five";
		queueString.enqueue(testString);
		String actualString = queueString.peek();
		
		assertEquals(testString, actualString);
		
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
		
		//Throws exception when queue is empty
//		queueInteger.dequeueAll();
//		assertThrows(EmptyStackException.class, () -> queueInteger.dequeue());
	}
	
	@Test
	public void testDequeueAll() {
		//Clearing the queue
		queueInteger.dequeueAll();
		int testInt = 0;
		int actualInt = queueInteger.size();
		assertEquals(testInt, actualInt);
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
	}
	
	@Test
	public void testIterator() {
		//Creating Iterator over Queue
		Iterator<Integer> iterator = queueInteger.iterator();
		
		//Expected int is first element in queueInteger
		int expectedInt = intElement1;
		int actualInt = iterator.next();
		
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
		
	}
	
	@Test
	public void testIsEmpty() {
		//Testing if queue is empty
		//Queue cleared first for test
		queueInteger.dequeueAll();
		assertTrue(queueInteger.isEmpty());
	}
	
	@Test
	public void testIsFull() {
		//Checking if queue Integer is full
		 int size = queueInteger.size();
		 int actualIntegrSize = queueInteger.size();
		assertEquals(size, actualIntegrSize);
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
		int[] arrayInt = new int[3];
		
		int queueSize = queueInteger.size();
		int arraySize = arrayInt.length;
		
		assertEquals(queueSize, arraySize);
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
	}

}

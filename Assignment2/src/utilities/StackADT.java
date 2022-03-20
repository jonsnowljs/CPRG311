package utilities;

import java.util.*;
import java.io.*;

/**
 * This is the professional Stack Interface for Advanced Object 
 * Oriented Programming (CRPG 311) at the SAIT Polytechnic.
 * This Stack embodies all the standard Stack operations, 
 * and includes several helper methods that will 
 * give the data structure more flexibility and use.
 * 
 * Created On: June 4, 2004
 * Updated On: Aug. 18, 2009
 * Updated On: Nov 15, 2018 by kitty
 * 
 * @author Don Heninger and Dave Watson
 * @version 1.1
 */
public interface StackADT<E> extends Serializable
{

	/**
	 * Pushes an item onto the top of this stack.
	 * 
	 * @param toAdd
	 *            item to be pushed onto the top of the stack.
	 * @throws NullPointerException when attempting to add a null element to
	 * the stack.
	 */
	public void push( E toAdd ) throws NullPointerException;

	/**
	 * Removes the object at the top of this stack and returns that object as
	 * the value of this function.
	 * 
	 * @return the item popped off the top of the stack.
	 * @throws EmptyStackException
	 *             if there are not items in the stack.
	 */
	public E pop() throws EmptyStackException;

	/**
	 * Looks at the object at the top of this stack without removing it from the
	 * stack.
	 * 
	 * @return the object at the top of this stack.
	 * @throws EmptyStackException
	 */
	public E peek() throws EmptyStackException;

	/**
	 * Clears all the items from this Stack. This method returns, unless there
	 * is an Exception (Runtime) thrown.
	 */
	public void clear();

	/**
	 * Returns <code>true</code> if this Stack contains no items.
	 * 
	 * @return <code>true</code> if this Stack contains no items.
	 */
	public boolean isEmpty();

	/**
	 * Returns an array containing all of the elements in this list in proper
	 * sequence. Obeys the general contract of the Collection.toArray method.
	 * 
	 * @return an array containing all of the elements in this list in proper
	 *         sequence.
	 */
	public Object[] toArray();

	/**
	 * Returns an array containing all of the elements in this list in proper
	 * sequence; the runtime type of the returned array is that of the specified
	 * array. Obeys the general contract of the Collection.toArray(Object[])
	 * method.
	 * 
	 * @param toHold
	 *            the array into which the elements of this stack are to be
	 *            stored, if it is big enough; otherwise, a new array of the
	 *            same runtime type is allocated for this purpose.
	 * @return an array containing the elements of this stack.
	 * @throws NullPointerException
	 *             if the specified array is null.
	 */
	public E[] toArray( E[] holder ) throws NullPointerException;

	/**
	 * Returns true if this list contains the specified element. More formally,
	 * returns true if and only if this list contains at least one element e
	 * such that (o==null ? e==null : o.equals(e)).
	 * 
	 * @param toFind
	 *            element whose presence in this list is to be tested.
	 * @return true if this list contains the specified element.
	 * @throws NullPointerException
	 *             if the specified element is null and this list does not
	 *             support null elements.
	 */
	public boolean contains( E toFind ) throws NullPointerException;

	/**
	 * Returns the 1-based position where an object is on this stack. If the
	 * object o occurs as an item in this stack, this method returns the
	 * distance from the top of the stack of the occurrence nearest the top of
	 * the stack; the topmost item on the stack is considered to be at distance
	 * 1. The equals method is used to compare o to the items in this stack.
	 * 
	 * @param toFind
	 *            the desired object.
	 * @return the 1-based position from the top of the stack where the object
	 *         is located; the return value -1 indicates that the object is not
	 *         on the stack.
	 */
	public int search( E toFind );

	/**
	 * Returns an iterator over the elements in this stack in proper sequence.
	 * 
	 * @return an iterator over the elements in this stack in proper sequence.
	 */
	public Iterator<E> iterator();

	/**
	 * Used to compare two Stack ADT's. To be equal two stacks must contain
	 * equal items appearing in the same order.
	 * 
	 * @param that the Stack ADT to be compared to this stack.
	 * @return <code>true</code> if the stacks are equal.
	 */
	public boolean equals( StackADT<E> that );
	
	/**
	 * Returns the depth of the current stack as an integer value.
	 * @return the current size to the stack as an integer.
	 */
	public int size();
}
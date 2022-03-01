package utilities;

import java.util.NoSuchElementException;

/**
 * This interface will provide an mono-directional iterator for any of the
 * data structures that are specified in this package. The implementor is 
 * only responsible for the simple methods. A more functional iterator is 
 * available in the <code>java.util</code> package.
 * 
 * This iterator makes a copy of the collection of elements and performs a
 * complete walk through the data structure. Note that the copy must be a 
 * deep copy, so methods such as clone() should not be used.
 *
 * @param <E> The type of element this iterator returns. 
 */
public interface Iterator<E> 
{	
	/**
	 * Returns <code>true</code> if the iteration has more elements. 
	 * (In other words, returns <code>true</code> if <code>next()</code> 
	 * would return an element rather than throwing an exception.)
	 * 
	 * @return <code>true</code> if the iterator has more elements.
	 */
	public boolean hasNext();
	
	
	/**
	 * Returns the next element in the iteration.
	 * 
	 * @return The next element in the iteration.
	 * @throws NoSuchElementException
	 * 			If the iteration has no more elements.
	 */
	public E next() throws NoSuchElementException;
}

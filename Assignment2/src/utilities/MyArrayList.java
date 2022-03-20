package utilities;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

@SuppressWarnings("unchecked")
public class MyArrayList <E> implements List<E>{
	
	//private static final long serialVersionUID = 4344482990L;
	private static final int DEFAULT_SIZE = 5; //default size
	private static final double DEFAULT_RATE = 0.75; //load factor
	
	private E[] array;
	private int length;
	private int size;
	private double rate;
	
	//constructor to set the size of array
	public MyArrayList() {
		this.size = DEFAULT_SIZE;
	}

	
	/*
	 * Returns the size of the array 
	 */

	@Override
	public int size() {
		
		return size;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(E e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int index, Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public E get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E set(int index, E element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(int index, E element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public E remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator<E> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator<E> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<E> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public java.util.Iterator<E> iterator() {
		Iterator<E> iterator = new Iterator<E>(array);
		return (java.util.Iterator<E>) iterator;
	}
	
	@SuppressWarnings("hiding")
	private class Iterator<E> implements utilities.Iterator<E>
	{
		private E[] list;
		int index;

		public Iterator(E[] input)
		{
			list = input;
			index = 0;
		}

		@Override
		public boolean hasNext()
		{
			if(list.length > 0)
				return (list[index] != null);
			else return false;
		}

		@Override
		public E next() throws NoSuchElementException
		{
			if (list[index] != null)
				return list[index++];
			else
				throw new NoSuchElementException("No more elements available");
		}

	}
	

}

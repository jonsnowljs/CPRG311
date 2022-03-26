package utilities;

import java.util.Arrays;
import java.util.NoSuchElementException;

@SuppressWarnings("unchecked")
public class MyArrayList <E> implements ListADT<E>{
	
	//private static final long serialVersionUID = 4344482990L;
	private static final int DEFAULT_LENGTH = 5; //default length
	private static final double DEFAULT_RATE = 0.75; //load factor
	
	private E[] array;
	// length of the array,it represent the available space in the array
	private int length;
	// size of the array, it count the availbale elements in the array
	private int size;
	private double rate;
//	ArrayList<E>
	
	/**
	 * Constructor to set the size of array
	 */
	public MyArrayList() {
		this.array = (E[]) new Object[DEFAULT_LENGTH];
		this.length = DEFAULT_LENGTH;
		this.size = 0;
		this.rate = DEFAULT_RATE;
		
	}



	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}


	@Override
	public void clear() {
		array = null;
		this.size = 0;
		
	}

	@Override
	public boolean add(int index, E toAdd) throws NullPointerException, IndexOutOfBoundsException {
		if (index < 0 || index > length ) {
			throw new IndexOutOfBoundsException();
		}
		if (toAdd == null) {
			throw new NullPointerException();
		}
		//add the toAdd element to the end of the array
		add(toAdd);
		
		//push the element after provided index one position back
		for (int i = size; i < size - index; i--) {
			array[i] = array[i-1]; 
		}
		
		array[index] = array[size];
		
		return true;
	}

	@Override
	public boolean add(E toAdd) throws NullPointerException {
		if (toAdd == null) {
			throw new NullPointerException();
		}
		
		if (size/length > rate) {
			E[] newArray = Arrays.copyOf(array, length * 2);
			array = newArray;
		}
		
		array[size] = toAdd;
		size ++;
		return true;
	}

	@Override
	public boolean addAll(ListADT<? extends E> toAdd) throws NullPointerException {
		if (toAdd == null) {
			throw new NullPointerException();
		}
		
		for (int i = 0; i < toAdd.size(); i++) {
			add(toAdd.get(i));
		}
		
		return true;
	}

	@Override
	public E get(int index) throws IndexOutOfBoundsException {
		if (index > size -1) {
			throw new IndexOutOfBoundsException();
		}
		
		return array[index];
	}

	@Override
	public E remove(int index) throws IndexOutOfBoundsException {
		if (index > size -1) {
			throw new IndexOutOfBoundsException();
		}
		
		E temp = array[index];
		for (int i = index + 1; i < size; i++) {
			array[i] = array[i-1];
		}
		
		size--;
		return temp;
	}

	@Override
	public E remove(E toRemove) throws NullPointerException {
		if (toRemove == null) {
			throw new NullPointerException();
		}
		
		for (int i = 0; i < size; i++) {
			if (toRemove.equals(array[i])) {
				array[i+1] = array[i];
				return toRemove;
			}
		}
		
		return toRemove;
	}

	@Override
	public E set(int index, E toChange) throws NullPointerException, IndexOutOfBoundsException {
		if (index > size -1) {
			throw new IndexOutOfBoundsException();
		}
		if (toChange == null) {
			throw new NullPointerException();
		}
		
		array[index] = toChange;
		
		return toChange;
	}

	@Override
	public boolean isEmpty() {
		if (size == 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean contains(E toFind) throws NullPointerException {
		if (toFind == null) {
			throw new NullPointerException();
		}
		
		for (int i = 0; i < size; i++) {
			if (toFind.equals(array[i])) {
				return true;
			}
		}
		
		return false;
	}

	@Override
	public E[] toArray(E[] toHold) throws NullPointerException {
		if (toHold == null) {
			throw new NullPointerException();
		}
		E[] tempArray = toHold.clone();
		return tempArray;
	}

	@Override
	public Object[] toArray() {
		
		return array.clone();
	}



	@Override
	public Iterator<E> iterator() {
		Iterator<E> iterator = new Iterator<E>() {
			private int index = 0;

			@Override
			public boolean hasNext() {
				if (index < size && array[index] != null) {
					return true;
				}
				return false;
			}

			@Override
			public E next() throws NoSuchElementException {
				E temp = array[index++];
				return temp;
			}
			
		};
		return iterator;
	}
	

}

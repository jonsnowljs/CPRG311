package utilities;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.NoSuchElementException;

@SuppressWarnings("unchecked")

public class MyArrayList<E> implements ListADT<E>, Iterator<E> {

	// private static final long serialVersionUID = 4344482990L;
	private static final int DEFAULT_SIZE = 5; // default size
	private static final double DEFAULT_RATE = 0.75; // load factor

	private E[] a;
	// length of the array,it represent the available space in the array
	private int current;
	private int length;
	// size of the array, it count the availbale elements in the array
	private int size;
	// Current size/length rate, represent how many space have been took up in the array
	private double rate;

	// constructor to set the size of array
	public MyArrayList() {
		this(DEFAULT_SIZE);
	}

	public MyArrayList(int capacity) {
		size = 0;
		current = 0;
		a = (E[]) new Object[capacity];
	}

	@Override
	public boolean hasNext() {
		return current < size && a[current] != null;
	}

	@Override
	public E next() throws NoSuchElementException {
		if (a[current + 1] != null) {
			return a[current++];
		} else
			throw new NoSuchElementException();

	}

	@Override
	public int size() {
		return size;
	}


	@Override
	public void clear() {
		size = 0;
		current = 0;
		a = (E[]) new Object[DEFAULT_SIZE];
	}
	

	@Override
	public boolean add(E toAdd) throws NullPointerException {
		if (toAdd == null) {
			throw new NullPointerException();
		}
		if (this.size >= a.length * DEFAULT_RATE ) {
			grow();
		}
		a[this.size] = toAdd;
		this.size++;
		return true;
	}

	@Override
	public boolean add(int index, E toAdd) throws NullPointerException, IndexOutOfBoundsException {
		if (toAdd == null) {
			throw new NullPointerException();
		} else if (index < 0 || index > this.size || index > a.length) {
			throw new IndexOutOfBoundsException();
		}
		if (this.size >= a.length * DEFAULT_RATE) {
			grow();
		}
		if (index == this.size) {
			return add(toAdd);
		} else {
			for (int i = this.size - 1; i >= index; i--) {
				a[i + 1] = a[i];
			}
			a[index] = toAdd;
			this.size++;
			return true;
		}
	}

	@Override
	public boolean addAll(ListADT<? extends E> toAdd) throws NullPointerException {
		if (toAdd == null) {
			throw new NullPointerException();
		}
		for (int i = 0; i < toAdd.size(); i++) {
			if (toAdd.get(i) != null) {
				add(toAdd.get(i));
			}
		}
		return true;
	}

	@Override
	public E get(int index) throws IndexOutOfBoundsException {
		if (index >= this.size || index < 0) {
			throw new IndexOutOfBoundsException();
		}
		
		return a[index];
	}

	@Override
	public E remove(int index) throws IndexOutOfBoundsException {
		if (index >= this.size || index < 0) {
			throw new IndexOutOfBoundsException();
		}
		E returnElement = a[index];
		for (int i = index + 1; i < this.size; i++) {
			a[i - 1] = a[i];
		}
		a[this.size] = null;
		this.size--;
		return returnElement;
	}

	@Override
	public E remove(E toRemove) throws NullPointerException {
		if (toRemove == null) {
			throw new NullPointerException();
		}
		for (int i = 0; i < this.size; i++) {
			if (a[i] == toRemove || a[i].equals(toRemove)) {
				E returnElement = a[i];
				for (int j = i + 1; j < this.size; j++) {
					a[j - 1] = a[j];
				}
				a[this.size] = null;
				this.size--;
				return returnElement;
			}
		}

		return null;
	}

	@Override
	public E set(int index, E toChange) throws NullPointerException, IndexOutOfBoundsException {
		if (toChange == null) {
			throw new NullPointerException();
		} else if (index < 0 || index >= this.size) {
			throw new IndexOutOfBoundsException();
		}

		E returnElement = a[index];
		a[index] = toChange;
		if (returnElement == null) {
			size++;
		}
		return returnElement;
	}

	@Override
	public boolean isEmpty() {
		for (int i = 0; i < size; i++) {
			if (a[i] != null)
				return false;
		}
		return true;
	}

	@Override
	public boolean contains(E toFind) throws NullPointerException {
		if (toFind == null) {
			throw new NullPointerException();
		}
		for (int i = 0; i < this.size; i++) {
			if (a[i] == toFind || a[i].equals(toFind)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public Object[] toArray() {
		E[] tempArray = (E[]) new Object[this.size];
		for (int i = 0; i < this.size; i++) {
			tempArray[i] = a[i];
		}
		return tempArray;
	}

	@Override
	public E[] toArray(E[] toHold) throws NullPointerException {
		if (toHold == null) {
			throw new NullPointerException();
		}
		if (toHold.length < this.size) {
			E[] tempArray = (E[]) Array.newInstance(this.get(0).getClass(), size);
			for (int i = 0; i < this.size; i++) {
				tempArray[i] = a[i];
			}
			return tempArray;
		} else {
			for (int i = 0; i < this.size; i++) {
				toHold[i] = a[i];
			}
			return toHold;
		}

	}

	@Override
	public Iterator<E> iterator() {

		Iterator<E> it = new Iterator<E>() {
			@Override
			public boolean hasNext() {
				return current < size && a[current] != null;
			}

			@Override
			public E next() {
				if (!this.hasNext()) {
					throw new NoSuchElementException();
				}
				return a[current++];
			}
		};
		return it;
	}

	// double the array size 
	private void grow() {
		int arrayLength = a.length;
		E[] tempArray = (E[]) new Object[arrayLength * 2];
		for (int i = 0; i < this.size; i++) {
			tempArray[i] = a[i];
		}
		a = tempArray;
	}

}

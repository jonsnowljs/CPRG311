package utilities;

import java.util.EmptyStackException;

public class MyStack <E> implements StackADT{
	
	private MyArrayList<E> list;
	
	public MyStack() {
		list = new MyArrayList<E>();
		
	}

	@Override
	public void push(Object toAdd) throws NullPointerException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object pop() throws EmptyStackException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object peek() throws EmptyStackException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray(Object[] holder) throws NullPointerException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean contains(Object toFind) throws NullPointerException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int search(Object toFind) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean equals(StackADT that) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

}

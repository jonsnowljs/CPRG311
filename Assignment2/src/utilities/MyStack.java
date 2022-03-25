package utilities;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class MyStack <E> implements StackADT<E>, Iterator<E>{
	
	private MyArrayList<E> list;
	
	public MyStack() {
		list = new MyArrayList<E>();
		
	}
	MyArrayList<E> stack = new MyArrayList<>(); 

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E next() throws NoSuchElementException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void push(E toAdd) throws NullPointerException {
		stack.add(toAdd);	
	}

	@Override
	public E pop() throws EmptyStackException {
		return stack.remove(stack.size() - 1);
	}

	@Override
	public E peek() throws EmptyStackException {
		return stack.get(stack.size() - 1);
	}

	@Override
	public void clear() {
		stack.clear();
	}

	@Override
	public boolean isEmpty() {
		return stack.isEmpty();
	}

	@Override
	public Object[] toArray() {
		Object[] stackArray = new Object[stack.size()];
		
		
			
		return stackArray;
	}

	@Override
	public E[] toArray(E[] holder) throws NullPointerException {
		
		Object[] stackArray = new Object[stack.size()];
		
		// USE ITERATOR
		
		
		return (E[]) stackArray;
	}

	@Override
	public boolean contains(E toFind) throws NullPointerException {
		return stack.contains(toFind);
	}

	@Override
	public int search(E toFind) {
		int size = stack.size();
		int index = 0;
		// USE ITERATOR
		return 0;
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean equals(StackADT<E> that) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		return stack.size();
	}
	
}

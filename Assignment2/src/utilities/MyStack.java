package utilities;

import java.util.EmptyStackException;

/**
 * MyStack from scratch implemented using StackADT
 * 
 * @author Chinedu Alake, Desmond Yuen, Hardish Chander, Jiasheng Lu
 *
 */
public class MyStack<E> implements StackADT<E> {

	private MyArrayList<E> stack;

	public MyStack() {
		stack = new MyArrayList<E>();
	}

	@Override
	public void push(E toAdd) throws NullPointerException {
		stack.add(toAdd);
	}

	@Override
	public E pop() throws EmptyStackException {
		if (stack.size() <= 0) {
			throw new EmptyStackException();
		}
		return stack.remove(stack.size() - 1);
	}

	@Override
	public E peek() throws EmptyStackException {
		if (stack.size() <= 0) {
			throw new EmptyStackException();
		}
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
	public Object[] toArray(){
		Object[] stackArray = stack.toArray();
		return stackArray;
	}

	@Override
	public E[] toArray(E[] holder) throws NullPointerException {		
		holder = stack.toArray(holder);
		return holder;
	}

	@Override
	public boolean contains(E toFind) throws NullPointerException {
		return stack.contains(toFind);
	}

	@Override
	public int search(E toFind) {
		int size = stack.size();
		int index = 1;
		E next;
		Iterator<E> iterator = this.iterator();

		for (int i = 0; i < size; i++) {
			next = iterator.next();
			if (next == toFind) {
				return index;
			}
			index++;
		}
		return -1;
	}

	@Override
	public Iterator<E> iterator() {
		MyArrayList<E> stackArrayList = new MyArrayList<E>();
		stackArrayList.addAll(stack);
		int stackSize = stack.size();
		int lastIndex = stackSize - 1;

		for (int i = 0; i < stackSize; i++) {
			E next = stack.get(i);
			stackArrayList.set(lastIndex, next);
			lastIndex--;
		}

		Iterator stackIterator = stackArrayList.iterator();
		return stackIterator;
	}

	@Override
	public boolean equals(StackADT<E> that) {
		Iterator<E> stackIterator = this.iterator();
		Iterator<E> thatIterator = that.iterator();
		boolean equal = true;
		
		while (stackIterator.hasNext()) {
			if (stackIterator.next() != thatIterator.next()) {
				return false;
			}
		}
		
		return true;
	}

	@Override
	public int size() {
		return stack.size();
	}

}

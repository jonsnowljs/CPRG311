package utilities;

import java.lang.reflect.Array;
import java.util.NoSuchElementException;

public class MyDLL <E> implements ListADT<E>{
	private DLLNode<E> head;
	private DLLNode<E> tail;
	private int size;
	
	
	
	/**
	 * @param head
	 * @param tail
	 * @param size
	 */
	public MyDLL() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public void clear() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}

	@Override
	public boolean add(int index, E toAdd) throws NullPointerException, IndexOutOfBoundsException {
		if (index > size || index < 0) {
			throw new IndexOutOfBoundsException();
		}
		if (toAdd == null) {
			throw new NullPointerException();
		}
		
		DLLNode<E> toAddNode = new DLLNode<E>(toAdd, null, null);
		
		if (size == 0) {
			head = toAddNode;
			tail = toAddNode;
			
		} else if (size > 0 ) {
			// add before head node
			if (index == 0 ) {
				toAddNode.setNext(head);
				head.setPrev(toAddNode);
				head = toAddNode;
			// add after tail
			} else if (index == size) {
				tail.setNext(toAddNode);
				toAddNode.setPrev(tail);
				tail = toAddNode;
			// add at index 
			} else {
				DLLNode<E> currentNode = head;
				currentNode = getNode(index);
				currentNode.getPrev().setNext(toAddNode);
				toAddNode.setPrev(currentNode.getPrev());
				currentNode.setPrev(toAddNode);
				toAddNode.setNext(currentNode);
			}
		}

		size++;
		
		return true;
	}

	@Override
	public boolean add(E toAdd) throws NullPointerException {
		if (toAdd == null) {
			throw new NullPointerException();
		}
		add(size, toAdd);
		
//		DLLNode<E> toAddNode = new DLLNode<E>(toAdd, null, null);
//		tail.setNext(toAddNode);
//		toAddNode.setPrev(tail);
//		tail = toAddNode;
//		
//		size++;
		return true;
	}

	@Override
	public boolean addAll(ListADT<? extends E> toAdd) throws NullPointerException {
		if (toAdd == null || toAdd.size() == 0) {
			throw new NullPointerException();
		}
		for (int i = 0; i < toAdd.size(); i++) {
			E toAddElement = toAdd.get(i);
			this.add(toAddElement);
			size++;
		}
		
		return true;
	}

	@Override
	public E get(int index) throws IndexOutOfBoundsException {
		if (index >= size || index < 0) {
			throw new IndexOutOfBoundsException();
		}
		DLLNode<E> currentNode = getNode(index);

		return (E)currentNode.getElement();
	}

	@Override
	public E remove(int index) throws IndexOutOfBoundsException {
		if (index > size || index < 0) {
			throw new IndexOutOfBoundsException();
		}
		
		DLLNode<E> currentNode = getNode(index);
		if (index == 0) {
			head = currentNode.getNext();
			head.setPrev(null);
		}else if (index == size -1) {
			tail = currentNode.getPrev();
			tail.setNext(null);
		}else {
			currentNode.getPrev().setNext(currentNode.getNext());
			currentNode.getNext().setPrev(currentNode.getPrev());
		}
		E currElement = (E) currentNode.getElement();
		currentNode = null;	
		size--;
		return currElement;
	}

	@Override
	public E remove(E toRemove) throws NullPointerException {
		if (toRemove == null) {
			throw new NullPointerException();
		}
		
		for (int i = 0; i < size; i++) {
			if (this.get(i) == toRemove) {
				this.remove(i);
				return toRemove;
			}
		}
		return null;
	}

	@Override
	public E set(int index, E toChange) throws NullPointerException, IndexOutOfBoundsException {
		if (index > size || index < 0) {
			throw new IndexOutOfBoundsException();
		}
		if (toChange == null) {
			throw new NullPointerException();
		}
		DLLNode<E> prevNode = this.getNode(index);
		E prevElement = (E) prevNode.getElement();
		this.getNode(index).setElement(toChange);
		
		return prevElement;
	}

	@Override
	public boolean isEmpty() {
		
		return this.size == 0;
	}

	@Override
	public boolean contains(E toFind) throws NullPointerException {
		if (toFind == null) {
			throw new NullPointerException();
		}
		for (int i = 0; i < size; i++) {
			if (this.get(i) == toFind) {
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
		
		// expand the toHold array size if it's not enought to hold the elements in this double link list
		if (toHold.length < size) {
			toHold = (E[]) Array.newInstance(this.get(0).getClass(), size);
		}
	
		for (int i = 0; i < size; i++) {
			toHold[i] = this.get(i);
		}

		return (E[])toHold;
	}

	@Override
	public Object[] toArray() {		
		Object[] objectArray = new Object[size];
		for (int i = 0; i < size; i++) {
			objectArray[i] = this.get(i);
		}
		
		return objectArray;
	}

	MyDLL<E> myDLL = this;
	@Override
	public Iterator<E> iterator() {
		Iterator<E> iterator = new Iterator<E>() {
			private int index = 0;
			
			@Override
			public boolean hasNext() {
				if (index < size) {
					return true;
				}
				return false;
			}

			@Override
			public E next() throws NoSuchElementException {
				index++;
				E element = myDLL.get(index);
				return element;
			}
			
		};
		return iterator;
	}
	
	// Get the node at index position
	private DLLNode<E> getNode(int index) {
		DLLNode<E> currentNode = head;
		for (int i = 0; i < index; i++) {
			currentNode = currentNode.getNext();
		}
		return currentNode;
	}

	
	

}

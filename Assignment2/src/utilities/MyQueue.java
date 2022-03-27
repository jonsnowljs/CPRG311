package utilities;


import java.util.NoSuchElementException;


import exceptions.EmptyQueueException;

//Chinedu
public class MyQueue <E> implements QueueADT<E>{
	
	private MyDLL<E> list;

	public MyQueue() {
		list = new MyDLL<E>();

	}
	
	@Override
	public void enqueue(E toAdd) throws NullPointerException {

		// Add element to the queue
		list.add(toAdd);
	}

	@Override
	public E dequeue() throws EmptyQueueException {
		//Throws exception if queue is empty
		if (list.size() <= 0) {
			throw new EmptyQueueException();
		}
		return list.remove(0);
	}

	@Override
	public E peek() throws EmptyQueueException {
		//Throws exception if queue is empty
		if (list.size() <= 0) {
			throw new EmptyQueueException();
		}
		//Returns first element in queue without removing element
		return list.get(0);
	}

	@Override
	public void dequeueAll() {
		list.clear();
	}

	@Override
	public boolean isEmpty() {
		return list.isEmpty();
	}


	@Override
	public boolean equals(QueueADT<E> that) {
		Iterator<E> listIterator = this.iterator();
		Iterator<E> thatIterator = that.iterator();

		while (listIterator.hasNext()) {
			if (listIterator.next() != thatIterator.next()) {
				return false;
			}
		} 

		return true;
	}

	@Override
	public Object[] toArray() {
		return list.toArray();
	}

	@Override
	public E[] toArray(E[] holder) throws NullPointerException {
		return list.toArray(holder);
	}

	@Override
	public boolean isFull() {
		// Check if queue is full
		// Return true if yes
		//Not in use as of now
		return false;
	}

	@Override
	public int size() {
		return list.size();
	}

	@Override
	public Iterator<E> iterator() {
		return list.iterator();
	}
}

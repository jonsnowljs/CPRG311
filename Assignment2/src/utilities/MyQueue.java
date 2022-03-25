package utilities;


import java.util.NoSuchElementException;


import exceptions.EmptyQueueException;

public class MyQueue <E> implements QueueADT<E>, Iterator<E>{
	
	private MyDLL<E> list;
	private int queueSize; //Size of Queue
	
	public MyQueue() {
		list = new MyDLL<E>();
		queueSize = list.size();
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		// Check if Queue list has next. Returns true if yes
		if (list.hasNext()) {
			return true;
		} else {
			return false;
		}	
	}

	@Override
	public E next() throws NoSuchElementException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void enqueue(E toAdd) throws NullPointerException {
		// TODO Auto-generated method stub
	
	}

	@Override
	public E dequeue() throws EmptyQueueException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E peek() throws EmptyQueueException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void dequeueAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		// Checks if queue is empty returns true if it is
		if (queueSize == 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean equals(QueueADT<E> that) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E[] toArray(E[] holder) throws NullPointerException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		if (queueSize > list.size()) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		//Checks size of queue
		queueSize = this.size();
		return queueSize;
	}


}

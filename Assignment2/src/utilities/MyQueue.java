package utilities;


import java.util.NoSuchElementException;


import exceptions.EmptyQueueException;

//Chinedu
public class MyQueue <E> implements QueueADT<E>, Iterator<E>{
	
	private MyDLL<E> rear;
	private MyDLL<E> front;
	private MyDLL<E> list;
	private int queueSize; //Size of Queue
	private int index; //Position of element
	private E[] elementData;
 	
	public MyQueue() {
		list = new MyDLL<E>();
		queueSize = list.size();
	}
	
	MyQueue<E> myDLL = this;

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		// Check if Queue list has next. Returns true if yes	
		 Iterator<E> itr = list.iterator();
		if(itr.hasNext()) {
			 return true;
		 } else {
			 return false;
		 }
	}
		 
//		if(queueSize == 0)
//        {
//            return false;
//        }
//        else
//        {
//            return (index < queueSize);
//    //Either this return or return above should give same result
//            //return true;
//        }
//	}

	@Override
	public E next() throws NoSuchElementException {
		// TODO Auto-generated method stub
		Iterator<E> itr = list.iterator();
		if (itr.hasNext()) {
		index++;
	}
		return elementData[index];
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
	//Returns first element in queue without removing element
	public E peek() throws EmptyQueueException {
		// TODO Auto-generated method stub
		return this.peek();
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
		//Returns an iterator over the queue
		return iterator();
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
		//Checks size of queue and number of elements in queue
		queueSize = this.size();
		return queueSize;
	}


}

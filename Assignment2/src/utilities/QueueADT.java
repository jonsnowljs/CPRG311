package utilities;

public interface QueueADT<E> {

    /**
     * Returns the number of elements in the queue.
     * 
     * @return the number of elements in the queue
     */
    public int size();

    /**
     * Adds data to the rear(end) of the queue
     */
    public void enqueue(E data);

    /**
     * Removes data at the front of the queue
     */
    public void dequeue(E data);

    /**
     * Gets the element at the front of queue without removing it
     * 
     * @return E the element at the rear of the queue
     */
    public E peek();

    /**
     * Returns true if two queues contain equal items appearing in the same order
     * 
     * @return true if both queues contain same items in the same order
     */
    public boolean equals(QueueADT<E> queue);

    /**
     * Returns an iterator over the items contained in the queue
     * 
     * @return iterator over the queue
     */
    public Iterator<E> iterator();

    // TODO
    // ASK REETA
    public Object[] toArray();

    // TODO
    // ASK REETA
    public E[] toArray(E[] copy);

    /**
     * Returns true if this queue contains no elements.
     * 
     * @return true if the queue is empty
     */
    public boolean isEmpty();

    /**
     * Returns true if this queue is full
     * 
     * @return true if this queue is full
     */
    public boolean isFull();

    /**
     * Clears the Queue
     *
     */
    public void dequeueAll();

}

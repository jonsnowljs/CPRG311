package utilities;

public interface StackADT<E> {

    /**
     * Returns the number of elements in this stack.
     * 
     * @return the number of elements in the stack
     */
    public int size();

    /**
     * Adds the specified data to the top of the stack
     * 
     * @param data data to be pushed on the stack
     */
    public void push(E data);

    /**
     * Removes the top element from the stack
     */
    public void pop();

    /**
     * Access the topmost element in a stack without removing it
     * 
     * @return E the topmost element in the stack
     */
    public E peek();

    /**
     * Returns true if two stacks contain equal items appearing in the same order
     * 
     * @return true if both stacks contain same items in the same order
     */
    public boolean equals(StackADT<E> stack);

    /**
     * Returns an iterator over the items contained in the stack
     * 
     * @return iterator over the stack
     */
    public Iterator<E> iterator();

    // TODO
    // ASK REETA
    public Object[] toArray();

    // TODO
    // ASK REETA
    public E[] toArray(E[] copy);

    /**
     * Searches and returns for the specified element in the stack
     * 
     * @return returns the position of the element in the stack
     */
    public int search(E obj);

    /**
     * Returns true if element is in the stack
     * 
     * @return true if element is in the stack
     */
    public boolean contains(E obj);

    /**
     * Returns true if this stack contains no elements.
     * 
     * @return true if the stack is empty
     */
    public boolean isEmpty();

    /**
     * Clears the Stack
     *
     */
    public void clear();
}

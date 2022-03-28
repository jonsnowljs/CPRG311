package utilities;

import java.io.Serializable;
/**
 * DLLNode Object
 * 
 * @author Chinedu Alake, Desmond Yuen, Hardish Chander, Jiasheng Lu
 *
 */
public class DLLNode<E> implements Serializable{
		//Constants
		//private static final long	serialVersionUID	= 7989585453298881119L;
	
		/**
	 * 
	 */
	private static final long serialVersionUID = -1935415465693460458L;
		//Attributes
		private E element;
		private DLLNode<E> next;
		private DLLNode<E> prev;
		
		//Constructors
		/**
		 * Constructs a SLL node with an element, and successor and previous node references.
		 * @param element Object containing data to be stored
		 * @param next SLLNode containing a reference to the next node in the list.
		 * @param prev SLLNode containing a reference to the previous node in the list.
		 */
		public DLLNode(E element, DLLNode<E> prev, DLLNode<E> next)
		{
			this.element = element;
			this.prev = prev;
			this.next = next;
		}

		/**
		 * @return the element
		 */
		public Object getElement() {
			return element;
		}

		/**
		 * @param element the element to set
		 */
		public void setElement(E element) {
			this.element = element;
		}

		/**
		 * @return the next
		 */
		public DLLNode<E> getNext() {
			return next;
		}

		/**
		 * @param next the next to set
		 */
		public void setNext(DLLNode<E> next) {
			this.next = next;
		}

		/**
		 * @return the prev
		 */
		public DLLNode<E> getPrev() {
			return prev;
		}

		/**
		 * @param prev the prev to set
		 */
		public void setPrev(DLLNode<E> prev) {
			this.prev = prev;
		}
		
		

}

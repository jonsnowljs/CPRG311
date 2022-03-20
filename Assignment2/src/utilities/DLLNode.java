package utilities;

import java.io.Serializable;

public class DLLNode implements Serializable{
		//Constants
		//private static final long	serialVersionUID	= 7989585453298881119L;
	
		//Attributes
		private Object			element;
		private DLLNode			next;
		private DLLNode			prev;
		
		//Constructors
		/**
		 * Constructs a SLL node with an element, and successor and previous node references.
		 * @param element Object containing data to be stored
		 * @param next SLLNode containing a reference to the next node in the list.
		 * @param prev SLLNode containing a reference to the previous node in the list.
		 */
		public DLLNode(Object element, DLLNode prev, DLLNode next)
		{
			this.element = element;
			this.prev = prev;
			this.next = next;
		}
		

}

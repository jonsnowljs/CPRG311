/**
 * 
 */
package implement;

import java.util.NoSuchElementException;

import utilities.BSTreeADT;
import utilities.BSTreeNode;
import utilities.Iterator;
import utilities.TreeException;

/**
 * @author Jason
 * @param <E>
 *
 */
public class BSTree<E extends Comparable<? super E>> implements BSTreeADT<E> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2202313053604159123L;
	
	BSTreeNode<E> root = null;
	int size = 0;
	
	public BSTree(BSTreeNode<E> root) {
		this.root = root;
		this.size = 0;
	}

	@Override
	public BSTreeNode<E> getRoot() {
		return this.root;
	}

	public int getHeight() {
		if (root == null) {
			return -1;
		}
		return getHeight(root);
	}

	private int getHeight(BSTreeNode<E> node) {
		if (node == null) {
			return 0;
		} else {
			int lHeight = getHeight(node.getLeft());
			int rHeight = getHeight(node.getRight());

			if (lHeight > rHeight) {
				return (lHeight + 1);
			} else {
				return (rHeight + 1);
			}
		}
	}
	
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return this.size;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size == 0;
	}
 
	@Override
	public void clear() {
		this.root = null;
		this.size = 0;	
	}

	@Override
	public boolean contains(E entry) throws TreeException {
		if (root == null) {
			return false;
		} else {
			return contains(entry);
		}
		
	}

	@Override
	public BSTreeNode<E> search(E entry) throws TreeException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(E newEntry) throws NullPointerException {
		BSTreeNode<E> newNode = new BSTreeNode<E>(newEntry, null, null);
		
		if (root == null) {
			root = newNode;
			return true;
		} else {
			return root.add(newNode);
			
		}

	}

	@Override
	public Iterator<E> inorderIterator() {
		Iterator<E> it = new Iterator<E>() {
			@Override
			public boolean hasNext() {
				return 
			}

			@Override
			public E next() {
				if (!this.hasNext()) {
					throw new NoSuchElementException();
				}
				return root.
			}
		};
		return it;
		
	}

	@Override
	public Iterator<E> preorderIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator<E> postorderIterator() {
		// TODO Auto-generated method stub
		return null;
	}


	

}

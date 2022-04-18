/**
 * 
 */
package implement;

import utilities.BSTreeADT;
import utilities.BSTreeNode;
import utilities.Iterator;
import utilities.TreeException;

/**
 * @author Jason, Desmond Yuen
 * @param <E>
 *
 */
public class BSTree<E extends Comparable<? super E>> implements BSTreeADT<E> {

	private BSTreeNode<E> root;
	private int size = 0;

	public BSTree() {
		this.root = null;
	}

	public BSTree(E element) {
		this.root = new BSTreeNode<E>(element);
		size++;
	}

	@Override
	public BSTreeNode<E> getRoot() throws TreeException {
		if (this.root == null) {
			throw new TreeException();
		}
		return root;
	}

	private BSTreeNode<E> recursiveInsert(BSTreeNode<E> root, E element) {
		if (root == null) {
			root = new BSTreeNode<E>(element);
			return root;
		}

		if (element.compareTo(root.getData()) < 0) {
			root.setLeft(recursiveInsert(root.getLeft(), element));
		} else if (element.compareTo(root.getData()) > 0) {
			root.setRight(recursiveInsert(root.getRight(), element));
		}
		return root;
	}

	private BSTreeNode<E> recursiveSearch(BSTreeNode<E> root, E element) {
		if (root == null || root.getData().equals(element)) {
			return root;
		}
		if (root.getData().compareTo(element) > 0) {
			return recursiveSearch(root.getLeft(), element);
		} else
			return recursiveSearch(root.getRight(), element);
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
		return size;
	}

	@Override
	public boolean isEmpty() {
		return this.root == null;
	}

	@Override
	public void clear() {
		this.root = null;
		this.size = 0;
	}

	@Override
	public boolean contains(E entry) throws TreeException {
		if (recursiveSearch(this.root, entry) != null) {
			return true;
		}
		return false;
	}

	@Override
	public BSTreeNode<E> search(E entry) throws TreeException {
		if (this.root == null) {
			throw new TreeException();
		}
		return recursiveSearch(this.root, entry);
	}

	@Override
	public boolean add(E newEntry) throws NullPointerException {
		if (newEntry == null) {
			throw new NullPointerException();
		}
		root = recursiveInsert(root, newEntry);
		this.size++;
		return true;
	}

	@Override
	public Iterator<E> inorderIterator() {
		// TODO Auto-generated method stub
		return null;
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

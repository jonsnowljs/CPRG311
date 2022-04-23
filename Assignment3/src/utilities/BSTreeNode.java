package utilities;

public class BSTreeNode<E extends Comparable<? super E>> {
	E data;
	BSTreeNode<E> left;
	BSTreeNode<E> right;
	
	public BSTreeNode(E data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
	
	public BSTreeNode(E data, BSTreeNode<E> left, BSTreeNode<E> right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}
	
	public boolean add(BSTreeNode<E> node) {
		if (node == null) {
			return false;
		}
		
		if (node.data.compareTo(this.data) < 0) {
			if (this.left == null) {
				this.left = node;
			} else {
				this.left.add(node);
			}
		} else {
			if (this.right == null) {
				this.right = node;
			} else {
				this.right.add(node);
			}
		}
		return true;
	}
	
	public boolean contains(BSTreeNode<E> node) {
		if (node == null) {
			return false;
		}
		
		if (node.data.compareTo(this.data) < 0) {
			this.contains(left);
		} else if (node.data.compareTo(this.data) > 0) {
			this.contains(right);
		} else {
			return true;
		}
		
		return false;
	}
	
	public void inorder( ) {
		if (this.left != null) {
			this.left.inorder();
		}
		
		if (this.right != null) {
			this.right.inorder();
		}
	}
	
 


	/**
	 * @param data the data to set
	 */
	public void setData(E data) {
		this.data = data;
	}

	/**
	 * @return the left
	 */
	public BSTreeNode<E> getLeft() {
		return left;
	}

	/**
	 * @param left the left to set
	 */
	public void setLeft(BSTreeNode<E> left) {
		this.left = left;
	}

	/**
	 * @return the right
	 */
	public BSTreeNode<E> getRight() {
		return right;
	}

	/**
	 * @param right the right to set
	 */
	public void setRight(BSTreeNode<E> right) {
		this.right = right;
	}

	public E getData() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}

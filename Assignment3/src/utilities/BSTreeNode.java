package utilities;

public class BSTreeNode<E> {
	E data;
	BSTreeNode<E> left;
	BSTreeNode<E> right;
	
	public BSTreeNode(E data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
}

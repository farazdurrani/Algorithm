package com.algorithm.tree23;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class RedBlackTree<E extends Comparable<E>> {

	// helper
	private final TreeNode NIL;

	private TreeNode<E> root;
	private Color RED = Color.RED;
	private Color BLACK = Color.BLACK;

	public RedBlackTree() {
		NIL = TreeNode.NIL;
		NIL.color = BLACK;
		root = NIL;
	}

	public boolean insertRecursive(E data) {
		if (root == NIL) {
			root = new TreeNode<>(NIL, data);
			root.color = BLACK;
			root.left = NIL;
			root.right = NIL;
			return true;
		} else {
			TreeNode<E> z = root.insert(root, data);
			if (z != null) {
				z.left = NIL;
				z.right = NIL;
				z.color = RED;
				insertRBFixup(z);
				return true;
			}
		}
		return false;
	}

	private void insertRBFixup(TreeNode<E> z) {
	}

	public void levelOrderTraversalIterative() {
		int h = height();
		for (int level = 1; level <= h; level++) {
			printNodeAtGivenLevel(root, level);
		}
		System.out.println();
	}

	private void printNodeAtGivenLevel(TreeNode<E> node, int level) {
		if (node == NIL) {
			return;
		}
		if (level == 1) {
			System.out.print(node.data + " ");
			return;
		}
		printNodeAtGivenLevel(node.left, level - 1);
		printNodeAtGivenLevel(node.right, level - 1);
	}

	public E minRecursive() {
		return null;
	}

	public E maxRecursive() {
		return null;
	}

	public TreeNode<E> getRoot() {
		return null;
	}

	public E successor(E data) {
		return null;
	}

	public TreeNode<E> searchRecursive(E data) {
		return null;
	}

	public void inorderTraversalIterative() {
	}

	public E containsIterative(E data) {
		return null;
	}

	public void levelOrderTraversalQueue() {
	}

	public void inorderTraversalResursive() {
	}

	public boolean insertIterative(E data) {
		return false;
	}

	public void preorderTraversalRecursive() {
	}

	public void preorderTraversalIterative() {
	}

	public void postorderTraversalRecursive() {
	}

	public void postorderTraversalIterative() {
	}

	public void removeRecursive(E data) {
	}

	public int height() {
		return height(root);
	}

	private int height(TreeNode<E> node) {
		if (node == NIL) {
			return 0;
		}
		int lh = height(node.left);
		int rh = height(node.right);

		return (lh > rh ? lh : rh) + 1;
	}

	public void invertTree() {
	}

	public void removeIteratively(E data) {
	}

	public void removeIterativeRED_BLACK(E data) {
	}

	public E minIterative() {
		return null;
	}

	public E maxIterative() {
		return null;
	}

	public E predecessor(E data) {
		return null;
	}

	public void removeAll() {
	}
}

package com.algorithm.tree23;

import com.algorithm.dynamiclist18.doublelinkedlist.Stack;

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
		return minR(root).data;
	}

	private TreeNode<E> minR(TreeNode<E> node) {
		if (node != NIL && node.left != NIL) {
			return minR(node.left);
		}
		return node;
	}

	public E maxRecursive() {
		return maxR(root).data;
	}

	private TreeNode<E> maxR(TreeNode<E> node) {
		if (node != NIL && node.right != NIL) {
			return maxR(node.right);
		}
		return node;
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
		Stack<TreeNode<E>> stack = new Stack<>();
		TreeNode<E> curr = root;
		while (curr != NIL || !stack.isEmpty()) {
			while (curr != NIL) {
				stack.push(curr);
				curr = curr.left;
			}
			curr = stack.pop();
			System.out.print(curr.data + " ");
			curr = curr.right;
		}
		System.out.println();
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
		return minI(root).data;
	}

	private TreeNode<E> minI(TreeNode<E> node) {
		while (node != NIL && node.left != NIL) {
			node = node.left;
		}
		return node;
	}

	public E maxIterative() {
		return maxI(root).data;
	}

	private TreeNode<E> maxI(TreeNode<E> node) {
		while (node != NIL && node.right != NIL) {
			node = node.right;
		}
		return node;
	}

	public E predecessor(E data) {
		return null;
	}

	public void removeAll() {
	}
}

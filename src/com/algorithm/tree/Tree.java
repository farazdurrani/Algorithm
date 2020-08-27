package com.algorithm.tree;

public class Tree<E extends Comparable<E>> {
    private TreeNode<E> root;

    public Tree() {
	root = null;
    }

    public void insert(E data) {
	if (null == root) {
	    root = new TreeNode<>(data);
	} else {
	    root.insert(data);
	}
    }

    public void inorderTraversal() {
	inorderHelper(root);
	System.out.println();
    }

    private void inorderHelper(TreeNode<E> node) {
	if (null == node) {
	    return;
	}
	inorderHelper(node.left);
	System.out.print(node.data + " ");
	inorderHelper(node.right);
    }

    public void preorderTraversal() {
	preorderHelper(root);
	System.out.println();
    }

    private void preorderHelper(TreeNode<E> node) {
	if (null == node) {
	    return;
	}
	System.out.print(node.data + " ");
	preorderHelper(node.left);
	preorderHelper(node.right);
    }

    public void postorderTraversal() {
	postorderHelper(root);
	System.out.println();
    }

    private void postorderHelper(TreeNode<E> node) {
	if (null == node) {
	    return;
	}
	postorderHelper(node.left);
	postorderHelper(node.right);
	System.out.print(node.data + " ");
    }
}

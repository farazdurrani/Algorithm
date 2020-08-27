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

    public boolean find(E data) {
	TreeNode<E> node = find(data, root);
	if (null == node) {
	    System.out.println(data + " not found");
	    return true;
	} else {
	    System.out.println("Found " + data);
	    return false;
	}
    }

    private TreeNode<E> find(E data, TreeNode<E> node) {
	if (node != null) {
	    if (node.data.compareTo(data) == 0) {
		return node;
	    } else if (data.compareTo(node.data) < 0) {
		return find(data, node.left);
	    } else if (data.compareTo(node.data) > 0) {
		return find(data, node.right);
	    }
	}
	return null;
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

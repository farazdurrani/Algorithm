package com.algorithm.tree16;

import com.algorithm.dynamiclist15.Queue;
import com.algorithm.dynamiclist15.Stack;

public class BinarySearchTree<E extends Comparable<E>> {

    private TreeNode<E> root;

    public boolean insert(E data) {
	if (root == null) {
	    root = new TreeNode<>(null, data);
	    return true;
	} else {
	    return root.insert(root, data);
	}
    }

    public TreeNode<E> max() {
	return max(root);
    }

    private TreeNode<E> max(TreeNode<E> node) {
	if (node.right != null) {
	    return max(node.right);
	}
	return node;
    }

    public TreeNode<E> min() {
	return min(root);
    }

    private TreeNode<E> min(TreeNode<E> node) {
	if (node.left != null) {
	    return min(node.left);
	}
	return node;
    }

    public TreeNode<E> successor(TreeNode<E> x) {
	if (x != null && x.right != null) {
	    return min(x.right);
	}
	TreeNode<E> y = x.parent;
	while (y != null && x == y.right) {
	    x = y;
	    y = y.parent;
	}
	return y;
    }
    
    public TreeNode<E> predecessor(TreeNode<E> x) {
	if(x != null && x.left != null) {
	    return max(x.left);
	}
	
	TreeNode<E> y = x.parent;
	while(y != null && x == y.left) {
	    x = y;
	    y = y.parent;
	}
	return y;
    }

    public TreeNode<E> search(E key) {
	return search(root, key);
    }

    private TreeNode<E> search(TreeNode<E> node, E key) {
	if (node == null || (node != null) && node.data.compareTo(key) == 0) {
	    return node;
	} else if (key.compareTo(node.data) < 0) {
	    return search(node.left, key);
	} else {
	    return search(node.right, key);
	}
    }

    public void levelOrderTraversalIterative() {
	int height = height();
	System.out.printf("%4s %4s%n", "P", "C");
	for (int level = 1; level <= height; level++) {
	    printNodeAtGivenLevel(level, root);
	}
	System.out.println();
    }

    private void printNodeAtGivenLevel(int level, TreeNode<E> node) {
	if (node == null) {
	    return;
	}

	if (level == 1) {
	    System.out.printf("%4s %4s%n", node.parent != null ? node.parent.data : null, node.data);
	    return;
	}
	printNodeAtGivenLevel(level - 1, node.left);
	printNodeAtGivenLevel(level - 1, node.right);

    }

    public void levelOrderTraversalQueue() {
    }

    public void inorderTraversalResursive() {
    }

    public TreeNode<E> getRoot() {
	return root;
    }

    public boolean contains(E data) {
	return false;
    }

    public void remove(E data) {
    }

    public int height() {
	return height(root);
    }

    private int height(TreeNode<E> node) {
	if (node == null) {
	    return 0;
	}

	int lh = height(node.left);
	int rh = height(node.right);
	return (lh > rh ? lh : rh) + 1;
    }

    public void invertTree() {
    }

    public void preorderTraversalRecursive() {
    }

    public void preorderTraversalIterative() {
    }

    public void postorderTraversalRecursive() {
    }

    public void postorderTraversalIterative() {
    }

    public void inorderTraversalInterative() {
	Stack<TreeNode<E>> s = new Stack<>();
	TreeNode<E> curr = root;

	while (!s.isEmpty() || null != curr) {
	    while (null != curr) {
		s.push(curr);
		curr = curr.left;
	    }
	    curr = s.pop();
	    System.out.print(curr.data + " ");
	    curr = curr.right;
	}
	System.out.println();
    }

}

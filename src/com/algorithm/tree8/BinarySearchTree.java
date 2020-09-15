package com.algorithm.tree8;

import com.algorithm.dynamiclist9.Queue;

public class BinarySearchTree<E extends Comparable<E>> {
    private TreeNode<E> root;

    public void insert(E data) {
	if (root == null) {
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
	if (node == null) {
	    return;
	}
	inorderHelper(node.left);
	System.out.print(node.data + " ");
	inorderHelper(node.right);
    }

    public boolean find(E data) {
	return find(data, root) != null;
    }

    private TreeNode<E> find(E data, TreeNode<E> node) {
	if (node == null) {
	    return null;
	}
	if (data.compareTo(node.data) < 0) {
	    return find(data, node.left);
	} else if (data.compareTo(node.data) > 0) {
	    return find(data, node.right);
	} else {
	    return node;
	}
    }

    public void remove(E data) {
	root = remove(data, root);
    }

    private TreeNode<E> remove(E data, TreeNode<E> node) {
	if (node == null) {
	    return node;
	}
	if (data.compareTo(node.data) < 0) {
	    node.left = remove(data, node.left);
	} else if (data.compareTo(node.data) > 0) {
	    node.right = remove(data, node.right);
	} else {
	    if (node.left == null && node.right == null) {
		node = null;
	    } else if (node.left == null) {
		node = node.right;
	    } else if (node.right == null) {
		node = node.left;
	    } else {
		TreeNode<E> temp = findMinOnRight(node.right);
		node.data = temp.data;
		node.right = remove(temp.data, node.right);
	    }
	}
	return node;
    }

    private TreeNode<E> findMinOnRight(TreeNode<E> node) {
	while (node.left != null) {
	    node = node.left;
	}
	return node;
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
	return (lh >= rh ? lh : rh) + 1;
    }

    public void levelOrderTraversalInterative() {
	int height = height();
	for (int level = 1; level <= height; level++) {
	    printGivenLevel(root, level);
	}
	System.out.println();
    }

    private void printGivenLevel(TreeNode<E> node, int level) {
	if (node == null) {
	    return;
	}
	if (level == 1) {
	    System.out.print(node.data + " ");
	} else {
	    printGivenLevel(node.left, level - 1);
	    printGivenLevel(node.right, level - 1);
	}

    }

    public void levelOrderTraversalQueue() {
	Queue<TreeNode<E>> q = new Queue<>();
	q.enqueue(root);
	while (!q.isEmpty()) {
	    TreeNode<E> temp = q.dequeue();
	    System.out.print(temp.data + " ");
	    if (temp.left != null) {
		q.enqueue(temp.left);
	    }
	    if (temp.right != null) {
		q.enqueue(temp.right);
	    }
	}
	System.out.println();
    }

    public E getRoot() {
	return root.data;
    }

    public int getSize() {
	System.out.println("Get Size not implemented yet. Returning 0");
	return 0;
    }

    public void invertTree() {
	root = invertTree(root);
    }

    private TreeNode<E> invertTree(TreeNode<E> node) {
	if (node == null) {
	    return null;
	}

	TreeNode<E> left = invertTree(node.left);
	TreeNode<E> right = invertTree(node.right);

	// swap
	node.left = right;
	node.right = left;
	
	return node;
    }
}

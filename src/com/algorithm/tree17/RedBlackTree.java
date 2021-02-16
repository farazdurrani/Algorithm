package com.algorithm.tree17;

import com.algorithm.dynamiclist15.Queue;
import com.algorithm.dynamiclist15.Stack;

public class RedBlackTree<E extends Comparable<E>> {

    private TreeNode<E> root;

    public boolean BSTInsertIterative(E data) {
	TreeNode<E> y = null;
	TreeNode<E> x = root;
	while (x != null) {
	    y = x;
	    if (data.compareTo(x.data) < 0) {
		x = x.left;
	    } else if (data.compareTo(x.data) > 0) {
		x = x.right;
	    } else if (data.compareTo(x.data) == 0) {
		return false;
	    }
	}
	TreeNode<E> node = new TreeNode<>(data);
	node.parent = y;
	if (y == null) {
	    root = node;
	} else if (data.compareTo(y.data) < 0) {
	    y.left = node;
	} else {
	    y.right = node;
	}
	return true;
    }

    public void levelOrderTraversalIterative() {
	int h = height(root);
	System.out.printf("%4s %4s%n", "P", "C");
	for (int level = 1; level <= h; level++) {
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

    private int height(TreeNode<E> node) {
	if (node == null) {
	    return 0;
	}
	int lh = height(node.left);
	int rh = height(node.right);
	return (lh > rh ? lh : rh) + 1;
    }

    public void levelOrderTraversalQueue() {
	Queue<TreeNode<E>> q = new Queue<>();
	if (root != null) {
	    q.enqueue(root);
	}
	while (!q.isEmpty()) {
	    TreeNode<E> node = q.dequeue();
	    System.out.print(node.data + " ");
	    if (node.left != null) {
		q.enqueue(node.left);
	    }
	    if (node.right != null) {
		q.enqueue(node.right);
	    }
	}
	System.out.println();
    }

    public void inorderTraversalResursive() {
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

    public void inorderTraversalInterative() {
	Stack<TreeNode<E>> s = new Stack<>();
	TreeNode<E> node = root;

	while (node != null || !s.isEmpty()) {
	    while (node != null) {
		s.push(node);
		node = node.left;
	    }
	    node = s.pop();
	    System.out.print(node.data + " ");
	    node = node.right;
	}
	System.out.println();
    }

    public void prettyPrint() {
	BTreePrinter.printNode(root);
    }

    /**
     * Assuming x.right is not null Steps: 1) identify y 2) set x's right child to
     * y's left child 2a) if y's left child is not null, update y's left child's
     * parent to x 3) set y's parent to x's parent 4) figure out x place 4a) if x's
     * parent is null, that means x is root. Now root points to y 4b) if x is its
     * parent's left child, make y the parent's left child 4c) if x is its parent's
     * right child, make y the parent's right child 5) make x y's left child 6)
     * update x's parent to y.
     */
    public void leftRotate(E data) {
	TreeNode<E> x = search(data);
	if (x.right != null) {
	    TreeNode<E> y = null;
	    y = x.right;
	    x.right = y.left;
	    if (y.left != null) {
		y.left.parent = x;
	    }
	    y.parent = x.parent;
	    if (x.parent == null) {
		root = y;
	    } else if (x == x.parent.left) {
		x.parent.left = y;
	    } else {
		x.parent.right = y;
	    }
	    y.left = x;
	    x.parent = y;
	} else {
	    System.out.println("Cannot left rotate since right child of " + data + " is null");
	}

    }

    public void rightRotate(E data) {
	TreeNode<E> x = search(data);
	if (x.left != null) {
	    TreeNode<E> y = null;
	    y = x.left;
	    x.left = y.right;
	    if (y.right != null) {
		y.right.parent = x;
	    }
	    y.parent = x.parent;
	    if (x.parent == null) {
		root = y;
	    } else if (x == x.parent.left) {
		x.parent.left = y;
	    } else {
		x.parent.right = y;
	    }
	    y.right = x;
	    x.parent = y;
	} else {
	    System.out.println("Cannot right rotate since left child of " + data + " is null");
	}

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

    public void inorderTraversalReverseResursive() {
	inorderReverseTraversal(root);
	System.out.println();
    }

    private void inorderReverseTraversal(TreeNode<E> node) {
	if (node == null) {
	    return;
	}
	inorderReverseTraversal(node.right);
	System.out.print(node.data + " ");
	inorderReverseTraversal(node.left);
    }

    void leftRotate2(E data) {
	TreeNode<E> x = search(data);
	if (x.right != null) {
	    TreeNode<E> y = x.right;
	    x.right = y.left;
	    if (y.left != null) {
		y.left.parent = x;
	    }
	    y.parent = x.parent;
	    if (x.parent == null) {
		root = y;
	    } else if (x == x.parent.left) {
		x.parent.left = y;
	    } else {
		x.parent.right = y;
	    }
	    y.left = x;
	    x.parent = y;
	} else {
	    System.out.println("Can't really rotate can we?");
	}
    }

}

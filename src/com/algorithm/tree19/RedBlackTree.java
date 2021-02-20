package com.algorithm.tree19;

public class RedBlackTree<E extends Comparable<E>> {
    
    private TreeNode<E> root;
    private TreeNode<E> NIL;
    private Color RED = Color.RED;
    private Color BLACK = Color.BLACK;
    
    public RedBlackTree() {
	this.NIL = new TreeNode<>(null, null);
	this.NIL.color = BLACK;
	this.root = this.NIL;
    }

    private class TreeNode<E extends Comparable<E>> implements Comparable<TreeNode<E>> {
	TreeNode<E> left;
	TreeNode<E> right;
	TreeNode<E> p;
	E data;
	Color color;

	public TreeNode(TreeNode<E> parent, E data) {
	    this.p = parent;
	    this.data = data;
	}

	@Override
	public int compareTo(TreeNode<E> o) {
	    throw new RuntimeException("NOT IMPLEMENTED");
	}

    }

    private enum Color {
	RED, BLACK
    }
}

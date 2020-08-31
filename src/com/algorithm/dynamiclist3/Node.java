package com.algorithm.dynamiclist3;

public class Node<E> {
    E data;
    Node<E> next;

    public Node(E data) {
	this(data, null);
    }

    public Node(E data, Node<E> node) {
	this.data = data;
	this.next = node;
    }

}

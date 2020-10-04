package com.algorithm.dynamiclist10.doublelinkedlist;

public class Node<E> {
    E data;
    Node<E> prev;
    Node<E> next;

    public Node(E data) {
	this.data = data;
    }

}

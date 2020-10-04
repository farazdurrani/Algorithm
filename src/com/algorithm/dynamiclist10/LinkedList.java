package com.algorithm.dynamiclist10;

public class LinkedList<E> {

    private Node<E> first;
    private Node<E> last;

    public void insertAtFront(E data) {
	if (first == null) {
	    first = last = new Node<>(data);
	} else {
	    Node<E> newNode = new Node<>(data);
	    newNode.next = first;
	    first = newNode;
	}
    }
    
    public void insertAtBack(E data) {
	if(first == null) {
	    first = last = new Node<>(data);
	} else {
	    Node<E> newNode = new Node<>(data);
	    last.next = newNode;
	    last = newNode;
	}
    }

    public void print() {
	if (first == null) {

	    return;
	}
	Node<E> node = first;
	while (node != null) {
	    System.out.print(node.data + " ");
	    node = node.next;
	}
	System.out.println();
    }
}

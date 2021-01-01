package com.algorithm.dynamiclist12.doublelinkedlist;

public class DoubleLinkedList<E> {

    private Node<E> first;
    private Node<E> last;
    private String name;

    public DoubleLinkedList() {
	this("Double LinkedList");
    }

    public DoubleLinkedList(String name) {
	this.name = name;
	first = last = null; // symbolic representation
    }

    public void insertAtFront(E data) {
	Node<E> newNode = new Node<>(data);
	if (isEmpty()) {
	    first = last = newNode;
	} else {
	    first.prev = newNode;
	    newNode.next = first;
	    first = newNode;
	}
    }

    private boolean isEmpty() {
	return first == null;
    }

    public void printFromFront() {
	if (isEmpty()) {
	    System.out.println(this.name + " is empty");
	    return;
	}
	Node<E> temp = first;
	while (temp != null) {
	    System.out.print(temp.data + " ");
	    temp = temp.next;
	}
	System.out.println();
    }

    public void printInReverse() {
	if (isEmpty()) {
	    System.out.println(this.name + " is empty");
	    return;
	}
	Node<E> temp = last;
	while (temp != null) {
	    System.out.print(temp.data + " ");
	    temp = temp.prev;
	}
	System.out.println();
    }

    public void insertAtBack(E data) {
	Node<E> newNode = new Node<>(data);
	if (isEmpty()) {
	    first = last = newNode;
	} else {
	    newNode.prev = last;
	    last.next = newNode;
	    last = newNode;
	}
    }

    public E removeFromFront() {
	if(isEmpty()) {
	    System.out.println(this.name + " is empty");
	    return null;
	}
	E data = first.data;
	if(first == last) {
	    first = last = null;
	} else {
	    first = first.next;
	    first.prev = null;
	}
	return data;
    }

    public E removeFromBack() {
	if(isEmpty()) {
	    System.out.println(this.name + " is empty");
	    return null;
	}
	E data = last.data;
	if(first == last) {
	    first = last = null;
	} else {
	    last = last.prev;
	    last.next = null;
	}
	return data;
    }

    class Node<E> {

	Node<E> prev;
	Node<E> next;
	E data;

	public Node(E data) {
	    this.data = data;
	    prev = next = null; // symbolic representation
	}

	@Override
	public String toString() {
	    return "[data=" + data + "]";
	}
	
	

    }

}

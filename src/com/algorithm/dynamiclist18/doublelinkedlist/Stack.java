package com.algorithm.dynamiclist18.doublelinkedlist;

public class Stack<E extends Comparable<E>> {

	private DoubleLinkedList<E> list = new DoubleLinkedList<>();

	public void push(E data) {
		list.insertAtFront(data);
	}

	public E pop() {
		return list.removeFromFront();
	}

	public void print() {
		list.printFromFront();
	}

}

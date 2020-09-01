package com.algorithm.dynamiclist4;

public class Stack<E> {
    private LinkedList<E> list = new LinkedList<>();

    public void push(E data) {
	list.insertAtFront(data);
    }

    public E pop() {
	return list.removeFromFront();
    }

    public void print() {
	list.print();
    }
}

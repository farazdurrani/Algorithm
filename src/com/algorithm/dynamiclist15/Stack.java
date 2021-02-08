package com.algorithm.dynamiclist15;

public class Stack<E extends Comparable<E>> {
    
    private LinkedList<E> list = new LinkedList<>();

    public void push(E data) {
	list.insertAtBack(data);
    }

    public void print() {
	list.print();
    }

    public E pop() {
	return list.removeFromBack();
    }

}

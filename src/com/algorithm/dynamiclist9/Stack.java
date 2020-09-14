package com.algorithm.dynamiclist9;

public class Stack<T> {
    private LinkedList<T> ll = new LinkedList<>();

    public void push(T data) {
	ll.insertAtFront(data);
    }

    public T pop() {
	return ll.removeFromFront();
    }

    public void print() {
	ll.print();
    }
}

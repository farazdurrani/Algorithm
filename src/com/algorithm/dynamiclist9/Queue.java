package com.algorithm.dynamiclist9;

public class Queue<T> {
    private LinkedList<T> ll = new LinkedList<>();

    public void enqueue(T data) {
	ll.insertAtBack(data);
    }

    public T dequeue() {
	return ll.removeFromFront();
    }

    public void print() {
	ll.print();
    }

    public boolean isEmpty() {
	return ll.isEmpty();
    }
}

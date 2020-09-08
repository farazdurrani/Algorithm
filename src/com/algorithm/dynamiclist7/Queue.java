package com.algorithm.dynamiclist7;

public class Queue<E> {
    private LinkedList<E> list = new LinkedList<>();

    public void enqueue(E data) {
	list.insertAtBack(data);
    }

    public E dequeue() {
	return list.removeFromFront();
    }

    public void print() {
	list.print();
    }
}

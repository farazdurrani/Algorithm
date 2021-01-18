package com.algorithm.dynamiclist14;

public class Queue<E extends Comparable<E>> {

    private LinkedList<E> list = new LinkedList<>();
    
    public void enqueue(E data) {
	list.insertAtBack(data);
    }

    public void print() {
	list.print();
    }

    public E dequeue() {
	return list.removeFromFront();
    }

}

package com.algorithm.dynamiclist1;

public class Stack<E> {

    private LinkedList<E> node;

    public Stack() {
	this("stack");
    }

    public Stack(String name) {
	node = new LinkedList<E>(name, null);
    }

    public void push(E data) {
	node.insertAtFront(data);
    }

    public E pull() {
	return node.removeFromFront();
    }
    
    public void print() {
	node.print();
    }
}

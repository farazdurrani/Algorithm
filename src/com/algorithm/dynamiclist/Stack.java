package com.algorithm.dynamiclist;

public class Stack<E> {

    private LinkedList<E> node;

    public Stack() {
	this("stack");
    }

    public Stack(String name) {
	node = new LinkedList<E>(name, null);
    }

    public void push(E data) {
	node.insertAtBack(data);
    }

    public E pull() {
	return node.removeFromBack();
    }
    
    public void print() {
	node.print();
    }
}

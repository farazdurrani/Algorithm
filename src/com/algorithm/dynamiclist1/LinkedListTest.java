package com.algorithm.dynamiclist1;

import com.algorithm.dynamiclist1.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
	LinkedList<Integer> ll = new LinkedList<>("Linked List", null);
	ll.print();
	ll.insertAtFront(2);
	ll.print();
	ll.insertAtFront(1);
	ll.print();
	ll.insertAtBack(5);
	ll.print();
	ll.insertAtBack(6);
	ll.print();
	System.out.println(ll.removeFromFront() + " removed");
	ll.print();
	System.out.println(ll.removeFromFront() + " removed");
	ll.print();
	System.out.println(ll.removeFromBack() + " removed");
	ll.print();
	System.out.println(ll.removeFromBack() + " removed");
	ll.print();
    }
}

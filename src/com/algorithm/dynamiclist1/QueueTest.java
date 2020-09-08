package com.algorithm.dynamiclist1;

public class QueueTest {
    public static void main(String[] args) {
	Queue<Integer> q = new Queue<>("My Queue");
	q.enqueue(1);
	q.print();
	q.enqueue(2);
	q.print();
	System.out.println(q.dequeue() + " de-queued");
	q.print();
	System.out.println(q.dequeue() + " de-queued");
	q.print();
    }

}

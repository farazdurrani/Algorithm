package com.algorithm.heap.priorityqueue;

import java.util.stream.IntStream;
//Notes:
//maintainHeapProperty:
//	This function is called on an element at i that might be violating max-heap property.
//	Meaning, element at A[i] might be smaller than left or right child.

//buildMaxHeap:
//	Build max heap in a bottom up manner by calling maintainHeapProperty. But instead of starting from A.length - 1, 
//	start from mid till the first element. Because children will be traversed by maintainHeapProperty.

//heapSort:
//	first, buildMaxHeap. Now, the largest value is sitting in the first position. 
//	second, start the for loop from the bottom till the 2nd element in the array, 
//		swap the first element with the heapSize, 
//		shrink the heapSize, 
//		call maintainHeapProperty on the first element (because first element might be breaching max-heap-property).

public class PriorityQueueMaxHeapifyHeapSort10 {
    static int heapSize;
//	static int a[] = { 13, -3, -25, 20, -3, -16, -23, 18, 20, -7, 12, -5, -22, 15, -4, 7 };
    static int a[] = { 13, -3, -25, 20, 7, 99, 12 };

    private static void print(int[] a, String msg) {
	System.out.println(msg);
	IntStream.of(a).forEach(x -> System.out.printf("%4d", x));
	System.out.println();
    }

    public static void main(String[] args) {
	heapSize = a.length - 1;
	buildMaxHeap(a, heapSize);
	print(a, "After building max heap");
	heapSort(a, heapSize);
	print(a, "After sorting");
    }

    private static void heapSort(int[] a, int heapSize) {
	buildMaxHeap(a, heapSize);
	for(int i = a.length - 1; i > 0; i--) {
	    swap(a, 0, i);
	    heapSize--;
	    maintainMaxHeap(a, 0, heapSize);
	}
    }

    private static void buildMaxHeap(int[] a, int heapSize) {
	for (int i = a.length / 2; i > -1; i--) {
	    maintainMaxHeap(a, i, heapSize);
	}
    }

    private static void maintainMaxHeap(int[] a, int parent, int heapSize) {
	int leftChild = left(parent);
	int rightChild = right(parent);
	int largest = parent;
	if (leftChild <= heapSize && a[leftChild] > a[largest]) {
	    largest = leftChild;
	}

	if (rightChild <= heapSize && a[rightChild] > a[largest]) {
	    largest = rightChild;
	}

	if (largest != parent) {
	    swap(a, largest, parent);
	    maintainMaxHeap(a, largest, heapSize);
	}

    }

    private static void swap(int[] a, int i, int j) {
	int temp = a[i];
	a[i] = a[j];
	a[j] = temp;
    }

    private static int right(int parent) {
	return (2 * parent) + 2;
    }

    private static int left(int parent) {
	return (2 * parent) + 1;
    }

}
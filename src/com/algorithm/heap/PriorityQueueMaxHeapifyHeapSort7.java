package com.algorithm.heap;

import java.util.stream.IntStream;

//Notes:
//    maintainHeapProperty:
//	This function is called on an element at i that might be violating max-heap property.
//	Meaning, element at A[i] might be smaller than left or right child.

//    buildMaxHeap:
//	Build max heap in a bottom up manner by calling maintainHeapProperty. But instead of starting from A.length - 1, 
//	start from mid till the first element. Because children will be traversed by maintainHeapProperty.

//    heapSort:
//	first, buildMaxHeap. Now, the largest value is sitting in the first position. 
//	second, start the for loop from the bottom till the 2nd element in the array, 
//		swap the first element with the last, 
//		shrink the heapSize, 
//		call maintainHeapProperty on the first element (because first element might be breaching max-heap-property).
public class PriorityQueueMaxHeapifyHeapSort7 {
    static int heapSize;

    public static void main(String[] args) {
//	int A[] = { 13, -3, -25, 20, -3, -16, -23, 18, 20, -7, 12, -5, -22, 15, -4, 7 };
	int A[] = { 13, -3, -25, 20, 7, 99, 12 };
	heapSize = A.length - 1;
	print(A, "Before sort");
	heapSort(A);
	print(A, "After sort");
	heapSize = A.length - 1;
	buildMaxHeap(A);
	print(A, "After building max heapify");
	print(new int[] { max(A) }, "Max Value");
//	print(new int[] { extractMax(A) }, "Extract Max");
//	print(new int[] { extractMax(A) }, "Extract Max");
//	print(new int[] { extractMax(A) }, "Extract Max");
//	print(A, "After extracting max");
//	insert(A, 55);
//	insert(A, 44);
//	insert(A, 32);
//	insert(A, 21);
//	print(A, "After Inserting key");
//	increaseKey(A, 0, 222);
//	increaseKey(A, 1, 99);
//	increaseKey(A, 2, 45);
//	increaseKey(A, 6, 888888);
//	print(A, "After Increasing keys");
//	heapSort(A);
//	print(A, "After Increasing keys");
    }

    private static int max(int[] arr) {
	return arr[0];
    }

    private static void print(int[] A, String msg) {
	System.out.println(msg);
	IntStream.of(A).forEach(x -> System.out.printf("%4d", x));
	System.out.println();
    }

    private static void heapSort(int[] arr) {
	buildMaxHeap(arr);
	print(arr, "After Building Heap");
	for (int i = arr.length - 1; i > 0; i--) { // leave 0th as it as the largest value resides there after building
						   // max heap.
	    swap(arr, 0, i);
	    heapSize--;
	    maintainMaxHeapProperty(arr, 0); // because an element at 0 might be breaking max-heap-property
	}
    }

    private static void maintainMaxHeapProperty(int[] arr, int parent) {
	int leftChild = left(parent);
	int rightChild = right(parent);
	int largest = parent; // assume
	if (leftChild <= heapSize && arr[leftChild] > arr[largest]) {
	    largest = leftChild;
	}
	if (rightChild <= heapSize && arr[rightChild] > arr[largest]) {
	    largest = rightChild;
	}
	if (parent != largest) {
	    swap(arr, largest, parent);
	    maintainMaxHeapProperty(arr, largest);
	}

    }

    private static void swap(int[] arr, int first, int second) {
	int temp = arr[first];
	arr[first] = arr[second];
	arr[second] = temp;

    }

    private static void buildMaxHeap(int[] arr) {
	for (int i = arr.length / 2; i > -1; i--) {
	    maintainMaxHeapProperty(arr, i);
	}
    }

    static int left(int i) {
	return (2 * i) + 1;
    }

    static int right(int i) {
	return (2 * i) + 2;
    }

    static int parent(int i) {
	return (i - 1) / 2;
    }
}

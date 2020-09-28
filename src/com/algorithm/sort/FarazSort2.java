package com.algorithm.sort;

import java.util.Arrays;

public class FarazSort2 {
    public static void main(String[] args) {

	int arr[] = { 13, -3, -25, 20, -3, -16, -23, 18, 20, -7, 12, -5, -22, 15, -4, 7 };
	Arrays.stream(arr).forEach(x -> System.out.print(x + " "));
	System.out.println();
	int comp = 0;
	int heapSize = arr.length - 1;
	for (int i = 0; i < heapSize; i++, heapSize--) {
	    comp++;
	    int[] minMaxIndex = findMinMaxIndex(arr, i, heapSize);
	    swap(arr, i, minMaxIndex[0]);
	    swap(arr, heapSize, minMaxIndex[1]);
	}

	Arrays.stream(arr).forEach(x -> System.out.printf("%4d", x));
	System.out.println();
	
	System.out.println("Number of comparisons: " + comp);

    }

    private static void swap(int[] arr, int a, int b) {
	int temp = arr[a];
	arr[a] = arr[b];
	arr[b] = temp;
    }

    private static int[] findMinMaxIndex(int[] a, int j, int heapSize) {
	int max = Integer.MIN_VALUE;
	int maxIndex = 0;
	int min = Integer.MAX_VALUE;
	int minIndex = 0;
	for (int i = j; i <= heapSize; i++) {
	    if (a[i] >= max) {
		max = a[i];
		maxIndex = i;
	    }
	    if (min >= a[i]) {
		min = a[i];
		minIndex = i;
	    }
	}
	return new int[] { minIndex, maxIndex };
    }
}

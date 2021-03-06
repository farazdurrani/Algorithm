package com.algorithm.sort.merge;

import java.util.stream.IntStream;

public class MergeSort4 {
    public static void main(String[] args) {
	int arr[] = { 13, -3, -25, 20, -3, -16, -23, 18, 20, -7, 12, -5, -22, 15, -4, 7 };
	int low = 0;
	int high = arr.length - 1;
	mergeSort(arr, low, high);
	IntStream.of(arr).forEach(x -> System.err.print(x + ", "));
    }

    private static void mergeSort(int[] arr, int low, int high) {
	if(low < high) {
	    int mid = (low + high) / 2;
	    mergeSort(arr, low, mid);
	    mergeSort(arr, mid + 1, high);
	    merge(arr, low, mid, high);
	}
    }

    private static void merge(int[] arr, int low, int mid, int high) {
	int n1 = mid + 1 - low;
	int n2 = high - mid;
	int left[] = new int[n1];
	int right[] = new int [n2];
	for(int i = 0; i < n1; i++) {
	    left[i] = arr[low + i];
	}
	for(int j = 0; j < n2; j++) {
	    right[j] = arr[mid + 1 + j];
	}
	
	int i = 0;
	int j = 0;
	int k = low;
	while(i < n1 && j < n2) {
	    if( left[i] <= right[j]) {
		arr[k] = left[i];
		i++;
	    } else {
		arr[k] = right[j];
		j++;
	    }
	    k++;
	}
	while(i < n1) {
	    arr[k] = left[i];
	    i++;
	    k++;
	}
	while(j < n2) {
	    arr[k] = right[j];
	    j++;
	    k++;
	}
	
    }
}

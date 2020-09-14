package com.algorithm.sort;

import java.util.Arrays;

public class QuickSort5 {
    public static void main(String[] args) {
	int a[] = { 13, -3, -25, 20, -3, -16, -23, 18, 20, -7, 12, -5, -22, 15, -4, 7 };
	Arrays.stream(a).forEach(x -> System.out.printf("%4d", x));
	System.out.println();
	qs(a, 0, a.length - 1);
	Arrays.stream(a).forEach(x -> System.out.printf("%4d", x));
	System.out.println();
    }

    private static void qs(int[] a, int start, int end) {
	if (start < end) {
	    int p = p(a, start, end);
	    qs(a, start, p - 1);
	    qs(a, p + 1, end);
	}
    }

    private static int p(int[] a, int start, int end) {
	int i = start - 1;
	for (int j = start; j < end; j++) {
	    if (a[j] <= a[end]) {
		i++;
		swap(a, i, j);
	    }
	}
	swap(a, i + 1, end);
	return i + 1;
    }

    private static void swap(int[] a, int i, int j) {
	int temp = a[i];
	a[i] = a[j];
	a[j] = temp;
    }
}

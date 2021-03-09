package com.algorithm.dynamic.programming.cutrod;

public class CutRod2 {

    public static void main(String[] args) {
	int[] p = { 0, 1, 5, 8, 9, 10, 17, 17, 20, 23, 30 };
	int n = 4;
	System.out.println(cutRod(p, n));
	// dynamic programming
	// top down approach
	System.out.println(memoizedCutRod(p, n));
	// bottom up approach
	System.out.println(bottomUpCutRod(p, n));

	printCutRodSolution(p, n);
	n = 10;
	printCutRodSolution(p, n);
	n = 7;
	printCutRodSolution(p, n);

    }

    private static void printCutRodSolution(int[] p, int i) {
    }

    private static int bottomUpCutRod(int[] p, int n) {
	return -1;
    }

    private static int memoizedCutRod(int[] p, int n) {
	return -1;
    }

    private static int cutRod(int[] p, int n) {
	return -1;
    }

}

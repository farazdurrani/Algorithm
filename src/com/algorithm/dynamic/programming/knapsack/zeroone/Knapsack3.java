package com.algorithm.dynamic.programming.knapsack.zeroone;

/**
 * Get the pseudo-code from https://en.wikipedia.org/wiki/Knapsack_problem#0-1_knapsack_problem
 * Got the understanding of 'i' and 'j' and why we are doing '(j - w[i]) + v[i]' from:
 * https://medium.com/@fabianterh/how-to-solve-the-knapsack-problem-with-dynamic-programming-eb88c706d3cf
 * 
 * @author faraz
 *
 */
public class Knapsack3 {
	public static void main(String[] args) {
		int[] w = { 24, 10, 10, 7 };
		int[] v = { 24, 18, 18, 10 };
		int W = 25;
		//ans 36
//		int[] w = { 10, 40, 20 };
//		int[] v = { 100, 280, 120 };
//		int W = 60;
		//ans 400

		int n = w.length; // number of items

		int max = knapsackDynamic(w, v, n, W);
		System.out.println("Maximum Profit: " + max);
	}

	private static int knapsackDynamic(int[] w, int[] v, int n, int W) {
		return -1;
	}
}

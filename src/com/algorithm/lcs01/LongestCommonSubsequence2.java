package com.algorithm.lcs01;

/**
 * In-order, non-consecutive Longest Common Subsequence
 * 
 * @author Faraz
 *
 */
public class LongestCommonSubsequence2 {

	private static final String NORTHWEST_ARROW = "\u2196";

	private static final String NORTH_ARROW = "\u2191";

	private static final String WEST_ARROW = "\u2190";

	public static void main(String[] args) {
		char[] X = { 'A', 'B', 'C', 'B', 'D', 'A', 'B' };
		char[] Y = { 'B', 'D', 'C', 'A', 'B', 'A' };

		int length = LCS_LENGTH_BF(X, Y, X.length - 1, Y.length - 1);
		System.out.println("Brute-Force Longest Common Subsequence (non-consecutive) " + length);

		LCS_DYNAMICPROGRAMMING(X, Y);

	}

	private static void LCS_DYNAMICPROGRAMMING(char[] X, char[] Y) {

	}

	private static void PRINT_LCS(String[][] b, char[] x, int i, int j) {
	}

	private static int LCS_LENGTH_BF(char[] X, char[] Y, int i, int j) {
		if (i == -1 || j == -1) {
			return 0;
		} else if (X[i] == Y[j]) {
			return 1 + LCS_LENGTH_BF(X, Y, i - 1, j - 1);
		} else {
			return Math.max(LCS_LENGTH_BF(X, Y, i - 1, j), LCS_LENGTH_BF(X, Y, i, j - 1));
		}
	}
}

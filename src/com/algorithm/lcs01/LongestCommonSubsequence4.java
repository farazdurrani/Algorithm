package com.algorithm.lcs01;

import java.time.Instant;

/**
 * In-order, non-consecutive Longest Common Subsequence
 * 
 * @author Faraz
 *
 */
public class LongestCommonSubsequence4 {

	private static final String NORTHWEST_ARROW = "\u2196";

	private static final String NORTH_ARROW = "\u2191";

	private static final String WEST_ARROW = "\u2190";

	public static void main(String[] args) {
		String s1 = "ACCGGTCGAGTGCGCGGAAGCCGGCCGAA";
		String s2 = "GTCGTTCGGAATGCCGTTGCTCTGTAAA";
//		char[] x = { 'A', 'B', 'C', 'B', 'D', 'A', 'B' };
//		char[] y = { 'B', 'D', 'C', 'A', 'B', 'A' };
		char[] x = s1.toCharArray();
		char[] y = s2.toCharArray();

		Instant start = Instant.now();
		System.out.println("Starting brute-force " + start);
		int length = LCS_LENGTH_BF(x, y, x.length - 1, y.length - 1);
		Instant end = Instant.now();
		System.out.println("End of Brute-Force Approach " + end);
		System.out.println("Brute-Force Longest Common Subsequence (non-consecutive) " + length);

		LCS_DYNAMICPROGRAMMING(x, y);

	}

	private static void LCS_DYNAMICPROGRAMMING(char[] x, char[] y) {

		System.out.println("Dynamic Longest Common Subsequence (non-consecutive)  " + c[x.length][y.length]);
		int p = b[0].length;
		int k = b[1].length;
		for (int i = 0; i <= p; i++) {
			for (int j = 0; j < k; j++) {
				if (b[i][j] != null) {
					System.out.print(b[i][j] + c[i][j] + "      ");
				} else {
					System.out.print(" " + c[i][j] + "      ");
				}
			}
			System.out.println("\n");
		}
		PRINT_LCS(b, x, x.length, y.length);
	}

	private static void PRINT_LCS(String[][] b, char[] x, int i, int j) {

	}

	private static int LCS_LENGTH_BF(char[] x, char[] y, int i, int j) {

	}
}

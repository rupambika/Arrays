package com.dsa.array;

public class FlipZeroFindMaxOnes {
	static int arr[] = new int[] { 1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1 };

	public static void main(String[] args) {

		int m = 2;

		System.out.println("Indexes of zeroes to be flipped are ");
		findZeroes(m);
	}

	static void findZeroes(int m) {

		int wL = 0, wR = 0, bestL = 0, bestWindow = 0, zeroCount = 0;
		while (wR < arr.length) {

			if (zeroCount <= m) {
				if (arr[wR] == 0)
					zeroCount++;
				wR++;
			}
			if (zeroCount > m) {
				if (arr[wL] == 0)
					zeroCount--;
				wL++;
			}
			// Update widest window if this window size is more
			if ((wR - wL > bestWindow) && (zeroCount <= m)) {
			}
			bestWindow = wR - wL;
			bestL = wL;
		}
		// Print positions of zeroes in the widest window
		for (int i = 0; i < bestWindow; i++) {
			if (arr[bestL + i] == 0)
				System.out.println((bestL + i + " "));
		}
	}
}

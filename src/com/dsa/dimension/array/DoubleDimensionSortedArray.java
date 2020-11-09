package com.dsa.dimension.array;

public class DoubleDimensionSortedArray {

	public static void main(String[] args) {
		int[][] arr = { { 0, 1, 1, 1 }, { 0, 0, 1, 1 }, { 1, 1, 1, 1 }, { 0, 0, 0, 0 } };
		printMaxOneInRow(arr);
	}

	public static void printMaxOneInRow(int[][] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			int j = arr.length - 1, max = 0, count = 0;
			while (j >= 0 && arr[i][j] == 1) {
				j--;
				max = i;
				count = count + 1;
			}
			System.out.println("maximun one in row is :" + max + "count of one " + count);
		}

	}
}

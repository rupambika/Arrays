package com.dsa.array;

import java.util.Arrays;

public class FindTwoEleWithExpectedSum {
	static int arr[] = { 1, 4, 2, 3, 5 };
	static int expected = 7;

	public static void main(String[] args) {
		findTwoElementsMatchesGivenSum(arr);
	}

	public static void findTwoElementsMatchesGivenSum(int arr[]) {
		Arrays.sort(arr); // {1,2,3,4,5}
		int first = 0, last = arr.length - 1;
		while (first < last) {
			if (arr[first] + arr[last] == expected) {
				System.out.println(arr[first] + " , " + arr[last]);
				break;
			}

			if (arr[first] + arr[last] > expected) {
				last--;
			}
			if (arr[first] + arr[last] < expected) {
				first++;
			}
		}

	}
}

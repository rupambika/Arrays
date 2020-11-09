package com.dsa.array;

public class RotateArray {

	static int arr[] = { 3, 2, 1, 0, 3 };
	static int k = 2;

	public static int[] rotate(int arr[], int k, int n) {

		// 1st rotate the array from 0 to k th position
		// 2nd rotate the array from k+1 th position to n
		// 3rd rotate the full array

		for (int i = 0; i < k; i++) {

			leftRotateOneByone(arr, n);
		}

		return arr;

	}

	public static void leftRotateOneByone(int[] arr, int n) {
		int temp = arr[0];
		int i;
		for (i = 0; i < n - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[i] = temp;
	}

	public static void main(String[] args) {
		rotate(arr, k, arr.length);

		for (int i = 0; i < arr.length ; i++) {
			System.out.println(arr[i]);
		}
	}

}

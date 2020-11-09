package com.dsa.array;

public class DuplicateElement {

	public static void main(String[] args) {

		// this example will work especially when the array contains elements/numbers
		// which is less that the length of an array. i.e to play with the index . in this example the array
		// length is 10, so higher element in the array you can expect is could be 9. number of elements
		// doesnt matter.
		int arr[] = { 1, 2, 2, 5, 3, 9, 4, 7 , 4, 9 };
		System.out.println("Duplicate elements are :");
		printRepeating(arr, arr.length);

	}

	// it can be any number and can be multiple duplicates
	public static void printRepeating(int[] arr, int size) {
		for (int i = 0; i < size; i++) {
			if (arr[Math.abs(arr[i])] > 0) {
				arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
			} else
				System.out.println(Math.abs(arr[i]) + " ");
		}
	}
}

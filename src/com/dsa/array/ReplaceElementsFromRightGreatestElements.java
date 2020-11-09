package com.dsa.array;

public class ReplaceElementsFromRightGreatestElements {

	public static void main(String[] args) {
		// int arr[] = { 4, 5, 2, 1, 7, 6 };
		// O/P = {7 7 7 7 6 -1}
		int arr[] = { 16, 17, 4, 3, 5, 2 };
		// O/P = {17 5 5 5 2 -1}
		int n = arr.length;
		// Replace the elements with the smaller element on its left side
		replaceElements(arr, n);

		// Print the modified array
		for (int i = 0; i < n; ++i)
			System.out.println(arr[i]);
	}

	public static void replaceElements(int[] arr, int n) {
		int max = arr[n - 1];
		arr[n - 1] = -1;
		for (int i = n - 2; i >= 0; i--) {
			// Store the current element (needed later for
			// updating the next greatest element)
			int temp = arr[i];

			// Replace current element with the next greatest
			arr[i] = max;

			// Update the greatest element, if needed
			if (max < temp)
				max = temp;

		}

	}
}

package com.dsa.array;

public class ReplaceElementsFromLeftGreatestElements {

	public static void main(String[] args) {
		int arr[] = { 4, 5, 2, 1, 7, 6 };
		// O/P = {-1 4 5 5 5 7}
		int n = arr.length;
		// Replace the elements with the smaller element on its left side
		replaceElements(arr, n);

		// Print the modified array
		for (int i = 0; i < n; ++i)
			System.out.println(arr[i]);
	}

	public static void replaceElements(int[] arr, int n) {
		int max = arr[0];
		arr[0] = -1;
		for (int i = 1; i < n; i++) {
			
			//one solution
			/*if (max > arr[i]) {
				arr[i] = max;
			} else if (max <= arr[i]) {
				int temp = arr[i];
				arr[i] = max;
				max = temp;
			}
*/
			//2nd solution
			int temp = arr[i];
			// Replace current element with the next greatest
			arr[i] = max;

			// Update the greatest element, if needed
			if (max < temp)
				max = temp;
		}

	}
	// Algorithm
	// Since, 4 has no element in its left, so replace it by -1.
	// For 5, 4 is the greatest element in its left.
	// For 2, 5 is the greatest element in its left.
	// For 1, 5 is the greatest element in its left.
	// For 7, 5 is the greatest element in its left.
	// For 6, 7 is the greatest element in its left.
}

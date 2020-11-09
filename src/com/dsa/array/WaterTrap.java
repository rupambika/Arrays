package com.dsa.array;

public class WaterTrap {

	public static void main(String[] args) {
		int arr[] = { 3, 0, 2, 1 };
		// int arr[] = { 3, 0, 0, 2, 0, 4 }; // O/P =10
		// int arr[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 }; //O/P =6
		//sgetMaxWater(arr);
		getMaxWaterAnoterApp(arr);
	}

	public static void getMaxWater(int arr[]) {
		// find max of left and max of right for the i'th element
		int lenght = arr.length;
		int water = 0;
		for (int i = 0; i < lenght - 1; i++) {
			// Find the maximum element on its left
			int left = arr[i];
			for (int j = 0; j < i; j++) {
				left = Math.max(left, arr[j]);
			}
			// Find the maximum element on its right
			int right = arr[i];
			for (int j = i + 1; j < lenght; j++) {
				right = Math.max(right, arr[j]);
			}
			// Update the maximum water
			water = water + (Math.min(left, right) - arr[i]);
		}
		System.out.println("total number of water in getMaxWater is : " + water);
	}

	public static void getMaxWaterAnoterApp(int arr[]) {

		// take two arrays (leftArr and rightArr). Fill the arrays with the highest bar
		// of the i'th element on leftArr and rightArr respectively including i'th
		// element;
		int length = arr.length;
		int water = 0;
		int[] left = new int[length];
		int[] right = new int[length];

		// // Fill left array
		left[0] = arr[0];
		for (int i = 1; i < length; i++) {
			left[i] = Math.max(arr[i - 1], arr[i]);

		}
		//print("left", left);
		// // Fill right array
		right[length - 1] = arr[length - 1];
		for (int i = length - 2; i >= 0; i--) {
			right[i] = Math.max(arr[length - 2], arr[i]);
		}
		//print("rigt", right);
		// compare the two array and find the min out of it and minus it for the i'th
		// array
		for (int i = 0; i < length; i++) {
			water = water + (Math.min(left[i], right[i]) - arr[i]);
		}
		System.out.println("total number of water in getMaxWaterAnoterApp is :" + water);
	}

	public static void print(String str, int arr[]) {
		for (int i = 0; i < arr.length - 1; i++) {
			System.out.println(str + arr[i]);

		}
	}
}

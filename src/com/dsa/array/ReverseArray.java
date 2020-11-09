package com.dsa.array;

public class ReverseArray {
	static int arr[] = { 1, 2, 3, 4, 5 };

	public static void main(String[] args) {
		reverseArr(arr);
	}

	public static void reverseArr(int arr[]) {

		int temp = 0;
		int start = 0, end = arr.length - 1;
		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		for (int i = 0; i < arr.length ; i++) {
			System.out.println(arr[i]);
		}
	}
}

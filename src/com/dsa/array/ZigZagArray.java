package com.dsa.array;

public class ZigZagArray {

	public static void main(String[] args) {
		int arr[] = { 4, 3, 7, 8, 6, 2, 1 }; // O/P : 3 7 4 8 2 6 1
		zigzag(arr);
		print(arr);

	}

	public static void zigzag(int arr[]) {

		boolean flag = true; // a<b
		int temp = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (flag) {
				if (arr[i] > arr[i + 1]) {

					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			} else {
				if (arr[i] < arr[i + 1]) {
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
			flag = !flag;
		}

	}

	public static void print(int arr[]) {
		for (int i = 0; i < arr.length; ++i)
			System.out.println(arr[i]);
	}
}

package com.dsa.array;

public class RemoveMultipleOccurrence {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 2, 5, 5, 5, 4, 4, 4, 4, 4, 6, 6 }; // O\P = {1,2,5,4,6}
		removeMulti(arr);
	}

	public static void removeMulti(int arr[]) {
		int arr2[] = new int[arr.length];
		int j = 0;
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i] != arr[i + 1]) {
				arr2[j] = arr[i];
				j++;
			}
		}
		arr2[j]= arr[arr.length-1];
		for (int a : arr2) {
			System.out.println(a + "\n");
		}
	}
}

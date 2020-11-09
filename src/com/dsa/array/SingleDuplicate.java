package com.dsa.array;

public class SingleDuplicate {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 5, 5, 3, 4, 6 };
		singleDup(arr);
	}

	public static void singleDup(int[] arr) {

		// find the last number in an array.
		// find the total sum of the largest number
		// find the sum of the numbers in an given array
		// subtract total sum- sum of array = this will give you extra or duplicate
		// number in an array

		int lastNum = arr.length - 1;
		int totalSum = (lastNum * (lastNum + 1)) / 2;
		System.out.println(" totalSum is " + totalSum);
		int arraySum = 0;
		for (int i = 0; i <= arr.length - 1; i++) {
			arraySum = arraySum + arr[i];
		}
		System.out.println(" arraySum is " + arraySum);
		int duplicateNum = arraySum - totalSum;
		System.out.println("Duplicate number is " + duplicateNum);
	}
}

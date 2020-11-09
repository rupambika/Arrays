package com.dsa.array;

public class MissingElement {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 5, 6, 7, 8, 9 };
		getMissingNum(arr);
	}
	public static void getMissingNum(int[] arr) {
		// the size of the array + 1 wil give you the value of the max number in an
		// given array as one number is missing . This will only work if the array is in order of 1 to n. 
		int largestNum = arr.length + 1; // 9
		int totalSum = (largestNum*(largestNum + 1))/2;
		int arraySum = 0;
		for(int i=0; i < arr.length; i++) {
			arraySum = arraySum + arr[i];
		}
		int missingNum =  totalSum - arraySum;
	    System.out.println("Missing numebr is " + missingNum);
	}
	
	
	/*public static void getMissingNum(int[] arr) {

		int lastNu = arr.length + 1;
		int temp = arr[0];
		for (int i = 1; i < arr.length - 1; i++) {
			temp = temp ^ arr[i];
		}

		int temp2 = 1;
		for (int j = 2; j < lastNu; j++) {
			temp2 = temp2 ^ j;
		}
		System.out.println(temp ^ temp2);
}*/

	

}

package com.java.implementations.algorithms.sorting;

import java.util.Scanner;

public class CountingSort {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Enter the size of array:");
			int arraySize = scanner.nextInt();
			System.out.println("Enter the maximum number in array:");
			int max = scanner.nextInt();
			int array[] = new int[arraySize];
			System.out.println("Enter array elements to sort");
			for (int i = 0; i < arraySize; i++) {
				array[i] = scanner.nextInt();
			}
			performSorting(array, max);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			scanner.close();
		}
	}

	public static void performSorting(int array[], int max) {
		int countArray[] = new int[max];
		for (int i = 0; i < array.length; i++) {
			// System.out.println("value : "+countArray[i] + 1);
			countArray[array[i]] = countArray[array[i]] + 1;
		}
		for (int i = 1; i < max; i++) {
			countArray[i] = countArray[i - 1] + countArray[i];
		}
		int sortedArray[] = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			sortedArray[countArray[array[i]] - 1] = array[i];
			countArray[array[i]] = countArray[array[i]] - 1;
		}
		System.out.println("Array after sorting");
		for (int i = 0; i < sortedArray.length; i++) {
			System.out.print(sortedArray[i] + " ");
		}
	}

}

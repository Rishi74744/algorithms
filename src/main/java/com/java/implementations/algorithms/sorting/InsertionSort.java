package com.java.implementations.algorithms.sorting;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Enter the size of array:");
			int arraySize = scanner.nextInt();
			int array[] = new int[arraySize];
			System.out.println("Enter array elements to sort");
			for (int i = 0; i < arraySize; i++) {
				array[i] = scanner.nextInt();
			}
			performSorting(array);
			for (int i = 0; i < arraySize; i++) {
				System.out.print(array[i] + " ");
			}
		} catch (Exception e) {
			System.err.println(e);
		} finally {
			scanner.close();
		}
	}

	public static void performSorting(int array[]) {
		for (int i = 1; i < array.length; i++) {
			for (int j = i; j > 0; j--) {
				if (array[j - 1] > array[j]) {
					int temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
				}
			}
		}
	}

}

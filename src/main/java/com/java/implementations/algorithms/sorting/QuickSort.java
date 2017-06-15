package com.java.implementations.algorithms.sorting;

import java.util.Scanner;

public class QuickSort {

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
			quickSort(array, 0, arraySize - 1);
			System.out.println("Array after sorting");
			for (int i = 0; i < array.length; i++) {
				System.out.print(array[i] + " ");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			scanner.close();
		}
	}

	public static void quickSort(int array[], int start, int end) {
		if (start < end) {
			int partition = partition(array, start, end);
			quickSort(array, start, partition - 1);
			quickSort(array, partition + 1, end);
		}
	}

	public static int partition(int array[], int start, int end) {
		int pivot = array[end];
		int i = start - 1;
		for (int j = start; j <= end - 1; j++) {
			if (array[j] <= pivot) {
				i++;
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		int temp = array[i + 1];
		array[i + 1] = array[end];
		array[end] = temp;
		return i;
	}

}

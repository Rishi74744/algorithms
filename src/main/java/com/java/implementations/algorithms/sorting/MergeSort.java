package com.java.implementations.algorithms.sorting;

import java.util.Scanner;

public class MergeSort {

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
			mergeSort(array, 0, arraySize - 1);
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

	public static void mergeSort(int array[], int start, int end) {
		if (start < end) {
			int mid = (start + end) / 2;
			mergeSort(array, start, mid);
			mergeSort(array, mid + 1, end);
			merge(array, start, mid, end);
		}
	}

	public static void merge(int array[], int start, int mid, int end) {
		int leftSubArraySize = mid - start + 1;
		int rightSubArraySize = end - mid;
		int leftSubArray[] = new int[leftSubArraySize];
		int rightSubArray[] = new int[rightSubArraySize];
		for (int i = 0; i < leftSubArraySize; ++i) {
			leftSubArray[i] = array[start + i];
		}
		for (int j = 0; j < rightSubArraySize; ++j) {
			rightSubArray[j] = array[mid + 1 + j];
		}
		int i = 0, j = 0;
		int k = start;
		while (i < leftSubArraySize && j < rightSubArraySize) {
			if (leftSubArray[i] <= rightSubArray[j]) {
				array[k++] = leftSubArray[i++];
			} else {
				array[k++] = rightSubArray[j++];
			}
		}
		while (i < leftSubArraySize) {
			array[k++] = leftSubArray[i++];
		}
		while (j < rightSubArraySize) {
			array[k++] = rightSubArray[j++];
		}
	}

}

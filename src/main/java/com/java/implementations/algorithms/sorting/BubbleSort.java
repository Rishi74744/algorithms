package com.java.implementations.algorithms.sorting;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			int arraySize = scanner.nextInt();
			int array[] = new int[arraySize];
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
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}

}

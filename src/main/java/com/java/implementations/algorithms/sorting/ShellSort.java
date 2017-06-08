package com.java.implementations.algorithms.sorting;

import java.util.Scanner;

public class ShellSort {

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
		for (int shifts = array.length / 2; shifts > 0; shifts /= 2) {
			for (int i = shifts; i < array.length; i++) {
				int temp = array[i];
				int j = 0;
				for (j = i; j >= shifts && array[j - shifts] > temp; j -= shifts) {
					array[j] = array[j - shifts];
				}
				array[j] = temp;
			}
		}
	}

}

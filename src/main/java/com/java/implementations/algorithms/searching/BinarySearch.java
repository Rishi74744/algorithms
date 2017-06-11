package com.java.implementations.algorithms.searching;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Enter total elements: ");
			int totalElements = scanner.nextInt();
			int array[] = new int[totalElements];
			System.out.println("Enter array elements in sorted order: ");
			for (int i = 0; i < totalElements; i++) {
				array[i] = scanner.nextInt();
			}
			System.out.println("Enter element to search: ");
			int element = scanner.nextInt();
			int index = binarySearch(0, totalElements - 1, element, array);
			if (index == -1) {
				System.out.println("Element not found!");
			} else {
				System.out.println("Element found at index : " + (index + 1));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			scanner.close();
		}
	}

	private static int binarySearch(int start, int end, int element, int array[]) {
		if (start == end) {
			if (array[start] == element) {
				return start;
			} else {
				return -1;
			}
		} else {
			int mid = (start + end) / 2;
			if (array[mid] == element) {
				return mid;
			} else if (array[mid] > element) {
				return binarySearch(start, mid - 1, element, array);
			} else if (array[mid] < element) {
				return binarySearch(mid + 1, end, element, array);
			}
		}
		return -1;
	}

}

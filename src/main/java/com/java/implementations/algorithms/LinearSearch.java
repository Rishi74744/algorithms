package com.java.implementations.algorithms;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter total elements: ");
		int totalElements = scanner.nextInt();
		int array[] = new int[totalElements];
		System.out.println("Enter array elements: ");
		for (int i = 0; i < totalElements; i++) {
			array[i] = scanner.nextInt();
		}
		System.out.println("Enter element to search: ");
		int element = scanner.nextInt();
		int index = -1;
		for (int i = 0; i < totalElements; i++) {
			if (array[i] == element) {
				index = i + 1;
				break;
			}
		}
		if (index == -1) {
			System.out.println("Element not found!");
		} else {
			System.out.println("Element found at index : " + index);
		}
	}

}

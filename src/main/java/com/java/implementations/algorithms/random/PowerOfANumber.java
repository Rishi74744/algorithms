package com.java.implementations.algorithms.random;

import java.util.Scanner;

/**
 * Find power of a number in O(logn)
 */
public class PowerOfANumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Enter the number:");
			int x = scanner.nextInt();
			System.out.println("Enter the power:");
			int n = scanner.nextInt();
			int pow = power(x, n);
			System.out.println("The power the number is : " + pow);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			scanner.close();
		}
	}

	public static int power(int x, int n) {
		int y = 0;
		if (n == 0) {
			return 1;
		}
		y = power(x, n / 2);
		if (n % 2 == 0) {
			return y * y;
		} else {
			return x * y * y;
		}
	}

}

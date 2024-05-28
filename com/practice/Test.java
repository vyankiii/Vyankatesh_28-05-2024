package com.practice;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the array size: ");
		int size = sc.nextInt();

		int[] single = new int[size];

		System.out.println("Enter value:");
		for (int i = 0; i < size; i++) {
			{

				single[i] = sc.nextInt();
			}
		}

		System.out.println("One Dimensional array values Are:");
		for (int i = 0; i < size; i++) {

			System.out.print(single[i] + "\t ");
		}
	}
}

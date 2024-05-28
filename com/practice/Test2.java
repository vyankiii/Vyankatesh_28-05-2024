package com.practice;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter rows");
		int row = sc.nextInt();

		System.out.println("Enter column");
		int column = sc.nextInt();

		int[][] matrix = new int[row][column];

		System.out.println("Enter value:");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {

				matrix[i][j] = sc.nextInt();
			}
		}

		System.out.println("Two Dimensional Arrays values are:");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(matrix[i][j] + "\t ");
			}
			System.out.println("\n \n");
		}
	}

}

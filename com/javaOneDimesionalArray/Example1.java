package com.javaOneDimesionalArray;

public class Example1 {

	public static void main(String[] args) {

		// array object creation
		int studentMarks[] = new int[6];

		// intializaed value to an array object
		studentMarks[0] = 56;
		studentMarks[1] = 64;
		studentMarks[2] = 49;
		studentMarks[3] = 78;
		studentMarks[4] = 45;
		studentMarks[5] = 36;

		// iterate the array values
		for (int i = 0; i < studentMarks.length; i++) {
			System.out.println(studentMarks[i]);
		}
		System.out.println("----------------------------------");
		for( int number : studentMarks) {
			System.out.println(number);
		}

	}

}

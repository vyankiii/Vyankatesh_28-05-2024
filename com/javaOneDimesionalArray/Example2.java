package com.javaOneDimesionalArray;

public class Example2 {
	public static void main(String[] args) {

		String studentNames[] = new String[4];

		studentNames[0] = "Vyanki";
		studentNames[1] = "Radha";
		studentNames[2] = "Pratiksha";
		studentNames[3] = "Maithili";

		// enhanced for loop
		for (String name : studentNames) {
			System.out.println(name);
		}

	}
}

package com.rays.javabasics;

public class MethodCalling {

	public static void main(String[] args) {

		printAll(args);

		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);

		sum(a, b);

		mult(a, b);

	}

	private static void mult(int a, int b) {

		int c = a * b;

		System.out.println("Mult = " + c);

	}

	private static void sum(int a, int b) {

		int c = a + b;

		System.out.println("Sum = " + c);

	}

	private static void printAll(String[] args) {

		for (int i = 0; i < args.length; i++) {

			System.out.println("Hello..." + args[i]);

		}

	}

}

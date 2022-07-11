package com.rays.javabasics;

public class Hello {

	public static void main(String[] args) {

		int num = 8;
		int count = 0;

		for (int i = 2; i < num; i++) {

			if (num % i == 0) {

				count++;

				System.out.println("not prime");

				break;

			}

		}
		if (count == 0) {
			System.out.println("Prime number");
		}

	}

}

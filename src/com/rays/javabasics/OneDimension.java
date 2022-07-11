package com.rays.javabasics;

public class OneDimension {

	public static void main(String[] args) {

		String str1 = new String("==qwerty==").replaceAll("^==", "?");
		String str2 = new String("==qwerty==").replaceAll("==$", "?");
		String str3 = new String("===qwerty==").replaceAll("(=)+", "?");
		
		
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);

	}

}

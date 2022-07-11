package com.rays.oop;

public class TestShape {

	public static void main(String[] args) {

		Shape s1 = new Shape();

		s1.setColor("Red");
		s1.setBorderWidth(10);

		System.out.println(s1.getColor() + "   " + s1.getBorderWidth());
		
		Shape s2 = new Shape();
		s2.setColor("Green");
		s2.setBorderWidth(20);

		System.out.println(s2.getColor() + "   " + s2.getBorderWidth());
		
		

	}

}

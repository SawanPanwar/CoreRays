package com.rays.javabasics;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Oprt {

	public static void main(String[] args) throws ParseException {

		String d1 = args[0];

		String d2 = args[1];

		System.out.println(d1 + " & " + d2);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Date date1 = sdf.parse(d1);

		Date date2 = sdf.parse(d2);

		System.out.println(date1 + " & " + date2);
	}

}

package com.rays.javabasics;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Date1 {

	public static void main(String[] args) throws ParseException {

		Date today = new Date();

		Calendar cal = Calendar.getInstance();

		cal.setTime(today);

		cal.add(Calendar.DATE, 1);

		Date t = cal.getTime();

		System.out.println(t);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		String s = sdf.format(t);

		System.out.println(s);

	}
}

package com.wipro;

import java.time.LocalDate;

public class DateTimeDemo {

	public static void main(String[] args) {

		
	LocalDate  date =	LocalDate.now();
	
	LocalDate ind = LocalDate.of(1947, 8, 15);
	
		System.out.println(date);
		
		System.out.println(date.getDayOfYear());
		
		System.out.println(date.getDayOfWeek());
		
		System.out.println(date.getYear());
		
		
		
		System.out.println(date.plusYears(1));
		System.out.println(date.minusWeeks(2));
		
		System.out.println(date.isLeapYear());
		
		
		System.out.println(ind.isBefore(date));
		
		System.out.println(date.isAfter(ind));
		
		System.out.println(ind.isLeapYear());
		
		
		
		
		
	}

}

package com.wipro;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DTZDemo {

	public static void main(String[] args) {

		LocalDateTime dt = LocalDateTime.now();

		System.out.println(dt.getYear());

		System.out.println(dt.getHour());

		ZonedDateTime zdt = ZonedDateTime.now();

		System.out.println(zdt);
		
		ZonedDateTime zdt2 = ZonedDateTime.of(dt, ZoneId.of("Australia/Sydney"));
		
		System.out.println(zdt2.getHour());

	}

}

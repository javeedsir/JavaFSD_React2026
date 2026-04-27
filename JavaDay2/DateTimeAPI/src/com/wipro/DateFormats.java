package com.wipro;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateFormats {

	public static void main(String[] args) {


		LocalDate  date = LocalDate.now();
		
		System.out.println(date);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		
		
			System.out.println(date.format(formatter));
			
			
			DateTimeFormatter myformat =	DateTimeFormatter.ofPattern("dd/MM/yyyy");
			
				
			String str =		date.format(myformat);
			
				System.out.println(str);
			
				String  mydate = "12/09/2020";
				
				//LocalDate d =  LocalDate.parse(mydate);
				//System.out.println(d.format(myformat));
				
					LocalDate d2 =			LocalDate.parse(mydate, myformat);
				
				System.out.println(d2.format(formatter));
			
			
			
	}

}

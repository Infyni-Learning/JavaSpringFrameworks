package com;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Demo1 {

	public static void main(String[] args) {
		//LocalDate ld1 = LocalDate.now();
		//System.out.println(ld1);
		//LocalTime lt1 = LocalTime.now();
		//System.out.println(lt1);
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		System.out.println("Get Hours "+ldt.getHour());
		System.out.println("Month "+ldt.getMonth());
		
		
		//String str1  = ldt.format(DateTimeFormatter.ofPattern("dd - MM - yy"));
		String str1  = ldt.format(DateTimeFormatter.ofPattern("dd - MM - yyyy"));
		System.out.println(str1);
									
					
	}

}

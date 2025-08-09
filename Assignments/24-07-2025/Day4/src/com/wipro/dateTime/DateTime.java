package com.wipro.dateTime;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
public class DateTime {

	public static void main(String[] args) {
		//LocalDate dt = LocalDate.now();
		//System.out.println(dt);
		
		LocalDate Dt = LocalDate.of(2001,6,21);
		System.out.println(Dt);
		LocalDate DT = LocalDate.of(2023,10,01);
		System.out.println(DT);
		
		//LocalDate dT = LocalDate.EPOCH;
		//System.out.println(dT);
		//LocalDate dT1 = LocalDate.ofEpochDay(6666);
		//System.out.println(dT1);
		//LocalDateTime ldt = LocalDateTime.now();
		//System.out.println(ldt);
		//DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		//System.out.println(DT.format(formatter));
		
		System.out.println(Diff(Dt,DT));
		
	}
	/*public static int getAge(LocalDate Dt,LocalDate dt){
		int x = Dt.getYear();
		int y =dt.getYear();
		return y-x;
	}*/
	public static int Diff(LocalDate d1,LocalDate d2){
		int x1 = d1.getYear();
		int x2 = d1.getMonthValue();
		int x3 = d1.getDayOfYear();
		int y1 = d2.getYear();
		int y2 = d2.getMonthValue();
		int y3 = d2.getDayOfYear();
		System.out.println(Math.abs(x1-y1));
		System.out.println(Math.abs(x2-y2));
		System.out.println(Math.abs(x3-y3));
		return 0;
	}
}

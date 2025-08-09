package com.wipro.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.function.Supplier;

public class SupplierTest {

	public static void main(String[] args) {
		Supplier<Double> rand =()->{return Math.random();};
		System.out.println(rand.get());
		//Supplier<LocalDate> Tommrow =()->{return LocalDa;};
	}

}

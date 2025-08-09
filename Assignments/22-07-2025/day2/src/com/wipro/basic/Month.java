package com.wipro.basic;

public enum Month {
	JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE,
    JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;


public static void main(String[] args) {

    // Step 2: Print all months using for-each
    System.out.println("All months:");
    for (Month m : Month.values()) {
        System.out.println(m);
    }

    // Step 3: Create a variable of type Month and assign FEBRUARY
    Month month = Month.FEBRUARY;

    // Step 4: Check if the month is FEBRUARY
    if (month == Month.FEBRUARY) {
        System.out.println("The assigned month is FEBRUARY");
    } else {
        System.out.println("The assigned month is not FEBRUARY");
    }
}
}

package com.wipro.test;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.function.Consumer;

public class ConsumerTest {
	public static void main(String[] args) {
//		Consumer<Integer> printNextEven = n -> {
//            int nxtEven = (n % 2 == 0) ? n + 2 : n + 1;
//            System.out.println("Next EvenNo. : " + nxtEven);
//        };
//        printNextEven.accept(5);
//        printNextEven.accept(100);
//        printNextEven.accept(132);
		Consumer<String> TimeZone = zone -> {
            ZonedDateTime ct = ZonedDateTime.now(ZoneId.of(zone));
            System.out.println("Current time in " + zone + ": " + ct);
        };

        TimeZone.accept("Europe/London");
	}

}

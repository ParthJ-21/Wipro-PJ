package com.wipro.oop.test;
import com.wipro.oop.Converter;
public class ConvertTest {
	public static void main(String[] args) {
		Converter converter = new Converter();

        int singleIntResult = converter.convert(8);              // Should return 25
        int twoIntResult = converter.convert(4, 6);              // Should return 10
        double doubleResult = converter.convert(-23.23);           // Should return 7.0

        System.out.println("convert(5) => " + singleIntResult);
        System.out.println("convert(4, 6) => " + twoIntResult);
        System.out.println("convert(7.89) => " + doubleResult);
	}
}

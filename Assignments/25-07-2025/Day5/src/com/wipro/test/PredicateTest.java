package com.wipro.test;
import java.util.function.Predicate;
public class PredicateTest {

	public static void main(String[] args) {
//		Predicate<Integer> p = n-> n%2==0? true : false;
//		System.out.println(p.test(17));
		
		Predicate<String> p = s->s.equals(s.toUpperCase())? true : false;
		System.out.println("Is it in UpperCase? " + p.test("MOM"));
		System.out.println("Is it in UpperCase? " + p.test("dad"));
		Predicate<String> q = s->s.equals(s.toLowerCase())? true : false;
		System.out.println("Is it in LowerCase? " + q.test("mom"));
		System.out.println("Is it in LowerCase? " + q.test("DAD"));
	}

}

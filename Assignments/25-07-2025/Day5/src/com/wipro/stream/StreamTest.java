package com.wipro.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamTest {
	public static void main(String[] args) {
		
		//Ex. 12
//		List<String> list1 = Arrays.asList("Raja", "Jaiswal", "Ajay", "Jaya", "kartik", "Rajesh");
//
//        List<String> res1 = list1.stream()
//                .filter(name -> name.toLowerCase().contains("ja")).collect(Collectors.toList());
//        System.out.println(res1);
        
        //Ex.13
		List<Integer> list = Arrays.asList(4,2,4);
		long sum1 = list.stream().reduce(0,(a,b)->a+b);
		int x = list.size();
		System.out.println(sum1/x);
		
	}
}

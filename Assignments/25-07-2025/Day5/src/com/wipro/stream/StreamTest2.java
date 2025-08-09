package com.wipro.stream;
import com.wipro.stream.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamTest2 {
	public static void main(String[] args) {
		FoodItem f1= new FoodItem("Veg Manchurian", "Veg", "Chinese", 180);
		FoodItem f2=new FoodItem("Rice", "Non Veg", "Chinese", 220);
		FoodItem f3=new FoodItem("xyz", "Veg", "Thai", 250);
		FoodItem f4= new FoodItem("Spring Rolls", "Veg", "Chinese", 150);
		FoodItem f5=new FoodItem("Pasta", "Veg", "Continental", 300);
		FoodItem f6=new FoodItem("abc", "Non Veg", "Indian", 280);
		
		 List<FoodItem> menu = new ArrayList<>();
		 menu.add(f6);
		 menu.add(f5);
		 menu.add(f4);
		 menu.add(f3);
		 menu.add(f2);
		 menu.add(f1);
//		 List<FoodItem> chineseFoods = menu.stream()
//                 .filter(item -> item.cuisine.equalsIgnoreCase("Chinese"))
//                 .collect(Collectors.toList());
		// System.out.println(chineseFoods);
		 Optional<FoodItem> Expensive = menu.stream()
                 .max(Comparator.comparingDouble(item->item.price));
		 System.out.println(Expensive);
		 
	}
}

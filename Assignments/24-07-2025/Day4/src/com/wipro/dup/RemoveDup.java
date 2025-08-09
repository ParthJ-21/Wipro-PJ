package com.wipro.dup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDup {
	public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList(
            "ball", "bat", "stump", "ball", "stump", "guard"));

        System.out.println("Original List: " + list);

        Set<String> set = new LinkedHashSet<>(list);

        List<String> noDuplicates = new ArrayList<>(set);

        System.out.println("List after removing duplicates: " + noDuplicates);
    }
}

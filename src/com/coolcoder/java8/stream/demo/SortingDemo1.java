package com.coolcoder.java8.stream.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortingDemo1 {
	
	public static void main(String[] args) {
		
		
		List<Integer> numberList = Arrays.asList(3,1,5,8,11,2);
		
		//sort elements in ascending order
		List<Integer> sorttedList = numberList.stream().sorted().collect(Collectors.toList());
		
		System.out.println(sorttedList);
		
		//    int compare(T o1, T o2);
		
		
		
		List<Integer> descendingOrderList = numberList.stream().sorted((a,b)-> b-a).collect(Collectors.toList());
		
		System.out.println(descendingOrderList);
		
       List<Integer> ascendingOrderList = numberList.stream().sorted((a,b)-> a-b).collect(Collectors.toList());
		
		System.out.println(ascendingOrderList);
	}

}

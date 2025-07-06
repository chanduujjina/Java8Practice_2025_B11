package com.coolcoder.java8.stream.demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Filter_Predicate_Demo2 {
	
	public static void main(String[] args) {
		
		List<Integer> numbetList = Arrays.asList(1,2,3,5,6);//master list
		
		//i want even Number from masterlist
		
		List<Integer> evenList =	numbetList.stream().filter((num)-> num%2 == 1).collect(Collectors.toList());
		
		System.out.println(evenList);
		
		
	}

}

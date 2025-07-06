package com.coolcoder.java8.stream.demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Filter_Predicate_Demo1 {
	
	public static void main(String[] args) {
		
		List<Integer> numbetList = Arrays.asList(1,2,3,5,6);//master list
		
		//i want even Number from masterlist
		
		Predicate<Integer> predicate= (num)-> num%2 == 1;
		
		Consumer<Integer> consumer = (num) -> System.out.println(num);
		
		numbetList.stream().filter(predicate).forEach(consumer);
		
		
	}

}

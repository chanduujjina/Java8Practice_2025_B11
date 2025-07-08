package com.coolcoder.java8.stream.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class TerminalOperationStreamDemo2 {
	
	public static void main(String[] args) {
		
		
		List<Integer> numberList = Arrays.asList(1,4,5,7,8);
		//add +2 for even numbers in the Stream
		
		//Supplier<ArrayList<Integer>> supplier1 = ()-> new ArrayList();//lambda expression
		
		//Supplier<ArrayList<Integer>> supplier2 = ArrayList :: new;//Method reference
		
		List<Integer> filetredList = numberList.stream().filter(num-> num%2==0).map(num-> num+2).collect(Collectors.toCollection(ArrayList :: new));
		
		System.out.println(filetredList);
		
		
		
		
	}

}

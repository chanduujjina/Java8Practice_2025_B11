package com.coolcoder.java8.stream.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectDemo3 {
	
	public static void main(String[] args) {
		
		List<Integer> numberList = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		
		
		//find the evenList
		
		ArrayList<Integer> evenList = numberList.stream().filter(num -> num%2==0).collect(Collectors.toCollection(ArrayList :: new));
		System.out.println(evenList);
		
		//find oddList
		
		ArrayList<Integer> oddList = numberList.stream().filter(num -> num%2==1).collect(Collectors.toCollection(ArrayList :: new));
		System.out.println(oddList);
		
		Map<Boolean, List<Integer>> evenOrAddList = numberList.stream().collect(Collectors.partitioningBy(num -> num%2==1));
		
		System.out.println(evenOrAddList);
		
		
	}

}

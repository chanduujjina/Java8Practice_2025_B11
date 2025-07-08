package com.coolcoder.java8.stream.demo;

import java.util.Arrays;
import java.util.List;

public class CollectDemo4 {
	
	public static void main(String[] args) {
		
		List<Integer> numberList = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		
		List<Integer> compareList = Arrays.asList(1,10,11,13);
		
		//num -> compareList.contains(num) -> compareList ::contains
		
		boolean isAnyMatch = numberList.stream().anyMatch(compareList::contains);
		
		System.out.println(isAnyMatch);
		
		List<Integer> compareList1 = Arrays.asList(10,11,13);
		
		boolean isNoneMatch = numberList.stream().noneMatch(compareList1 ::contains);
		
		System.out.println(isNoneMatch);
		
		List<Integer> compareList2 = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		boolean allMatch = numberList.stream().allMatch(compareList2 ::contains);
		System.out.println(allMatch);
		
	}

}

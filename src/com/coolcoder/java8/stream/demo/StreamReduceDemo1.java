package com.coolcoder.java8.stream.demo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceDemo1 {
	
	
	public static void main(String[] args) {
		List<Integer> numbetList = Arrays.asList(1,2,3,5,6);
		
		Optional<Integer> optionalSum = numbetList.stream().reduce((a,b)-> a+b);
		
		Integer sum = optionalSum.get();
		
		System.out.println(sum);
		
		
		List<Integer> numbetList2 = Arrays.asList(11,12,13,15,16);
		
		int intValue = numbetList2.stream().reduce(sum, (a,b)-> a+b).intValue();
		
		System.out.println(intValue);
		
	}

}

package com.coolcoder.java8.stream.demo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.function.Function;

public class AggregatorDemo2 {
	
	public static void main(String[] args) {
		
		List<Integer> numberList = Arrays.asList(3,1,5,8,11,2);
		
		//second max n-1
		
		Optional<Integer> secondmaxOptional = numberList.stream().sorted((a,b)-> b-a).skip(1).findFirst();
		
		Integer secondmax = secondmaxOptional.isPresent() ? secondmaxOptional.get() : null;
		
		System.out.println(secondmax);
		
		//second min
		Optional<Integer> secondMinOptional = numberList.stream().sorted().skip(1).findFirst();
		Integer secondMin = secondMinOptional.isPresent() ? secondMinOptional.get() : null;
		
		System.out.println(secondMin);
		
	}

}

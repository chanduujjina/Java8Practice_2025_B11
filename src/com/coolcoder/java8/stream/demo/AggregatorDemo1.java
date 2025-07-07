package com.coolcoder.java8.stream.demo;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.function.Function;

public class AggregatorDemo1 {
	
	public static void main(String[] args) {
		
		List<Integer> numberList = Arrays.asList(3,1,5,8,11,2);
		
		//aggregator functions
		//max
		OptionalInt optionalMaxInt = numberList.stream().mapToInt(a-> a).max();
		
		Integer max =optionalMaxInt.isPresent()? optionalMaxInt.getAsInt():null; 
		
		System.out.println(max);
		
		//min
		
		OptionalInt optionalMinInt = numberList.stream().mapToInt(a-> a).min();
		
		Integer min =optionalMinInt.isPresent()? optionalMinInt.getAsInt():null; 
		
		System.out.println(min);
		
		int sum = numberList.stream().mapToInt(a-> a).sum();
		
		System.out.println(sum);
		
		//average function
		OptionalDouble optionalDouble = numberList.stream().mapToInt(a-> a).average();
		
		Double average = optionalDouble.isPresent() ? optionalDouble.getAsDouble() : null;
		
		System.out.println(average);
		
		//count
		long count = numberList.stream().mapToInt(a-> a).count();
		System.out.println(count);
		
	}

}

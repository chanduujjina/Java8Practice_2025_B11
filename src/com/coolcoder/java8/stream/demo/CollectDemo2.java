package com.coolcoder.java8.stream.demo;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectDemo2 {
	
	public static void main(String[] args) {
		
		Stream<Integer> numberStream = Stream.of(3,1,4,5,6,3,1);
		
		//convert to Map
		//Function.identity() -> a-> a
		
		Map<Integer, Integer> numberMap =numberStream.collect(Collectors.toMap(Function.identity(), Function.identity(),(o,n)->n));
		System.out.println(numberMap);//not follow insertion order
		
		
		Stream<Integer> numberStream1 = Stream.of(3,1,4,5,6,3,1);
		
		LinkedHashMap<Integer, Integer> linkedHaspMap = numberStream1.collect(Collectors.toMap(Function.identity(), Function.identity(),(o,n)->n,LinkedHashMap :: new));
		
		System.out.println(linkedHaspMap);//it will follow insertion order
		
	}

}

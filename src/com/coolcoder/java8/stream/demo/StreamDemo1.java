package com.coolcoder.java8.stream.demo;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamDemo1 {
	
	public static void main(String[] args) {
		
		//Ways of creating Stream
		
		//1. Static way
		
		Stream<Integer> stream1 = Stream.of(1,2,4,5,3,7,8);
		
		Consumer consumer = (num) -> System.out.println(num);
		
		stream1.forEach(consumer);//fetch operation first time
		
		stream1.forEach(consumer);//fetch operation second time
		
		
	}

}

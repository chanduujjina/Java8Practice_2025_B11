package com.coolcoder.java8.stream.demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamDemo2 {
	
	public static void main(String[] args) {
		
		//Ways of creating Stream
		
		//2. Dynamic way of creating Stream
		List<Integer> numbetList = Arrays.asList(1,2,3,5,6);
		
		Stream<Integer> stream1 = numbetList.stream();
		
		Consumer consumer = (num) -> System.out.println(num);
		
		stream1.forEach(consumer);//fetch operation first time
		
		
		Stream<Integer> stream2 = numbetList.stream();
		stream2.forEach(consumer);//fetch operation second time
		
		//when your fetching from collection it will give always new Stream
		
		
	}

}

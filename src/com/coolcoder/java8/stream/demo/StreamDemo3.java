package com.coolcoder.java8.stream.demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamDemo3 {
	
	public static void main(String[] args) {
		
		//Ways of creating Stream
		
		//2. Dynamic way of creating Stream
		List<Integer> numbetList = Arrays.asList(1,2,3,5,6);
		
		
		
		Consumer consumer = (num) -> System.out.println(num);
		
		numbetList.stream().forEach(consumer);
		
		System.out.println("second operation");
		numbetList.stream().forEach(consumer);
		
	}

}

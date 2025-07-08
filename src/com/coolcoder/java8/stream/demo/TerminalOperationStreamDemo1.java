package com.coolcoder.java8.stream.demo;

import java.util.Arrays;
import java.util.List;

public class TerminalOperationStreamDemo1 {
	
	public static void main(String[] args) {
		
		
		List<Integer> numberList = Arrays.asList(1,4,5,7,8);
		//add +2 for even numbers in the Stream
		
		numberList.stream().filter(num-> num%2==0).map(num-> num+2).forEach(System.out::println);;//no live
		
		System.out.println(numberList);//1,6,5,7,10
	}

}

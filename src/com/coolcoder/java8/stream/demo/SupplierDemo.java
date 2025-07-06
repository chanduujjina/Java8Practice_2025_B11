package com.coolcoder.java8.stream.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SupplierDemo {
	
	public static void main(String[] args) {
		
		List<Integer> numberList = new ArrayList();
		
		numberList.add(1);
		numberList.add(2);
		numberList.add(3);
		numberList.add(4);
		numberList.add(5);
		numberList.add(6);
		
		//add square to each number
		//1 4 9,16,25,36 -> Transformation
		
		//UnaryOperator<Integer> func = (num) -> num*num;
		
		List<Integer> squqreList = numberList.stream().map((num) -> num*num).collect(Collectors.toList());
	}
	

}

package com.coolcoder.java8.demo;

import java.util.ArrayList;
import java.util.List;

public class ComputeDemo1 {
	
	public static void main(String[] args) {
		
		List<Integer> numberList = new ArrayList();
		
		for (int i =1;i<=10;i++) {
			numberList.add(i);
		}
		
		
		int sum = numberList.stream().mapToInt((val)-> val).sum();
		
		System.out.println(sum);
		
	}

}

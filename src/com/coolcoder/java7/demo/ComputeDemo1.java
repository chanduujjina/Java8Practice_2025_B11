package com.coolcoder.java7.demo;

import java.util.ArrayList;
import java.util.List;

public class ComputeDemo1 {
	
	public static void main(String[] args) {
		
		List<Integer> numberList = new ArrayList();
		
		for (int i =1;i<=10;i++) {
			numberList.add(i);
		}
		
		//get the sum of numbers in a list
		
		int sum = 0;
		
		for (int num :numberList) {
			sum = sum+num;
		}
		
		System.out.println(sum);
	}

}

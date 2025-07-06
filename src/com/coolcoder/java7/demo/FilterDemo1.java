package com.coolcoder.java7.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterDemo1 {
	
	public static void main(String[] args) {
		
		List<Integer> numbetList = Arrays.asList(1,2,3,5,6);//master list
		
		List<Integer> oddList = new ArrayList<>();
		
		for (int num : numbetList) {//iterator
			if (num%2 == 1) {// filter using if loop
				oddList.add(num);// adding filter data to the final list
			}
			

		}
		
		System.out.println(oddList);
	}

}

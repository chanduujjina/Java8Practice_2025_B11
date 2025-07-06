package com.coolcoder.java8.demo;

import java.util.ArrayList;
import java.util.List;

public class LamdaExpressionDemo6 {
	
	public static void main(String[] args) {
		
		
		List<String> nameList = new ArrayList<>();
		nameList.add("test1");
		nameList.add("test2");
		nameList.add("sample1");
		nameList.add("sample2");
		
		Base6 base6 = (names,value) -> {
			 
			List<String> filteredList = new ArrayList<>();
			for (String name : names) {
				if (name.startsWith(value)) {
					filteredList.add(name);
				}
			}
			
			return filteredList;
			
		};
		
		List<String> fileteredList = base6.m1(nameList, "test");
		
		System.out.println(fileteredList);
		
	
	}

}

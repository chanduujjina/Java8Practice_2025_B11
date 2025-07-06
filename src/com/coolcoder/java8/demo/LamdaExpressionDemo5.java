package com.coolcoder.java8.demo;

import java.util.ArrayList;
import java.util.List;

public class LamdaExpressionDemo5 {
	
	public static void main(String[] args) {
		
		Base5 base5 = ()-> {
			List<String> nameList = new ArrayList<>();
			nameList.add("test1");
			nameList.add("test2");
			return nameList;
			};
			
			List<String> nameList = base5.m1();
			System.out.println(nameList);
	
	}

}

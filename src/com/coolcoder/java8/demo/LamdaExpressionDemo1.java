package com.coolcoder.java8.demo;

public class LamdaExpressionDemo1 {
	
	public static void main(String[] args) {
		
		//Lamda expression
		Base1 base1 = (val) -> Integer.valueOf(val);
		
		int val = base1.m1("123");
		
		System.out.println(val);
	}

}

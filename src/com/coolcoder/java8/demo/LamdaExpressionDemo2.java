package com.coolcoder.java8.demo;

public class LamdaExpressionDemo2 {
	
	public static void main(String[] args) {
		
	Base2 base2 = (val1,val2) -> {
		int c = val1+val2;
		return String.valueOf(c);
	};
	
	String value = base2.m1(1, 2);
	
	System.out.println(value);
	}

}

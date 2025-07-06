package com.coolcoder.java8.demo;

public class LamdaExpressionDemo3 {
	
	public static void main(String[] args) {
		Base3 base3 = (num1,num2) -> num1+num2;
		
		base3.m1(1, 1);
	
	}

}

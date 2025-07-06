package com.coolcoder.java8.demo;

public class LamdaExpressionDemo4 {
	
	public static void main(String[] args) {
		
		Base4 base4 = (val1,val2)-> {
			System.out.println("val1:"+val1);
			System.out.println("val2:"+val2);
		};
		
		base4.m1("tets1", "test2");
	
	}

}

package com.coolcoder.java7.demo;

public class AbstractTest {
	
	public static void main(String[] args) {
		
		Base base = new BaseImpl();
		base.m1();
		
		
		
		//second aproach
		
		Base base1 = new Base() {
			
			
			
			@Override
			public void m1() {
				System.out.println("inside annonomous class m1 method");
				
			}
		};
		
		
		base1.m1();
		
	}

}

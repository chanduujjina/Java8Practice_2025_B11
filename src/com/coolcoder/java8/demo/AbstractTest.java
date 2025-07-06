package com.coolcoder.java8.demo;

import com.coolcoder.java7.demo.Base;

public class AbstractTest {

	public static void main(String[] args) {

		Base base1 = new Base() {

			@Override
			public void m1() {
				System.out.println("inside annonomous class m1 method");

			}
		};
		
		base1.m1();
		
		
		Base base2 = ()-> System.out.println("inside lamda expression  m1 method");
		
		base2.m1();
	}

}

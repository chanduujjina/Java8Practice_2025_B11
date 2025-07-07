package com.coolcoder.java8.interface_info;

public class DefaultAndStaticTest {
	public static void main(String[] args) {
		
		
		Vendor1 vendor1 = new Vendor1();
		vendor1.m1();
		vendor1.m3();
		
		//static method
	   BaseProvider.m2();
	   
	   
	   Vendor2 vendor2 = new Vendor2();
	   vendor2.m1();
	   vendor2.m3();
		
		//static method
	   BaseProvider.m2();
	}

}

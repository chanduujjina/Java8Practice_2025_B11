package com.coolcoder.java8.interface_info;

public interface BaseProvider {
	
	void m1();
	
	static void m2() {
		System.out.println("Inside static method m2");
	}
	
	default void m3() {
		System.out.println("Inside default method method m2");
	}

}

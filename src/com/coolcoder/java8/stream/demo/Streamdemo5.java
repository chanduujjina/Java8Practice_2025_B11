package com.coolcoder.java8.stream.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Streamdemo5 {
	
	
	
	public static void main(String[] args) {
		List<Employee> employeeList = getEmployeeList();
		
		//emp -> emp.getId() -> Employee :: getId
		//emp->emp -> Function.identity
		Map<Integer, Employee> map = employeeList.stream().collect(Collectors.toMap(Employee :: getId, Function.identity(),(o,n)->n,LinkedHashMap :: new));
		
		System.out.println(map);
		
		//usage of flatmap
		
		List<String> skillSet = employeeList.stream().flatMap(emp->emp.getSkilSet().stream()).distinct().collect(Collectors.toList());
		
		System.out.println(skillSet);
		
		
	}
	
	
private static List<Employee> getEmployeeList(){
		
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee(1, "chandu", "male", 100000d, true, "it",Arrays.asList("scala","python","java","typescript")));
		employeeList.add(new Employee(2, "sabitha", "female", 50000d, true, "it",Arrays.asList(".net","java","typescript")));
		employeeList.add(new Employee(3, "sudhakar", "male", 200000d, true, "admin",Arrays.asList("react","java","typescript")));
		employeeList.add(new Employee(4, "ganesh", "male", 300000d, true, "finance",Arrays.asList("backbone","java","typescript")));
		employeeList.add(new Employee(5, "hemanth", "male", 400000d, true, "it",Arrays.asList("view","java","typescript")));
		employeeList.add(new Employee(6, "abhiRam", "male", 600000d, true, "HR",Arrays.asList("ejb","java","typescript")));
		employeeList.add(new Employee(9, "vinod", "male", 600000d, false, "HR",Arrays.asList("jsx","java","typescript")));
		employeeList.add(new Employee(7, "raju", "male", 600000d, false, "HR",Arrays.asList("ESX","java","typescript")));
		employeeList.add(new Employee(8, "vikas", "male", 600000d, false, "HR",Arrays.asList("mainframe","java","typescript")));
		
		
		return employeeList;
	}

}

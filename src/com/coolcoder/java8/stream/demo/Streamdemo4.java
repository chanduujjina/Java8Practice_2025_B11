package com.coolcoder.java8.stream.demo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Streamdemo4 {
	
	
	
	public static void main(String[] args) {
		List<Employee> employeeList = getEmployeeList();
		
		System.out.println("master list::"+employeeList);
		
		//get the nameList
		//slicing
		
		List<String> nameList = employeeList.stream().map(emp-> emp.getName()).collect(Collectors.toList());
		
		System.out.println(nameList);
		
		//filtering
		
		List<Employee> itEmployeeList = employeeList.stream().filter(emp-> emp.getDeptName().equals("it")).collect(Collectors.toList());
		
		System.out.println(itEmployeeList);
		
		//get the inactive employee
		
		List<Employee> inactiveemployeeList = employeeList.stream().filter(emp-> !emp.getIsActice()).collect(Collectors.toList());
		System.out.println(inactiveemployeeList);
		
		//increemnt salary of it employee by 20000
		
		List<Employee> updatedList = employeeList.stream().filter(emp-> emp.getDeptName().equals("it")).map(emp-> {
			emp.setSalary(emp.getSalary()+20000);
			return emp;
		}).collect(Collectors.toList());
		
		System.out.println(updatedList);
		
		//departement vs count
		
		Map<String, Long> deptCount = employeeList.stream().collect(Collectors.groupingBy(Employee :: getDeptName,Collectors.counting()));
		
		System.out.println(deptCount);
		
		//Map<String,List<Employee>
		
		Map<String, List<Employee>> groupingOnDepartment = employeeList.stream().collect(Collectors.groupingBy(emp-> emp.getDeptName(),Collectors.toList()));
		
		System.out.println(groupingOnDepartment);
		
		//sort empoyeee based on name
		
		
		List<Employee> sortedEmployeeList = employeeList.stream().sorted((a,b) -> b.getName().compareTo(a.getName())).collect(Collectors.toList());
		
		System.out.println(sortedEmployeeList);
		
		//sort the employee based on salary desc if two employees having same salary then compare with name
		
		Comparator<Employee> comparatorOnSalary = (a,b)->b.getSalary().compareTo(a.getSalary());
		Comparator<Employee> comparatorOnName = (a,b)->a.getName().compareTo(b.getName());
		
		Comparator<Employee> thenComparing = comparatorOnSalary.thenComparing(comparatorOnName);
		
		List<Employee> sortedList = employeeList.stream().sorted(thenComparing).collect(Collectors.toList());
		
		System.out.println(sortedList);
		
	}
	
	
	private static List<Employee> getEmployeeList(){
		
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee(1, "chandu", "male", 100000d, true, "it"));
		employeeList.add(new Employee(2, "sabitha", "female", 50000d, true, "it"));
		employeeList.add(new Employee(3, "sudhakar", "male", 200000d, true, "admin"));
		employeeList.add(new Employee(4, "ganesh", "male", 300000d, true, "finance"));
		employeeList.add(new Employee(5, "hemanth", "male", 400000d, true, "it"));
		employeeList.add(new Employee(6, "abhiRam", "male", 600000d, true, "HR"));
		employeeList.add(new Employee(9, "vinod", "male", 600000d, false, "HR"));
		employeeList.add(new Employee(7, "raju", "male", 600000d, false, "HR"));
		employeeList.add(new Employee(8, "vikas", "male", 600000d, false, "HR"));
		
		
		return employeeList;
	}

}

package com.coolcoder.java8.stream.demo;

public class Employee {
	
	private Integer id;
	
	private String name;
	
	private String gender;
	
	private Double salary;
	
	private Boolean isActice;
	
	private String deptName;

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", salary=" + salary + ", isActice="
				+ isActice + ", deptName=" + deptName + "]";
	}

	public Employee(Integer id, String name, String gender, Double salary, Boolean isActice, String deptName) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.salary = salary;
		this.isActice = isActice;
		this.deptName = deptName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Boolean getIsActice() {
		return isActice;
	}

	public void setIsActice(Boolean isActice) {
		this.isActice = isActice;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

}

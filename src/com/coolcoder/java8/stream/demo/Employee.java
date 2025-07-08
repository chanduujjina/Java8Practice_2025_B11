package com.coolcoder.java8.stream.demo;

import java.util.List;
import java.util.Objects;

public class Employee {
	
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

	public List<String> getSkilSet() {
		return skilSet;
	}

	public void setSkilSet(List<String> skilSet) {
		this.skilSet = skilSet;
	}

	private Integer id;
	
	private String name;
	
	private String gender;
	
	private Double salary;
	
	private Boolean isActice;
	
	private String deptName;
	
	private List<String> skilSet;

	public Employee(Integer id, String name, String gender, Double salary, Boolean isActice, String deptName,
			List<String> skilSet) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.salary = salary;
		this.isActice = isActice;
		this.deptName = deptName;
		this.skilSet = skilSet;
	}

	@Override
	public int hashCode() {
		return Objects.hash(deptName, gender, id, isActice, name, salary, skilSet);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(deptName, other.deptName) && Objects.equals(gender, other.gender)
				&& Objects.equals(id, other.id) && Objects.equals(isActice, other.isActice)
				&& Objects.equals(name, other.name) && Objects.equals(salary, other.salary)
				&& Objects.equals(skilSet, other.skilSet);
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", salary=" + salary + ", isActice="
				+ isActice + ", deptName=" + deptName + ", skilSet=" + skilSet + "]";
	}
	

}

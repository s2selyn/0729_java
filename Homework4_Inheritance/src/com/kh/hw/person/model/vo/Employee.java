package com.kh.hw.person.model.vo;

public class Employee extends Person {
	
	// 필드부
	private int salary; // 급여
	private String dept; // 부서
	
	// 생성자부
	// 기본 생성자
	public Employee() {}
	
	// 매개변수 생성자
	public Employee(String name, int age, double height, double weight, int salary, String dept) {
		
		super();
		this.salary = salary;
		this.dept = dept;
		
	}
	
	// 메소드부
	// getter()
	public int getSalary() {
		return salary;
	}
	
	public String getDept() {
		return dept;
	}
	
	// setter()
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	// 각 필드 반환 메소드
	@Override
	public String toString() {
		return super.getName() + " " + super.getAge() + " " + super.getHeight() + " " + super.getWeight() + " " + salary + " " + dept;
	}
	
}

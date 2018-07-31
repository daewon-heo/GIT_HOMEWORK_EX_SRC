package com.homework.home180725.com.week4;

public class Employee implements Comparable<Employee> {
	private String name;
	private int age;
	private int salary;
	private double rate;
	
	public Employee(String name, int age, int salary, double rate) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.rate = rate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public int getRealSal(){
		return salary - (int)(salary*rate);
	}
	
	public void printInfo(){
		System.out.println("이름 : " + name + " 나이  : " + age + " 세율 : " + rate + " 실제급여 : " + getRealSal() + "원");
	}

	@Override
	public int compareTo(Employee o) {
		if(name.compareTo(o.getName()) > 0){
			return 1;
		}else if(name.compareTo(o.getName()) < 0){
			return -1;
		}else{
			return 0;
		}
	}
}

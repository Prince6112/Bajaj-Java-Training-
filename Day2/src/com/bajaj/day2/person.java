package com.bajaj.day2;

public class person {
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

	@Override
	public String toString() {
		return "person [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

	public String name;
	private int age;
	private int salary;
	
	public person (String name,int age,int salary)
	{
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
	
	public static void main(String args[])
	{
		person ABC=new person("Prince",21,10000);
		System.out.println(ABC.toString());
		System.out.println(ABC.getAge());
		ABC.setAge(100);
		System.out.println(ABC.toString());
	}
}


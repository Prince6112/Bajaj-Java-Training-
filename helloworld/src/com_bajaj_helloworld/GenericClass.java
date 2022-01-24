package com_bajaj_helloworld;
//
class Employee<T,V,Z>
{
	private T id;
	private V name;
	private Z salary;
	
	Employee(T id, V name,Z salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		
	}
}

public class GenericClass {
	public static void main(String args[])
	{
		
		Employee<Long,String,Long> e1=new Employee(100.0,"prince",1000);
		System.out.println(e1.toString());
		
	}
}

package com.bajaj.day3;
import java.util.ArrayList;
import java.util.Scanner;

class Employees
{
	@Override
	public String toString() {
		return "Employees [employeeID=" + employeeID + ", name=" + name + "]";
	}
	public Employees(int employeeID, String name) {
		super();
		this.employeeID = employeeID;
		this.name = name;
	}
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private int employeeID;
	private String name;
	
}


public class MyFinal {
	public static void main(String args[])
	{
		
		//ArrayList<Employees> list=new ArrayList<Employees>();
		//list.add(new Employees(0,"Prince"));
		//list.add(new Employees(1,"Samuel"));
		
		Employees list[]=new Employees[10];
		int num=0;
		Scanner sc=new Scanner(System.in);
	String name;
		while(true)
		{
			System.out.println("\nSelect your choice");
			System.out.println("1 for insert");
			System.out.println("2 for delete");
			System.out.println("3 for update");
			System.out.println("4 for list");
			System.out.println("8 for exit");
			int choice=sc.nextInt();
			
			if (choice ==1)
			{
				System.out.println("Enter Name and ID");
				String name=sc.next();
				int id=sc.nextInt();
				Employees Emp=new Employees(id,name);
				list[num]=Emp;
				System.out.println(list[num].toString());
				num+=1;
				
			}
			
			if (choice ==4)
			{
				for(int i=0;i<num;i++)
				{
					System.out.println(list[i].toString());
				}
			}
			
			if(choice==8)
			{
				System.err.println("Exiting...");
				break;
			}
		}
	}
}

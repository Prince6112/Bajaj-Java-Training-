package com.bajaj.day2;

public class helloworld {
	
	public helloworld(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}


	private int a;
	int b;
	private static String schoolName="School Name";
	
	public helloworld(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	
	public void setA(int a)
	{
		this.a=a;
	}
	
	public void printValue()
	{
		System.out.println(schoolName);
		System.out.println(a);
		System.out.println(b);
	}
	
	
	public static void main(String args[])
	{
		helloworld helloworldid = new helloworld(10,10);
		helloworldid.printValue();
	}
}

package com_bajaj_helloworld;

class Calc
{
	int a,b;
	
	public void sum(int a, int b)
	{
		System.out.println(a+b);
	}
}

interface FunctionType
{
	public void execute();
}

interface FindLengthType
{
	public int abc(String s);
}

public class MyLamda {

	
	public static void main(String args[])
	{		
	
		int a =10;
		
		FunctionType code= () -> System.out.println("Hello");
		
		code.execute();
		
		FindLengthType findtype= str -> str.length();
		System.out.println(findtype.abc("Hello"));
		
		//Calc cal=new Calc();
		//cal.sum(10,20);	

	}
}

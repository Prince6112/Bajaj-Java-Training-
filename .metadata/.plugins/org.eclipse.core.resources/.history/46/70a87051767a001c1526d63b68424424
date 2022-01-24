package com_bajaj_helloworld;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

class Employees implements Comparable<Employees>
{

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employees [id=" + id + ", name=" + name + "]";
	}
	public Employees(int id,String name) {
		super();
		this.id = id;
		this.name=name;
	}

	int id;
	String name;
	

	@Override
	public int compareTo(Employees e2) {
		// TODO Auto-generated method stub
		return this.getName().compareTo(e2.getName());
		
		

	}
}

public class MyCollection {
	public static void main(String args[])
	{
		
		List<Employees> ls= new ArrayList<Employees>();
		
		ls.add(new Employees(10,"A"));
		ls.add(new Employees(61,"D"));
		ls.add(new Employees(35,"C"));
		ls.add(new Employees(-10,"B"));
		
		/*
		List<String> ls=new ArrayList<String>();
		//list<String> ls=new LinkedList<String>();
		ls.add("Prince");
		ls.add("Arince");
		ls.add("Vrince");
		ls.add("Drince");
		System.out.println(ls.lastIndexOf(ls));
		Collections.sort(ls);
		System.out.println(ls);
		
		*/
		
		for (Employees e:ls)
		{
			System.out.println(e.toString());
		}
		
		//collections.sort
		//implement comparable interface
		Collections.sort(ls);
		
		for (Employees e:ls)
		{
			System.out.println(e.toString());
		}
		
	}

}

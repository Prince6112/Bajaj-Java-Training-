package com_bajaj_helloworld;

import java.util.Hashtable;
import java.util.Map;

public class MySet {
	public static void main(String args[])
	{
		Map<Integer,String> map=new Hashtable<Integer,String>();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		System.out.println(map);
	}

}

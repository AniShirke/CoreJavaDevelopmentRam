package com.cg.corejava.collectionframework.ram;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo6 {

	public static void main(String[] args) {
		
		ArrayList<String> mylist=new ArrayList<String>();
		
		mylist.add("Ramesh");
		mylist.add("Welcome");
		mylist.add("JAVA");
		mylist.add("Hello");
						
		System.out.println(mylist);
		
		for(String d:mylist)
			System.out.println(d);
			
		Iterator i1=mylist.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		} 
}

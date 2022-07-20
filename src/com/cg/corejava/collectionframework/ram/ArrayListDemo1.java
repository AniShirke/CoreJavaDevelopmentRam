package com.cg.corejava.collectionframework.ram;
import java.util.ArrayList;


public class ArrayListDemo1 {
	


	public static void main(String[] args) {
		
		EmployeeBean empBean=new EmployeeBean();
		
		
		Integer i1=new Integer(900);
		 
		
		ArrayList mylist=new ArrayList();
		mylist.add(i1);
		mylist.add(100);
		mylist.add(45.5);
		mylist.add("Ramesh");
		mylist.add(100);
		mylist.add(empBean);
		
		
		int k=i1.intValue();
		System.out.println("K value :"+k);
		
				
		System.out.println(mylist);
		
		} 
}

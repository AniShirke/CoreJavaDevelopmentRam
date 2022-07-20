package com.cg.corejava.collectionframework.ram;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapDemo7 {
		public static void main(String[] args) {
	
		ArrayList mylist=new ArrayList();
		mylist.add("java");
		mylist.add("myData");
	
		 
		EmployeeBean empBean=new EmployeeBean();
		
		HashMap myMap=new HashMap();
		myMap.put(9989,"Ramesh , abc");
		myMap.put(100,"Stduent Info");
		myMap.put(200,"Raju , abc");
		myMap.put(300,"Bhanu Info");
		myMap.put(null,"Hello");
		myMap.put(500,null);
		myMap.put(empBean,"employee");	
		myMap.put("emp",new EmployeeBean());
		myMap.put("list",mylist);
		
		System.out.println(myMap);

	}

}

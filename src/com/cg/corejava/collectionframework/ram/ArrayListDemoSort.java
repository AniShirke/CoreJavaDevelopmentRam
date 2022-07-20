package com.cg.corejava.collectionframework.ram;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemoSort {

	public static void main(String[] args) {
		
	
		ArrayList mylist=new ArrayList();
		mylist.add(200);
		mylist.add(100);
		mylist.add(50);
		mylist.add(20);
		mylist.add(90);
		
		
		
				
			System.out.println("Before Sort");	
		System.out.println(mylist);
		
		
		Collections.sort(mylist);
		System.out.println("After Sort");	
		System.out.println(mylist);
		
		
		
		} 
}

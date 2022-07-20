package com.cg.corejava.collectionframework.ram;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo5 {

	public static void main(String[] args) {
		HashSet<Integer> myset=new HashSet<Integer>();
		
		myset.add(100);
		myset.add(90);
		myset.add(5);
				
		System.out.println(myset);
		
		for(int k:myset)
			System.out.println(k);
		
		
		Iterator i1=myset.iterator();
		
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		
		
	} }

package com.cg.corejava.collectionframework.ram;
import java.util.HashMap;import java.util.Map;

public class HashMapDemo10 {

	public static void main(String[] args) {
		 
		HashMap<Integer,String> myMap=new HashMap<Integer,String>();
		myMap.put(9989,"Ramesh , abc");
		myMap.put(100,"Stduent Info");
		myMap.put(200,"Raju , abc");
		myMap.put(300,"Bhanu Info");
		myMap.put(null,"Hello");
		myMap.put(500,null);
		myMap.put(300,"Bhanu Info");
		
		
		System.out.println(myMap);
		
		for(Map.Entry m:myMap.entrySet())
		{
			System.out.println("Key :"+m.getKey()+" -> Value : "+m.getValue());
		}

	}

}

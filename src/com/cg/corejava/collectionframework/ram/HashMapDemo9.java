package com.cg.corejava.collectionframework.ram;

import java.util.HashMap;

public class HashMapDemo9 {

	public static void main(String[] args) {
		 
		HashMap<String,String> capitalCities=new HashMap<String,String>();
		
		capitalCities.put("India","Delhi");
		capitalCities.put("USA","Washington DC");
		capitalCities.put("Germany","Berlin");
		
		System.out.println(capitalCities);
		
		for(String i:capitalCities.keySet()) {
			System.out.println(i);
		}

	}

}

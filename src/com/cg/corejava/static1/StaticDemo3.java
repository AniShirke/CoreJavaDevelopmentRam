package com.cg.corejava.static1;

// Static methods will call only static varibles and static methods
public class StaticDemo3 {
	 static String countryName="India"; // static variable
	 
	 
	static public void myData()  // Static method
	{
		System.out.println("My CountryName :"+countryName); 
		}
	
	
	public static void main(String[] args) {
		 // static methods and variable calling
		
		myData();
		
	//	StaticDemo3.myData();
		//System.out.println(StaticDemo3.countryName);
	 
		
		
	} 

}

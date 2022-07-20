package com.cg.corejava.static1;

// Static methods cant call non  static varibles and  non static methods
public class StaticDemo4 {
	 static String countryName="India"; // static variable
	  String name="Ram"; // non static variable
	  
	static public void myData()  // Static method
	{ // show();
		System.out.println("My CountryName :"+countryName); 
		}
	
		public void show() // non static method
		{   myData();
			System.out.println("Name :"+name);
		}
	public static void main(String[] args) {
		 // static methods and variable calling
		StaticDemo4.myData();
		System.out.println(StaticDemo4.countryName);
	 
		
		//non - static methods and variable calling
		StaticDemo4 sd=new StaticDemo4();
		sd.show(); 
	} 

}

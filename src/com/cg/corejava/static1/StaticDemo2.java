package com.cg.corejava.static1;
public class StaticDemo2 {
	 static String countryName="India"; // static variable
	  String name="Ram"; // non static variable
	  
	static public void myData()  // Static method
	     {
		System.out.println("My CountryName :"+countryName); 
		}
	
		public void show() // non static method
		{
			System.out.println("Name :"+name);
		}
	public static void main(String[] args) {
		 // static methods and variable calling
		StaticDemo2.myData();
		System.out.println(StaticDemo2.countryName);
	 
		
		//non - static methods and variable calling
		StaticDemo2 sd=new StaticDemo2();
		sd.show(); 
	} 

}

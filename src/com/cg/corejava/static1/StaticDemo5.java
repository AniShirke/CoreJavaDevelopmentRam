package com.cg.corejava.static1;

//Non - Static methods can call static varibles and static methods
public class StaticDemo5 {
	 static String countryName="India"; // static variable
	  String name="Ram"; // non static variable
	
	  static public void myData()  // Static method
	 {
		System.out.println("Mydata :a My CountryName :"+countryName); 
		}
	
		public void show() // non static method
		{ myData();
			System.out.println("Name :"+name);
		}
	public static void main(String[] args) {
		 // static methods and variable calling
		//StaticDemo5.myData();
	//	System.out.println(StaticDemo5.countryName);
	 
		
		//non - static methods and variable calling
		StaticDemo5 sd=new StaticDemo5();
		sd.show(); 
	} 

}

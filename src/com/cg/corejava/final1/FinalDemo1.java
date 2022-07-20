package com.cg.corejava.final1;
//	Final variable  we can’t change
public class FinalDemo1 {
	
	final String countryName ="India";
	
	public void myData()
	{   // countryName="Welcome ";  //The final field FinalDemo1.countryName cannot be assigned
		System.out.println("Country Name :"+countryName);
	}
	

	public static void main(String[] args) {
		FinalDemo1 fd=new FinalDemo1();
		fd.myData();
		
	}

}

package com.cg.corejava.collectionframework.ram;
import java.util.ArrayList;

public class WrapperClassesDemo {
	public static void main(String[] args) {
		int a1=100;
		float f1=45.5f;
		double d1=76.7;
		
		Integer t1=new Integer(a1);  // data type value convert to Object data (auto boxing)
		Float   k1=new Float(f1);
		double m1=new Double(d1);
							
		System.out.println(t1);
		System.out.println(k1);
		System.out.println(m1);
		
		int b1=t1.intValue(); //object data conver to int data is called auto unboxing
		System.out.println("b1 value :"+b1);
		   ArrayList mylist=new ArrayList(a1); 		
		    System.out.println(mylist);

	} }  

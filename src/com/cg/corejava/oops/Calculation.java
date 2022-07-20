package com.cg.corejava.oops;

public class Calculation {
 
	 public Calculation() {
		
	}	
	int a=100,b=5,c; // attributes
	
	public void addition()  //methods 
	{
		c=a+b; //B.L
		System.out.println("Addition :"+c);
	}
	
	public void sub()  //methods 
	{
		c=a-b;
		System.out.println("Sub :"+c);
	}
	public static void main(String[] args) {
		
		Calculation cal1=	   new Calculation();
		cal1.addition();
		cal1.sub();
		System.out.println(cal1.a);
	}

} //class close 

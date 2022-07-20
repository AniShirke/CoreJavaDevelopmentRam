package com.cg.corejava.oops;



public class MyCalculation extends Calculation // IS-A
{
	
	

	public static void main(String[] args) {
		
		MyCalculation my=new MyCalculation();
		my.addition();
		my.sub();
		
		
		  Calculation cal=new Calculation(); //HAS-A
		  cal.addition();
		
	}

}

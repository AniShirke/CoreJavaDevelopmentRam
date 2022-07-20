package com.cg.corejava.final1;
//	Final class we can’t extends 
 class MyTest3 {
   	 public void show() {
		 System.out.println("MyTest class show method");
	 }
 }
public class FinalDemo3  extends MyTest3{
	 public void show() {
		 System.out.println("OverridingDemo show method");
	 }
	

	public static void main(String[] args) {
		
		FinalDemo3 ovr= new FinalDemo3();
		ovr.show();
		
		MyTest3 t1=new MyTest3();
		t1.show();
	}

}

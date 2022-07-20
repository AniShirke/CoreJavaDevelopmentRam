package com.cg.corejava.oops;

 class MyTest {
	 public void show() {
		 System.out.println("MyTest class show method");
	 }
 }


public class OverridingDemo  extends MyTest{
	 public void show() {
		 System.out.println("OverridingDemo show method");
	 }
	

	public static void main(String[] args) {
		
		OverridingDemo ovr= new OverridingDemo();
		ovr.show();
		
		MyTest t1=new MyTest();
		t1.show();
	}

}

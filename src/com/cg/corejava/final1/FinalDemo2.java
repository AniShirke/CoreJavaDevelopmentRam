//Final methods we can’t override
package com.cg.corejava.final1;

 class MyTest {
   	 public void show() {
		 System.out.println("MyTest class show method");
	 }
 }
public class FinalDemo2  extends MyTest{
	 
	 public void show() {
		 System.out.println("OverridingDemo show method");
	 }
	

	public static void main(String[] args) {
		
		FinalDemo2 ovr= new FinalDemo2();
		ovr.show();
		
		MyTest t1=new MyTest();
		t1.show();
	} 
}

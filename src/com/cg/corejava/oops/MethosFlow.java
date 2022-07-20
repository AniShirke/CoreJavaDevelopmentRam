package com.cg.corejava.oops;
public class MethosFlow {
	public void  myData(int a) {
		System.out.println("A value :"+a);
	}
	public int  testData(int a,int b) {
		 
		 return a+b;
	}
	public int data() {
		int a=5,b=5;
		return a+b;
	}	
	public static void main(String[] args) {
		 
		MethosFlow flow = new MethosFlow();
		flow.myData(10);

		int t=flow.testData(10,10);
		System.out.println(t);
		
		int k=flow.data();
		System.out.println("K value :"+k);
	}
 
}

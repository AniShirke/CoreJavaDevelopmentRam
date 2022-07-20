package com.cg.corejava.oops;

public class Person2 {
	 int age=18;
	 String name="Ravi";
	 String address="Bangalore";
	 
	 public void display() {
		 System.out.println("Person Name :"+name);
		 System.out.println("Person Age :"+age);
		 System.out.println("Address :"+address);
		 
	 }
		
	public static void main(String[] args) {
		 
		
		Person2 p2=new Person2();
		p2.display();

		
		
		
	}

}

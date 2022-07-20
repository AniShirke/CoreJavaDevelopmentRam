package com.cg.corejava.constructors;

class MyEmployee
{
	public MyEmployee() {
		 System.out.println("Default construcotr with MyEmployee");
	}
	
	public MyEmployee(int eno) {
		 System.out.println(" Super class eno value"+eno);
	}
}

public class Employee5 extends MyEmployee{
	int eno; //100
	String ename; //Ravi
	double sal; //55000 	
	  Employee5(){
		  System.out.println("Default Constructor");
	  }
	           //   100         Ravi        55000
	  Employee5(int eno,String ename,double sal){
		  super(eno);
		  this.eno=eno;
		  this.ename=ename;
		  this.sal=sal; 	  } 
	  
	  public void display() {
		  System.out.println("Employee No :"+eno);
		  System.out.println("Employee Name :"+ename);
		  System.out.println("Employee Sal :"+sal);
	  } 
	public static void main(String[] args) { 		
		new Employee5(); 		
		Employee5 emp3=new Employee5(100, "Ravi",55000);
		emp3.display();  
	} 
}

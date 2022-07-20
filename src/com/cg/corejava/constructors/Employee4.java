package com.cg.corejava.constructors;


public class Employee4 {
	int eno; //100
	String ename; //Ravi
	double sal; //55000 	
	  Employee4(){
		  System.out.println("Default Constructor");
	  }
	           //   100         Ravi        55000
	  Employee4(int eno,String ename,double sal){
		  this.eno=eno;
		  ename=ename;
		  this.sal=sal; 	  } 
	  
	  public void display() {
		  System.out.println("Employee No :"+eno);
		  System.out.println("Employee Name :"+ename);
		  System.out.println("Employee Sal :"+sal);
	  } 
	public static void main(String[] args) { 		
		new Employee4(); 		
		Employee4 emp3=new Employee4(100, "Ravi",55000);
		emp3.display();  
	} 
}

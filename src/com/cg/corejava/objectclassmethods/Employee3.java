package com.cg.corejava.objectclassmethods;
public class Employee3 {
	int eno; //100
	String ename; //Ravi
	double sal; //55000 	
	  Employee3(){
		  System.out.println("Default Constructor");
	  }
	           //   100         Ravi        55000
	  Employee3(int eno1,String ename1,double sal1){
		  eno=eno1;
		  ename=ename1;
		  sal=sal1; 	  } 
	  
	  public void display() {
		  System.out.println("Employee No :"+eno);
		  System.out.println("Employee Name :"+ename);
		  System.out.println("Employee Sal :"+sal);
	  } 
	  
	  @Override
	public String toString() {
		
		return eno+ename+sal;
	}
	public static void main(String[] args) { 		
		new Employee3(); 		
		Employee3 emp3=new Employee3(100, "Ravi",55000);
		
		
		//emp3.display();  
		System.out.println(emp3);
	} 
}

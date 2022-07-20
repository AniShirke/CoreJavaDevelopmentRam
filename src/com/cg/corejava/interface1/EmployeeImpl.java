package com.cg.corejava.interface1;
//d.	Our class can implement more than one interface (we can achieve multiple inheritance 
//through  interface)  
public class EmployeeImpl  implements EmployeeDetails,EmployeeHelthDetails{
	@Override
	public void employeeInfo() {
		System.out.println("Bangalore");
		System.out.println("JavaDeveloper"); 	}
	@Override
	public void empHelthDetails() {
		 System.out.println("His helth Condition Good"); 		
	}
	public void myData() {
		System.out.println("Local Data");
	}		
	public static void main(String[] args) {		
		EmployeeImpl emp=new EmployeeImpl();
		emp.empHelthDetails();
		emp.employeeInfo();
		emp.myData(); 		
	} }

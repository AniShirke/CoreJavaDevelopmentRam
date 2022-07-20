package com.cg.corejava.javabeans;

public class EmployeeImpl {

	public static void main(String[] args) {
		
		EmployeeBean emp=new EmployeeBean(); //HAS-A
		
		//Set the data into EmployeeBean
		emp.setEno(100);
		emp.setEname("Ramesh");
		emp.setSal(5500);
		
		
		// get the data form EmployeeBean Object
		
		System.out.println("Employiee No :"+emp.getEno());
		System.out.println("Employee Name :"+emp.getEname());
		System.out.println("employee Sal :"+emp.getSal());
		
		
		

	}

}

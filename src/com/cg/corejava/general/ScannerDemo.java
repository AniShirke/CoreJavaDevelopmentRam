package com.cg.corejava.general;

import java.util.Scanner;
public class ScannerDemo {
	
	public static void main(String arg[]) {
		Scanner sc=new Scanner(System.in);
		
		int eno;
		String ename;
		
		System.out.println("Enter Employee NO:");
		eno=sc.nextInt();
		System.out.println("Enter Employee Name :");
		ename=sc.next();
		
		System.out.println("Employee No :"+eno);
		System.out.println("Employee Name :"+ename);
		
	}

}

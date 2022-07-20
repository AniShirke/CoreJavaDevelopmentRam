package com.cg.corejava.javabeans;

import java.util.Scanner;

public class StudentImpl {

	public static void main(String[] args) {
		
		StudentBean stu=new StudentBean();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student no :");
		int sno=sc.nextInt();
		
		System.out.println("Enter Student Name:");
		String sname=sc.next();
		System.out.println("Enter Student Gropu");
		String group=sc.next();
				
		stu.setSno(sno);
		stu.setSname(sname);
		stu.setGroup(group);
		
		
		System.out.println("Student Sno :"+stu.getSno());
		System.out.println("Student sname :"+stu.getSname());
		System.out.println("Student Group :"+stu.getGroup());
	}

}

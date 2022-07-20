package com.cg.corejava.oops;
public class Student {
	int sno=10;
	String sname="Ramesh";
	int sub1=90;
	int sub2=85;
	int sub3=95;
	int total;
	public void studentDetails()
	{		System.out.println("Student sno :"+sno);
		System.out.println("Student name :"+sname);
		System.out.println("Sub 1:"+sub1);
		System.out.println("Sub 2:"+sub2);
		System.out.println("Sub 3:"+sub3);		
	}
	public void totalMarks()
	{	total=sub1+sub2+sub3; //b.l
		System.out.println("Total Marks :"+total);	
	}

	public static void main(String[] args) {
		Student s1=   new Student();
		s1.studentDetails();
		s1.totalMarks(); 
	} 
}

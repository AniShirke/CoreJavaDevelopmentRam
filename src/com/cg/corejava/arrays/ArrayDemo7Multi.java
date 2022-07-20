package com.cg.corejava.arrays;
 

public class ArrayDemo7Multi {

	public static void main(String[] args) {
		String ar[][]= new String[5][5];
		
		
		for(int i=0;i<5;i++) 	 
		
		   for(int j=0;j<5;j++)
		       ar[i][j]=" JAVA  ";
		
						
		
		for(int i=0;i<5;i++)
		{
			System.out.println();
		
		for(int j=0;j<5;j++)
		
		
		System.out.print(" "+ar[i][j]);
	}
	}
}

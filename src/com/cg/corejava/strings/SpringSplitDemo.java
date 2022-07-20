package com.cg.corejava.strings;

public class SpringSplitDemo {

	public static void main(String[] args) {
		 
		String str="Corejava@java8@jdbc";
		
		String[] course=str.split("@");
		
		for(String s:course)
			System.out.println(s);

	}

}

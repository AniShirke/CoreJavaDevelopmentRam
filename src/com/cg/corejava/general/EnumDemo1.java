package com.cg.corejava.general;
public class EnumDemo1 {
	enum News{
		North,East , West,South
	}
	enum Color {
		RED,GREEN,BLUE
	}
	enum Product {
		Laptops,Desktops,Tabs;
	}	
	public static void main(String[] args) {
		News s=News.North;
		System.out.println(s);
		
		Color c=Color.GREEN;
				System.out.println(c);
				Product p=Product.Laptops;
				System.out.println("Product :"+p);

	} 
}

package com.cg.corejava.javabeans;

public class ProductImpl {

	public static void main(String[] args) {
		 // set values through to Constructor
		ProductBean pro=new ProductBean(100,"MacPro",230000);
		
		// Retrive values form ProductBean get method
		
		System.out.println("Product No :"+pro.getPno());
		System.out.println("Product Name :"+pro.getPname());
		System.out.println("product Price :"+pro.getPrice());
	}

}

package com.cg.corejava.abstract1;
abstract  class  Product {
	 abstract public  void newProduct();
	 	 
	 public void allProducts() {
		 System.out.println("Laptops");
		 System.out.println("Desktops");
	 }   }

public class ProductImpl extends Product {
	public  void newProduct() {
		System.out.println("Mac 2021 pro 16in");
		System.out.println("Rs 2,30,000");
		System.out.println("Processor M1");
	} 	
	public void myData() {
		System.out.println("ProductImpl method");
	}
	public static void main(String[] args) {
		ProductImpl product1=new ProductImpl();
		product1.allProducts();
		product1.newProduct();
		product1.myData(); 
	} }

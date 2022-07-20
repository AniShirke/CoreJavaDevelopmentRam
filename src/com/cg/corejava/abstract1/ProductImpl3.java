package com.cg.corejava.abstract1;
abstract  class  Product3 {
	 abstract public  void newProduct();
	 
	 Product3(){
		   System.out.println("defulat constructor for Product3");
	   }
	 
	 public void allProducts() {
		 System.out.println("Laptops");
		 System.out.println("Desktops");
	 }   }
public class ProductImpl3 extends Product3 {
	ProductImpl3() {
		System.out.println("ProductImpl3");
	}
	
	public  void newProduct() {
		System.out.println("Mac 2021 pro 16in");
		System.out.println("Rs 2,30,000");
		System.out.println("Processor M1");
	} 	
	public void myData() {
		System.out.println("ProductImpl method");
	}
	public static void main(String[] args) {
		ProductImpl3 product1=new ProductImpl3();
		product1.allProducts();
		product1.newProduct();
		product1.myData(); 
	} }

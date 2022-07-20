package com.cg.corejava.abstract1;
abstract  class  Product2 {
	 abstract public  void newProduct();
	 
	   Product2(){
		   System.out.println("defulat constructor for Product2");
	   }
	 public void allProducts() {
		 System.out.println("Laptops");
		 System.out.println("Desktops");	 
		 
	 }   }
public class ProductImpl2 extends Product2 {
	public  void newProduct() {
		System.out.println("Mac 2021 pro 16in");
		System.out.println("Rs 2,30,000");
		System.out.println("Processor M1");
	} 	
	public void myData() {
		System.out.println("ProductImpl method");
	}
	public static void main(String[] args) {
		Product2 p2=new ProductImpl2();  		
		
		p2.allProducts();
		p2.newProduct(); 		
	} }

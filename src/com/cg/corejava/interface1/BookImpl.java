package com.cg.corejava.interface1;
interface  Book{
	String countryName="India";
	  public abstract void bookTitle();
	  public void bookAuthor();
	  public void bookPrice();
} 
public class BookImpl   implements Book
{ public  void bookTitle() {
		System.out.println("CoreJava"); }
	  public void bookAuthor() {
		  System.out.println("Our Java class Students");
	  }
	  public void bookPrice() {
		  System.out.println("Rs. 550");
	  }
	  public void myData() {
		  System.out.println("Local methods of BookImp");
	  }
	 public static void main(String arg[]) {
	  
	  BookImpl book1=new BookImpl();
	  book1.bookTitle();
	  book1.bookAuthor();
	  book1.bookPrice();
	  //Local class method
	  book1.myData();    }     }

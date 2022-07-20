package com.cg.corejava.interface1;
//f.	We cant create Object to interface but we create Object to reference to interface
interface  Book2{
	  public abstract void bookTitle();
	  public void bookAuthor();
	  public void bookPrice(); } 
public class BookImpl2   implements Book2
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
		//Cannot instantiate the type Book2
		// Book2 b2=new Book2(); 		 
		 Book2 book2=new BookImpl2();
		  book2.bookTitle();
		  book2.bookAuthor();
		  book2.bookPrice();    
	    }     }

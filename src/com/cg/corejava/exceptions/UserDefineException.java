package com.cg.corejava.exceptions;
  class AgeNotSupportExcetpion extends Exception 
  {
	  AgeNotSupportExcetpion(String message){
		  System.out.println("Hello :"+message);
	  }   }
  
public class UserDefineException {
	
	  int age=15;
	  public void checkData() throws AgeNotSupportExcetpion{
		  if (age<18)
		 throw	  new AgeNotSupportExcetpion("Your Age Not Eligible");
		  else
			  System.out.println("Your Age is Eligible"); 	  
	  }

	public static void main(String[] args) {
		try {
		UserDefineException udf=new UserDefineException();
		udf.checkData(); }
		catch(AgeNotSupportExcetpion e) {
			System.out.println(" I can Handle :"+e);
		}
	} }

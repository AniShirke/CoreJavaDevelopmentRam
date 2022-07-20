package com.cg.corejava.exceptions;
class ProductNotFoundException extends RuntimeException{
		
	ProductNotFoundException(String message){
		System.out.println("Hello :"+message);
	}
}


public class ProductUserDefineException {
	  int pno=102;
	  
	  public void checkData() throws ProductNotFoundException
	  {
		  if(pno>100)
		throw	  new ProductNotFoundException("Product Not Found");
		  else
			  System.out.println("Products are there");
	  }
	public static void main(String[] args) {
		try {
		ProductUserDefineException pd=new ProductUserDefineException();
		pd.checkData(); 
		}
		catch(ProductNotFoundException e) {
			System.out.println("I can handle :"+e);
		}
	}

}

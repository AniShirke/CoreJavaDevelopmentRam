package com.cg.corejava.oops;
public class UserLoginDetails {
	   public void userLogin(String uname,String pass) {
		   System.out.println("Username :" +uname);
		   System.out.println("Password :"+pass);
	   }
	   public void userLogin(int mobile,String pass) {
		   System.out.println("MobileNo :" +mobile);
		   System.out.println("Password :"+pass);
	   }
       
	   public void userLogin(String uname,String pass,String capcha) {
		   System.out.println("Username :" +uname);
		   System.out.println("Password :"+pass);
		   System.out.println("Capcha :"+capcha);
	   }
	   
	   public int  userLogin(int i)
	   {
		    return i;
	   }
	public static void main(String[] args) {
		
	UserLoginDetails user=new UserLoginDetails();
		user.userLogin("Ramesh","Ramesh123");
		user.userLogin(999999,"raju");
		user.userLogin("krishna", "krishna123","Laptop");
	}

}

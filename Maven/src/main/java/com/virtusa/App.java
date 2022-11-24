package com.virtusa;

import java.util.ResourceBundle;

public class App {

   public int userLogin(String in_user,String in_pwd) {
	   ResourceBundle rb=ResourceBundle.getBundle("config");
	   String userName=rb.getString("username");
	   String password=rb.getString("passeord");
	   
	   if(in_user.equals(userName) && in_pwd.equals(password))
		   return 1;
	   else
		   return 0;
   }
} 


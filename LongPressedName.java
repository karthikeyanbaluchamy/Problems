package com.study.problems;

public class LongPressedName {
	
	 public boolean isLongPressedName(String name, String typed) {
		 
		 int n=0,t=0;
		 
		 while(n<name.length() && t<typed.length()) {
			 
			 if(name.charAt(n) == typed.charAt(t)) {
				 n++;
				 t++;
			 }else if(n>0 && name.charAt(n-1)==typed.charAt(t)) {
				 t++;
			 }else {
				 return false;
			 }
		 }
		 
		 return true;
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  LongPressedName nm = new LongPressedName();
  boolean isChk=nm.isLongPressedName("pyplrz"
		 , "ppyypllr");
		  
		  
		  
		  //"leelee", "lleeelee");

  
  System.out.println(isChk);
	}

}

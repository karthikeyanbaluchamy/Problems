package com.study.problems;

public class ImplementStrStr {

	 public int strStr(String haystack, String needle) {

	        if(needle ==null || haystack == null || needle.isEmpty())
				   return 0;
			   int sec=needle.length();
			   if(sec>haystack.length())
				   return -1;
	        
	        for(int i=0,j=sec;j<=haystack.length();i++,j++){
	            if(haystack.substring(i,j).equals(needle)){
	                return i;
	            }
	        }
	        
	        
		        
		        return -1;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementStrStr iss = new ImplementStrStr();
	
		System.out.println(iss.strStr("a","a"));

	}

}

package com.study.problems;

public class RepeatedString {

	
	public boolean repeatedSubstringPattern(String s) {
	 if (s == null || s.length() == 1) {
         return false;
     }
     for (int i = 1; i < s.length();i++) {
         if (s.length() % i == 0) {
             String pattern = s.substring(0,i);
             String arr[] = s.split(pattern);
             if (arr.length == 0) {
                 return true;
             }
         }
     }
     return false;

	}
	
	  public int repeatedStringMatch(String A, String B) {
	        
		/*
		 * String str=A; int i=1; StringBuilder S = new StringBuilder(A);
		 * for(;str.length()<=B.length();i++) {
		 * 
		 * str = str+A; if(str.indexOf(B)>=0) return i; if((str+A).indexOf(B)>=0) return
		 * i+1; } return -1;
		 */
		  
		  int q = 1;
	        StringBuilder S = new StringBuilder(A);
	        for (; S.length() < B.length(); q++)
	        	S.append(A);
	        if (S.indexOf(B) >= 0) return q;
	        if (S.append(A).indexOf(B) >= 0) return q+1;
	        return -1;
	    }
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RepeatedString reps= new RepeatedString();
		
	//	System.out.println(reps.repeatedSubstringPattern("abcabcabcabc"));
		//System.out.println(reps.repeatedStringMatch("abcd", "cdabcdab"));
		String sr="abab";
		System.out.println("abcd".indexOf("cdabcdab"));
		
		

	}

}

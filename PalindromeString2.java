package com.study.problems;

public class PalindromeString2 {

	
public boolean validPalindrome(String s) {
	int start=0; 
	int end=s.length()-1;
	
	while(start <end) {
		if(s.charAt(start) != s.charAt(end)) {
			
			if(ispalindrome(s, start+1, end))
			return true;
			
			return ispalindrome(s, start, end-1);
		}
		start++;
		end--;
	}
	

     return true;   
    }

private boolean ispalindrome(String s,int lf,int rt) {

	while(lf <rt) {
		
		if(s.charAt(lf) !=s.charAt(rt))
			return false;
		
			lf++;
		    rt--;
		
	}
	
	return true;

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	PalindromeString2 pd = new PalindromeString2();
	
	System.out.println(pd.validPalindrome("abbbca"));

	}

}

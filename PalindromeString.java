package com.study.problems;

public class PalindromeString {
	
public boolean isPalindrome(String s) {
	
	int i=0;
	int j=s.length()-1;
	
	while(i<j) {
		if(!Character.isLetterOrDigit(s.charAt(i))) {
			i++;
		}
		else if(!Character.isLetterOrDigit(s.charAt(j))) {
			j--;
		}
		else {
			if(Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(j))) {
				return false;
			}
			i++;
			j--;
		}
	}
	
	return true;
			
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PalindromeString pl = new PalindromeString();
boolean ischk=pl.isPalindrome("A man, a plan, a canal: Panama");
System.out.println(ischk);
	}

}

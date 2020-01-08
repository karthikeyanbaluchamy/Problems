package com.study.problems;

public class LongestRepatingCharacterReplacment {
	
	 public int characterReplacement(String s, int k) {
		 
		 int i=0;
		 int maxcnt=0;
		 while(i<s.length()) {
			 int cnt=0;
			 char c=s.charAt(i);
			 int j=i+1;
			 int val=1;
			 while(cnt<=k && j<s.length()) {
				 if(c !=s.charAt(j)) {
					 cnt++;
				 }
				 val++;
				 j++;
				 
			 }
			 val=(cnt>k)?val-1:val;
			 if(val>maxcnt) {
				 maxcnt=val;
			 }
			 i++;
		 }
	     
		 System.out.println(maxcnt);
			 return maxcnt;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LongestRepatingCharacterReplacment lr = new LongestRepatingCharacterReplacment();
		lr.characterReplacement("ABBB", 2);
	}

}

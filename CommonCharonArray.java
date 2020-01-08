package com.study.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class CommonCharonArray {

	  public List<String> commonChars(String[] A) {
		  ArrayList<String> ll = new ArrayList<String>();
		  HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		  for(int i=0;i<A[0].length();i++)
			  hm.put(A[0].charAt(i), hm.getOrDefault(A[0].charAt(i), 0)+1);
		  
		 for(int i=1;i<A.length;i++) {
			  HashMap<Character, Integer> inner = new HashMap<Character, Integer>();
			 for(int j=0;j<A[i].length();j++) {
				 char curr=A[i].charAt(j);
				 if(hm.containsKey(curr)) {
					 int val=Math.min(hm.get(curr),inner.getOrDefault(curr, 0)+1 );
					 inner.put(curr, val);
				 }
			 }
			 
			 hm=inner;
			// System.out.println(hm);
		 }
		 
		 for(char c:hm.keySet()) {
			 for(int i=0;i<hm.get(c);i++) {
				 ll.add(String.valueOf(c));
			 }
		 }
		 
		// System.out.println(ll);
		  
		  return ll;
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr= {"bella","label","roller"};
			
			//{"cool","lock","cook"};
		CommonCharonArray ca = new CommonCharonArray();
		ca.commonChars(arr);

	}

}

package com.study.problems;

import java.util.Arrays;
import java.util.stream.IntStream;

public class LongestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String arr[]= {"flow","fl","float"};
		
		//System.out.println("flight".indexOf("fl"));
		
		String word=arr[0];
		
		for(int i=1;i<arr.length;i++) {
			
			while(arr[i].indexOf(word) !=0) {
				word = word.substring(0,word.length()-1);
			}
		}
		
		System.out.println(word);
		String prefix ="";
		/*
		 * for(int i=0;i<arr[0].length();i++) { int val=i; String
		 * compare=arr[0].substring(0,val);
		 * 
		 * if(Arrays.stream(arr).allMatch(e -> e.substring(0,val).equals(compare))) {
		 * prefix=compare; } else { break; } }
		 */
		System.out.println(prefix);
	}

}

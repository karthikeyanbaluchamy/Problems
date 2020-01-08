package com.study.problems;

import java.util.Arrays;

public class PermutationStr {
public boolean checkInclusion(String s1, String s2) {
	
	int arr[]=new int[26];
	int arr1[]=new int[26];
	
	for(int i=0;i<s1.length();i++) {
		arr[s1.charAt(i)-'a']++;
		arr1[s2.charAt(i)-'a']++;
	}
	
	if(Arrays.equals(arr, arr1))
		return true;
	
	int i = 0;
    int j = s1.length();
    
    while(j<s2.length()) {
    	arr1[s2.charAt(j)-'a']++;
    	arr1[s2.charAt(i)-'a']--;
    	
    	if(Arrays.equals(arr, arr1))
    		return true;
    	
    	j++;
    	i++;
    }
   
	return false;
	    
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
PermutationStr ps=new PermutationStr();
ps.checkInclusion("ab", "eidboaoo");
	}

}

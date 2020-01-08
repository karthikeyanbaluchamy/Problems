package com.study.problems;

import java.util.Arrays;
import java.util.List;

import com.scp.hackerrank.longestSrtring;

public class LongestSubStringDic {
	
public String findLongestWord(String s, List<String> d) {
        String maxstr="";
        
        for(String str:d){        	
            if(checkStr(s, str)) {            	
            	if(str.length()>maxstr.length() || (str.length() == maxstr.length() && str.compareTo(maxstr)<0)) {
            		maxstr=str;
            	}
            }
            
        }
        
        return maxstr;
        
    }

public boolean checkStr(String s1,String s2) {
	int j=0;
	
	for(int i=0;i<s1.length() && j<s2.length();i++) {
		if(s1.charAt(i) == s2.charAt(j)) {
			j++;
		}
	}
	return j==s2.length() ;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LongestSubStringDic sub = new LongestSubStringDic();
		
		List<String> ll =Arrays.asList("a","b","c");
		
		System.out.println(sub.findLongestWord("abpcplea", ll));

	}

}

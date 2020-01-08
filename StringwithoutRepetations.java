package com.study.problems;

import java.util.HashSet;
import java.util.Set;

public class StringwithoutRepetations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String input="abcabcbb";

int i=0,j=0, ans=0;
int n=input.length();
Set<Character> s=new HashSet<Character>();
while(i<n && j<n) {
	if(!s.contains(input.charAt(j))) {
		s.add(input.charAt(j++));
		ans =Math.max(ans, j-i);
	}
	else {
		s.remove(input.charAt(i++));
	}
}

System.out.println(ans);
	}

}

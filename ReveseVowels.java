package com.study.problems;

import java.util.HashSet;

public class ReveseVowels {
	
public String reverseVowels(String s) {
	HashSet<Character> hs = new HashSet<Character>();
	hs.add('a');
	hs.add('e');
	hs.add('i');
	hs.add('o');
	hs.add('u');
	hs.add('A');
	hs.add('E');
	hs.add('I');
	hs.add('O');
	hs.add('U');
	
	
	int i=0,j=s.length()-1;
	
	char[]  ch =s.toCharArray();
	
	while(i <j) {
		
		if(hs.contains(ch[i]) && hs.contains(ch[j])) {
			char temp=ch[i];
			ch[i] =ch[j];
			ch[j]=temp;
			i++;
			j--;
		}
		 if(!hs.contains(ch[i])) {
			i++;
		} if(!hs.contains(ch[j])) {
			j--;
		}
		
	}
	
	return String.copyValueOf(ch);
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReveseVowels rv = new ReveseVowels();
		
		System.out.println(rv.reverseVowels(" apG0i4maAs::sA0m4i0Gp0"));

	}

}

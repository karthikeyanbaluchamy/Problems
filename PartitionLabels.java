package com.study.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PartitionLabels {
	
public List<Integer> partitionLabels(String S) {
        List<Integer> ll = new ArrayList<Integer>();
        HashMap<Character, Integer>  hm = new HashMap<Character, Integer>();
        
        for(int i=0;i<S.length();i++) {
        hm.put(S.charAt(i), i);
        }
        
      
        int j=0; int nextval=0;
        for(int i=0;i<S.length();i++) {
        	
        	j =Math.max(j, hm.get(S.charAt(i)));
        	nextval++;
        	if(i ==j) {
        		System.out.println(nextval);
        		nextval =0;
        	}
        	
        }
        
        System.out.println(ll);
        
        return ll;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PartitionLabels pl = new PartitionLabels();
		
		pl.partitionLabels("ababcbacadefegdehijhklij");

	}

}

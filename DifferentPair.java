package com.study.problems;

import java.util.HashMap;
import java.util.Map;

public class DifferentPair {
	 public int findPairs(int[] nums, int k) {
	        
	        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
	        for(int i=0;i<nums.length;i++){
	            hm.put(nums[i],hm.containsKey(nums[i])?(hm.get(nums[i])+1):1);
	        }
	        int cnt=0;
	        for(Map.Entry<Integer, Integer> it:hm.entrySet()) {
	        	
	       int val= 	k+it.getKey();
	        	
	        	if(k>0 && hm.containsKey(val)) {
	        		cnt++;
	        	}
	        	else if(k == 0 && hm.get(it.getKey())>=2 ) {
	        		cnt++;
	        	}
	        }
	        
	        System.out.println(cnt);
	       return cnt;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
DifferentPair dp = new DifferentPair();
int nums[]= {3, 1, 4, 1, 5};

//{3, 1, 4, 1, 5};
dp.findPairs(nums, 0);
	}

}

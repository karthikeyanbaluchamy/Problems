package com.study.problems;

import java.util.Arrays;

public class RemoveDuplicates {
	
	 public int removeDuplicates(int[] nums) {
	        
	        int pos=2;
	        
	        for(int i=2;i<nums.length;i++){
	        	
	            
	            if(nums[i] != nums[pos-2]){
	       
	                nums[pos] =nums[i];
	                pos++;
	                
	            }
	        }
	        System.out.println(Arrays.toString(nums));
	        return pos;
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RemoveDuplicates rm = new RemoveDuplicates();
		
		
		int[] nums = {0,0,1,1,1,1,2,3,3};
		
		System.out.println(rm.removeDuplicates(nums));
		
		

	}

}

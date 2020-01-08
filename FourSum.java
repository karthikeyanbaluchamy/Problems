package com.study.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
	
	 public List<List<Integer>> fourSum(int[] nums, int target) {
		 List<List<Integer>> ll = new ArrayList<List<Integer>>(); 
		 
		 if(nums.length <4) {
			 return ll;
		 }
		 
		 Arrays.parallelSort(nums);
		 
		 for(int i=0;i<nums.length-3;i++) {
			 if(i>0 && nums[i] == nums[i-1])
				 continue;
			 int sum=target-nums[i];
			 for(int j=i+1;j<nums.length-2;j++) {
				 if(j>i+1 && nums[j] == nums[j-1])
					 continue;
				 int k=j+1;
				 int l=nums.length-1;
				 while(k<l) {
					 if(k>j+1 && nums[k] == nums[k-1]) {
						 k++;
						 continue;
					 }
					 if(l<nums.length-1 && nums[l]==nums[l+1]) {
						 l--;
						 continue;
					 }
					 int sum1=nums[j]+nums[k]+nums[l];
					 
					 if(sum == sum1) {
						 ll.add(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));
						 k++;
						 l--;
					 }
					 else if(sum1<sum) {
						 k++;
					 }
					 else {
						 l--;
					 }
				 }
				 
			 }
		 }
		 
		 return ll;
		
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FourSum fs =new FourSum();
		
	
				
		int nums[] = 	{-1,2,2,-5,0,-1,4};
	//{1, 0, -1, 0, -2, 2};
		
		System.out.println(fs.fourSum(nums, 3));

	}

}

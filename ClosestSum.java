package com.study.problems;

import java.util.Arrays;

public class ClosestSum {
	
	public int threeSumClosest(int[] nums, int target) {
		
		if(nums.length <3) {
			return 0;
		}
		Arrays.parallelSort(nums);
		int closeSum=nums[0]+nums[1]+nums[2];
		
		
		for(int i=0;i<nums.length-2;i++) {
			int j=i+1;
			int k=nums.length-1;
			while(j<k) {
				int sum=nums[i]+nums[j]+nums[k];
				if(Math.abs(sum-target)<Math.abs(closeSum-target)) {
					closeSum=sum;
				}
				
				if(sum<target) {
					j++;
				}
				else if(sum >target) {
					k--;
				}
				else {
					return target;
				}
			}
			
		}
		
		return closeSum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[] = {-3,-2,-5,3,-4};
				
		int tar=1;
		ClosestSum cs=new ClosestSum();
		//cs.threeSumClosest(nums, -1);
		System.out.println(cs.threeSumClosest(nums, -1));
	}

}

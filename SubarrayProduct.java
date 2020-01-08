package com.study.problems;

public class SubarrayProduct {
	

	
	
	public int numSubarrayProductLessThanK(int[] nums, int k) {
		
		int product=1;
		int cnt=0;
		int left=0;
		for(int i=0;i<nums.length;i++) {
			product*=nums[i];
			while(product>=k) {
				product/=nums[left];
				left++;
			}
			cnt+=i-left+1;
		}
		return cnt;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SubarrayProduct  sp = new SubarrayProduct();
int nums[]= {10,9,10,4,3,8,3,3,6,2,10,10,9,3};
int k=19;
sp.numSubarrayProductLessThanK(nums, k);
	}

}

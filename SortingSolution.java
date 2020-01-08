package com.study.problems;

import java.util.Arrays;

public class SortingSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int nums[]= {2,0,2,1,1,0};
  
  int cnt[]=new int[3];
  for(int i=0;i<nums.length;i++) {
	  int val=nums[i];
	  cnt[val]++;
  }
  
  int n=0;
  for(int i=0;i<cnt.length;i++) {
	  int r=cnt[i];
	  
	  while(r>0) {
		  nums[n]=i;
		  r--;
		  n++;
	  }
  }
  System.out.println(Arrays.toString(nums));
	}

}

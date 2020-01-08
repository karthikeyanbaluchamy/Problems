package com.study.problems;

import java.util.HashMap;

public class BinarySubarray {
	
	
	/*
	 * public int numSubarraysWithSum(int[] A, int S) {
	 * 
	 * int count =0;
	 * 
	 * for(int i=0;i<A.length;i++){ int j=i; int ct=0; int sum=0; while(sum<=S &&
	 * j<A.length){ sum+=A[j];
	 * 
	 * if(sum == S){ ct++; }
	 * 
	 * if(sum!=0 && sum >S){ break; } j++; }
	 * 
	 * count+=ct; } System.out.println(count); return count; }
	 */

	public int numSubarraysWithSum(int[] A, int S) {
		
		int count=0;
		int sum=0;
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for(int i=0;i<A.length;i++) {
			sum+=A[i];
			if(sum == S) {
				count+=1;
			}
			if(hm.containsKey(sum-S)) {
				count+=hm.get(sum-S);
			}
			
			hm.put(sum,hm.getOrDefault(sum, 0)+1 );
			
		}
		System.out.println(count);
		return count;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinarySubarray bs = new BinarySubarray();
		
		int arr[]= {0,0,0,0,0};
		
		bs.numSubarraysWithSum(arr, 0);

	}

}

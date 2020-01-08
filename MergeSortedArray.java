package com.study.problems;

import java.util.Arrays;

public class MergeSortedArray {
	
	
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		
		int[] arr = new int[m+n];
		
		int j=0;
		int m1=0;
		int n1=0;
		
		while(m1<m && n1<n) {
			if(nums1[m1]<nums2[n1]) {
				arr[j++]=nums1[m1++];
			}
			else {
				arr[j++]=nums2[n1++];
			}
		}
		
		while(n1<n) {
			arr[j++]=nums2[n1++];
		}
		
		while(m1<m) {
			arr[j++]=nums1[m1++];
		}
	for(int i=0;i<arr.length;i++) {
		nums1[i]=arr[i];
	}


		 
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MergeSortedArray ma = new MergeSortedArray();
		int m[] = {1};
		int n[]= {};
		ma.merge(m, 1, n, 0);
		
		
		System.out.println(Character.isAlphabetic(','));
		System.out.println(Arrays.toString(m));

	}

}

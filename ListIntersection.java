package com.study.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListIntersection {
	
	 public int[][] intervalIntersection(int[][] A, int[][] B) {
		 
		 int i=0;
		 int j=0;
		 List<int []>  ll = new ArrayList<int []>();
		 
		 while(i<A.length && j<B.length) {
			 
			 int high=Math.max(A[i][0],B[j][0]);
			 int low=Math.min(A[i][1], B[j][1]);
			 if(high <= low)
			 ll.add(new int[] {high,low});
			 
			 if(A[i][1]<B[j][1]) {
				 i++;
			 }else  {
				 j++;
			 }
			 
		 }
	        
	  return ll.toArray(new int[ll.size()][]); 
	  }
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] A = {{0,2},{5,10},{13,23},{24,25}};
		int[][]  B = {{1,5},{8,12},{15,24},{25,26}};
		
		ListIntersection li = new ListIntersection();
	//.intervalIntersection(A, B);
		
		System.out.println(Arrays.deepToString(li.intervalIntersection(A, B)));

	}

}

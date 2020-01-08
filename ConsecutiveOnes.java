package com.study.problems;

public class ConsecutiveOnes {
	 public int longestOnes(int[] A, int K) {
		 int i=0;
		 int j=0;
		 int max=0;
		 while(i<A.length) {
			 
			 j=i;
			 int k1=K;
			 int ct=0;
			 while(k1>=0 && j<A.length) {
				 if(A[j] ==0) {
					 k1--;
				 }
				 j++;
				 ct++;
			 }
			 ct=(k1<0)?ct-1:ct;
			max= Math.max(max, ct);
			 i++;
		 }
	        
	   return max;
	   }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A[] = {1,1,1,0,0,0,1,1,1,1,0};
		ConsecutiveOnes one = new ConsecutiveOnes();
		
		System.out.println(one.longestOnes(A, 2));

	}

}

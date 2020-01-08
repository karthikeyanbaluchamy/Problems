package com.study.problems;

import java.util.Arrays;

public class SquareArray {
	
public int[] sortedSquares(int[] A) {
        
        int len=A.length;
        int res[]=new int[len];
        int rig=0;
        
        while(rig <len && A[rig] <0){
            rig++;
        }
        int left=rig-1;
        int ref=0;
        while(left >=0 && rig<len){
        
            if(A[left]*A[left] < A[rig]*A[rig]){
                res[ref++]=A[left]*A[left];
                left--;
            }
          else{
              res[ref++]=A[rig]*A[rig];
              rig++;
          }
        }
        
        while(left>=0){
            res[ref++]=A[left]*A[left];
            left--;
        }
        while(rig<len){
            res[ref++]=A[rig]*A[rig];
            rig++;
        }
       return res; 
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SquareArray sa = new SquareArray();
		
		int A[]= {-4,-1,0,3,10};
		
System.out.println(Arrays.toString(sa.sortedSquares(A)));

	}

}

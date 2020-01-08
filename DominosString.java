package com.study.problems;

import java.util.Arrays;

public class DominosString {

    public String pushDominoes(String dominoes) {
    	int len=dominoes.length();
    	int val[] = new int[len];
    	int cal=0;
    	
    	for(int i=0;i<len;i++) {
    		
    		if(dominoes.charAt(i) =='R') {
    			cal=len;
    		}
    		else if(dominoes.charAt(i)=='L') {
    			cal=0;
    		}else {
    			cal = Math.max(cal-1, 0);
    		}
    		val[i] +=cal;
    	}
    	
    	
    	for(int j=len-1;j>=0;j--) {
    		
    		if(dominoes.charAt(j) =='L') {
    			cal =len;
    		}else if(dominoes.charAt(j) =='R') {
    			cal =0;
    		}
    		else {
    			cal =Math.max(cal-1, 0);
    		}
    		val[j]-=cal;
    	}
    	StringBuilder sb = new StringBuilder();
    	
    	for(int k:val) {
    	char c=(k>0)?'R':(k<0)?'L':'.';
    		sb.append(c);
    	}
    	System.out.println(Arrays.toString(val));
      return sb.toString();  
    }
    
    public int uniquePaths(int m, int n) {
    	// initialize dp array
    	int[][] dp = new int[m][n];

    	// fill first element in rows as 1s
    	for (int i = 0; i < m; i++) {
    		dp[i][0] = 1;
    	}

    	// fill first element in columns as 1s
    	for (int i = 0; i < n; i++) {
    		dp[0][i] = 1;
    	}

    	// starting at (1,1), iterate thru array and add from pre-existing path counts
    	for (int i = 1; i < m; i++) {
    		for (int j = 1; j < n; j++) {
    			// this value = upper + left
    			dp[i][j] = dp[i-1][j] + dp[i][j-1];
    		}
    	}

    	// result will be in bottom right corner
    	return dp[m-1][n-1];
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
DominosString ds = new DominosString();
//System.out.println(ds.pushDominoes(".L.R...LR..L.."));

System.out.println(ds.uniquePaths(7, 3));
	}

}

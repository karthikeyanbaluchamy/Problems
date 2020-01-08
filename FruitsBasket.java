package com.study.problems;

import java.util.HashMap;

public class FruitsBasket {
	
    public int totalFruit(int[] tree) {
    	
    	HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
    	int max=0;
    	int i=0;
    	int j=0;
    	
    	while(i<tree.length) {
    		if(hm.size()<=2) {
    			hm.put(tree[i], hm.getOrDefault(tree[i], 0)+1);
    			
    			if(hm.size()<3) {
    				max =Math.max(max, 1+i-j);
    			}
    			i++;
    		}
    		else {
    			hm.put(tree[j], hm.get(tree[j])-1);
    			if(hm.get(tree[j]) ==0) {
    				hm.remove(tree[j]);
    			}
    			j++;
    		}
    	}
    	
    	System.out.println(max);
    	return max;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FruitsBasket fb = new FruitsBasket();
		
		int arr[]= {3,3,3,1,2,1,1,2,3,3,4};
      
		fb.totalFruit(arr);
	}

}

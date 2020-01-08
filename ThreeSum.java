package com.study.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
	
	List<List<Integer>>  ll =new ArrayList<List<Integer>>();
public List<List<Integer>> threeSum1(int[] nums) {
	//boolean[] visited =new boolean[nums.length];

	//dfs(0,0,new ArrayList<Integer>(),nums);
	if(nums.length <3) {
		return ll;
	}
	Arrays.parallelSort(nums);
	
	for(int i=0;i<nums.length-2;i++) {
		if(i>0 && nums[i] == nums[i-1])
			continue;
		int target=0-nums[i];
		int j=i+1;
		int k=nums.length-1;
		
		while(j<k) {
			int actualSum=nums[j]+nums[k];
			if(target == actualSum) {
				ll.add(Arrays.asList(nums[i],nums[j],nums[k]));
				
				while(j<k && nums[j] ==nums[j+1]) {
					j++;
				}
				while(j<k && nums[k] == nums[k-1]) {
					k--;
				}
				j++;
				k--;
			}
			else if(actualSum < target) {
				j++;
			}
			else {
				k--;
			}
			
		}
	}
	return ll;
        
    }

public void dfs(int index,int total,List<Integer> sl,int[] nums) {
	if(total ==0 && sl.size() ==3) {
		System.out.println(sl);
		ll.add(new ArrayList<Integer>(sl));
		return;
	}
	if(sl.size() == 3)
		return;
	
	for(int i=index;i<nums.length;i++) {
		if(i>index && nums[i] == nums[i-1]) {
			continue;
		}
		
		sl.add(nums[i]);
	//	visited[i] = true;
		dfs(i+1,total+nums[i],sl,nums);
	//	visited[i]=false;
		sl.remove(sl.size()-1);
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ThreeSum th=new ThreeSum();
int nums[] = {-1, 0, 1, 2, -1, -4};
//th.threeSum1(nums);
System.out.println(th.threeSum1(nums));
	}

}

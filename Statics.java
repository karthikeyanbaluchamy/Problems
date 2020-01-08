package com.study.problems;

import java.util.Arrays;

public class Statics {
	
	   public double[] sampleStats(int[] count) {
		   
		   int min=255;
		   int max=0;
		   int sum=0;
		   int total=0;
		   int mode=0;
		   int max1=0;
		   for(int i=0;i<count.length;i++) {
			   
			   sum+= i*count[i];
			   total+=count[i];
			   if(count[i]!=0) {
			   if(count[i]<min){
				  min =i;
			   }
			   if(count[i]>max) {
				   max=i;
			   }
			   }
			   
			   if(count[i]>max1) {
				   max1=count[i];
				   mode=i;
				   
				   
			   }
		   }
		   
		   int left=0,right=count.length-1;
		   
		   while(left<right) {
			   
			   while(count[left] ==0) {
				   left++;
			   }
			   while(count[right] ==0) {
				   right--;
			   }
			   
			   if(count[left] == count[right]) {
				   left++;
				   right--;
			   }
			   else if(count[right]>count[left]) {
				   count[right]-=count[left];
				   left++;
			   }else {
				   count[left]-=count[right];
				   right--;
			   }
		   }
		   
	    
		 
		   
		   return new double[]{min,max,(1.0*sum)/total,((left+right)*1.0)/2,mode};
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Statics ss = new Statics();
		
		int count[]= {0,1,3,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		
		//ss.sampleStats(count);
		
		System.out.println(Arrays.toString(ss.sampleStats(count)));
	}

}

package com.study.problems;

public class StringAtoi {
	
	public int myAtoi(String str) {
        str = str.trim();
        int cur = 0;
        int flag = 1;
   if(str.isEmpty())
	   return 0;
  
    if(!Character.isDigit(str.charAt(cur))) {
        	if(str.charAt(cur) =='-') {
        		flag =-1;
        		cur++;
        	}
        	else if(str.charAt(cur) =='+') {
        		cur++;
        	}
        	else {
        		return 0;
        	}
    }
        long ans=0;
        for(;cur<str.length();cur++) {
        	if(Character.isDigit(str.charAt(cur))) {
        		ans=ans*10;
        		ans+=str.charAt(cur)-'0';
        		
        		if (ans * flag > Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                }
                if (ans * flag < Integer.MIN_VALUE) {
                    return Integer.MIN_VALUE;
                }
        	}
        	else {
        		break;
        	}
        }
   
   
                 
         return (int)ans*flag;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringAtoi atoi=new StringAtoi();
System.out.println(atoi.myAtoi("9223372036854775808"));
	}

}

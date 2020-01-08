package com.study.problems;

public class Reverseintegers {

	public int reverse(int x) {
        int sign =(x<0)?-1:1;
        x =(x<0)?(x*sign):x;
        long ans=0;
        while(x>0){
            ans=(ans*10)+(x%10);
        x/=10;
            if (ans  > Integer.MAX_VALUE) {
                    return 0;
                }
        }
        
        return sign*(int)ans;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reverseintegers ri =new Reverseintegers();
		ri.reverse(1534236469);

	}

}

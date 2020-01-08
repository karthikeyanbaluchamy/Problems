package com.study.problems;

import java.util.HashMap;
import java.util.Map;

public class RomanInt {
	
	static Map<Character, Integer> map = new HashMap() {
        {
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }
    };

	
public int romanToInt(String s) {
	int num=0;
	int preVal=0;
        for(int i=s.length()-1;i>=0;i--) {
        	int curVal=map.get(s.charAt(i));       	
        	num=(preVal>curVal)?(num-curVal):(num+curVal);
        	preVal=curVal;
        	
        }
        
        return num;
    }
int nums[]= {1000,900,500,400,100,90,50,40,10,9,5,4,1};
String roman[]= {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

public String intToRoman(int num) {
	StringBuilder sb = new StringBuilder();
	
	for(int i=0;i<nums.length;i++) {
		
		while(num>=nums[i]) {
			sb.append(roman[i]);
			num-=nums[i];
		}
	}
	
  return sb.toString();  
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RomanInt in = new RomanInt();
		//System.out.println(in.romanToInt("MCMXCIV"));
		System.out.println(in.intToRoman(1994));

	}

}

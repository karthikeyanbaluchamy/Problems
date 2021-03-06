package com.study.problems;

import java.util.ArrayList;
import java.util.List;

public class ZigZagString {
	
	 public String convert(String s, int numRows) {

	        if (numRows == 1) return s;

	        List<StringBuilder> rows = new ArrayList<>();
	        for (int i = 0; i < Math.min(numRows, s.length()); i++)
	            rows.add(new StringBuilder());

	        int curRow = 0;
	        boolean goingDown = false;

	        for (char c : s.toCharArray()) {
	            rows.get(curRow).append(c);
	            if (curRow == 0 || curRow == numRows - 1) 
	            goingDown = !goingDown;
	            curRow += goingDown ? 1 : -1;
	        }
	        
	        System.out.println(rows);

	        String ret=rows.parallelStream().map(e -> e.toString()).reduce("", String::concat);
	       System.out.println(ret);
	        return ret;
	    }
	 
	 public static void main(String[] args) {
		 ZigZagString zg =new ZigZagString();
		 zg.convert("PAYPALISHIRING", 3);
	 }

}

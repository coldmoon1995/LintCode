package com.lintcode;

public class Count_1_in_Binary {

    public int countOnes(int num) {
        String s=Integer.toBinaryString(num);
        int res=0;
        for(int i=0;i<s.length();i++){
        	if(s.charAt(i)=='1')
        		res++;
        }
        return res;
    }

}

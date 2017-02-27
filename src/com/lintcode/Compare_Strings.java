package com.lintcode;

public class Compare_Strings {
    public boolean compareStrings(String A, String B) {
        // write your code here
    	if(B==null)
    		return true;
    	if(A==null)
    		return false;
    	int[] nums=new int[27];
    	for(int i=0;i<A.length();i++){
    		nums[A.charAt(i)-'A']++;
    	}
    	for(int i=0;i<B.length();i++){
    		nums[B.charAt(i)-'A']--;
    		if(nums[B.charAt(i)-'A']<0)
    			return false;
    	}
    	return true;
    }
}

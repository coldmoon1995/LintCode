package com.lintcode;

public class Longest_Common_Substring {
    public int longestCommonSubstring(String A, String B) {
        if(A==null||A.length()==0||B==null||B.length()==0)
        	return 0;
        int max=0;
        for(int i=0;i<A.length();i++){
        	for(int j=0;j<B.length();j++){
        		int m=i,n=j,sum=0;
        		while(m<A.length()&&n<B.length()&&A.charAt(m)==B.charAt(n)){
        			sum++;
        			m++;n++;
        		}
        		if(sum>max)
        			max=sum;
        	}
        }
        return max;
    }
}

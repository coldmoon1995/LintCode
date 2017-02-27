package com.lintcode;

public class Single_Number {
    public int singleNumber(int[] A) {
    	if(A==null||A.length<1)
            return 0;
    	int res=A[0];
        for(int i=1;i<A.length;i++){
        	res=res^A[i];
        }
        return res;
    }
}

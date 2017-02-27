package com.lintcode;

import java.util.Arrays;

public class Three_Sum_Closest {

	public int threeSumClosest(int[] numbers, int target) {
		if(numbers==null||numbers.length<3)
			return 0;
		Arrays.sort(numbers);
        int result=numbers[0]+numbers[1]+numbers[2],sum=0;
        for(int i=0;i<numbers.length-1;i++){
        	int first=i+1,last=numbers.length-1;
        	while(first<last){
        		sum=numbers[i]+numbers[first]+numbers[last];
        		if(sum>target)
        			last--;
        		else if(sum==target)
        			return sum;
        		else
        			first++;
        		if(Math.abs(sum-target)<Math.abs(result-target))
        			result=sum; 
        	}
        }
        return result;
    }
	public static void main(String[] args) {
		int[] numbers={-2,-3,-4,-5,-100,99,1,4,4,4,5,1,0,-1,2,3,4,5};
		System.out.println(new Three_Sum_Closest().threeSumClosest(numbers, 77));
	}

}

package com.lintcode;

import java.util.HashMap;
import java.util.Map;

public class Two_Sum {
	public int[] twoSum(int[] numbers, int target) {
		int[] res=new int[2];
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int i=0;i<numbers.length;i++){
			if(map.containsKey(numbers[i])){
				res[0]=map.get(numbers[i])+1;
				res[1]=i+1;
				break;
			}
			else{
				map.put(target-numbers[i], i);
			}
		}
		return res;
    }
}

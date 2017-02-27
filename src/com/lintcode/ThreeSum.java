package com.lintcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public ArrayList<ArrayList<Integer>> threeSum(int[] numbers) {
    	Arrays.sort(numbers);
    	ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
    	System.out.println(Arrays.toString(numbers));
        for(int i=0;i<numbers.length-1;i++){
        	if(i>0&&numbers[i]==numbers[i-1])
        		continue;
        	int first=i+1,last=numbers.length-1;
        	while(first<last){
        		if(numbers[i]+numbers[first]+numbers[last]==0){
        			List<Integer> temp=new ArrayList<Integer>();
        			temp.add(numbers[i]);
        			temp.add(numbers[first]);
        			temp.add(numbers[last]);
        			res.add(new ArrayList<Integer>(temp));
        			System.out.println(temp.toString());
        			last--;
        			first++;
        			while(last>first&&numbers[last]==numbers[last+1])
        				last--;
        			while(first<last&&numbers[first]==numbers[first-1])
        				first++;
        		}
        		else if(numbers[i]+numbers[first]+numbers[last]>0){
        			last--;
        			while(last>first&&numbers[last]==numbers[last+1])
        				last--;
        		}
        		else{
        			first++;
        			while(first<last&&numbers[first]==numbers[first-1])
        				first++;
        		}
        	}
        }
        return res;
    }
	public static void main(String[] args) {
		int[] numbers={1,0,-1,-1,-1,-1,0,1,1,1};
		ArrayList<ArrayList<Integer>> res=new ThreeSum().threeSum(numbers);
		for(int i=0;i<res.size();i++){
//			System.out.println(res.get(i).toString());
		}

	}

}

package com.lintcode;

import java.util.ArrayList;
import java.util.List;

public class Combinations {

	public List<List<Integer>> combine(int n, int k) {
		List<List<Integer>> res=new ArrayList<List<Integer>>();
		int[] nums=new int[n];
		for(int i=0;i<n;i++)
			nums[i]=i+1;
		List<Integer> list=new ArrayList<Integer>();
		backtrack(res, list, nums, 0, k, n);
		return res;
		
    }
	public void backtrack(List<List<Integer>> res,List<Integer> list,int[] nums,int level,int k,int n){
		if(k==0){
			res.add(new ArrayList<Integer>(list));
			return;
		}
		if(level<n){
			list.add(nums[level]);
			backtrack(res, list, nums, level+1, k-1, n);
			list.remove(list.size()-1);
			backtrack(res, list, nums, level+1, k, n);
		}
	}
	public static void main(String[] args) {
		Combinations test=new Combinations();
		List<List<Integer>> res=test.combine(4, 2);
		for (List<Integer> list : res) {
			System.out.println(list.toString());
		}

	}

}

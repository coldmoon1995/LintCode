package com.lintcode;

import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Combination_Sum_II {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        if(candidates==null||candidates.length<1)
        	return res;
        Arrays.sort(candidates);
        List<Integer> list=new ArrayList<Integer>();
        int index=0;
        backtrack(res, list, 0, target, candidates);
        return res;
    }
    
    private void backtrack(List<List<Integer>> res,List<Integer> list,int start,int target,int[] candidates){
    	if(target==0){
    		res.add(new ArrayList<Integer>(list));
    		return;
    	}
    	else if(target<0)
    		return;
    	else{
    		for(int i=start;i<candidates.length;i++){
    			if(i>start&&candidates[i]==candidates[i-1])
    				continue;
    			list.add(candidates[i]);
    			backtrack(res, list, i+1, target-candidates[i], candidates);
    			list.remove(list.size()-1);
    		}
    	}
    }

	public static void main(String[] args) {
		Combination_Sum_II test=new Combination_Sum_II();
		int[] candidates={10,1, 1, 2, 7, 6, 1, 5};
		int target=8;
		List<List<Integer>> res=test.combinationSum2(candidates, target);
		for (List<Integer> list : res) {
			System.out.println(list.toString());
		}
	}

}

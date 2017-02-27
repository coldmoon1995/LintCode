package com.lintcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class N_Queens {
	List<List<String>> solveNQueens(int n) {
        List<List<String>> res=new ArrayList<List<String>>();
        String[] strs=new String[n];
        StringBuilder temp=new StringBuilder();
        for(int i=0;i<n;i++)
        	temp.append('.');
        for(int i=0;i<n;i++){
        	strs[i]=new String(temp.replace(i, i+1, "Q"));
        	temp.replace(i,i+1,".");
        }
        int[] taken=new int[n];
        backtrack(res, 0, n, taken, strs);
        return res;
    }
	
	public void backtrack(List<List<String>> res,int level,int n,int[] taken,String[] temp){
		if(level==n){
			ArrayList<String> list=new ArrayList<String>();
			for(int i=0;i<taken.length;i++)
				list.add(temp[taken[i]]);
			res.add(list);
			return;
		}
		for(int i=0;i<n;i++){
			boolean flag=true;
			for(int j=0;j<level;j++){
				if(taken[j]==i||j+taken[j]==level+i||j-taken[j]==level-i){
					flag=false;
					break;
				}
			}
			if(flag==true){
				taken[level]=i;
				backtrack(res,level+1,n,taken,temp);
				taken[level]=0;
			}
		}
	}
	public static void main(String[] args) {
		N_Queens nQueen=new N_Queens();
		List<List<String>> res=nQueen.solveNQueens(8);
		System.out.println(res.size());
//		for (ArrayList<String> arrayList : res) {
//			System.out.println(arrayList.toString());
//		}
	}

}

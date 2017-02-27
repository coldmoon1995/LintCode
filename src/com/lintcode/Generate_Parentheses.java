package com.lintcode;

import java.util.ArrayList;

public class Generate_Parentheses {

	public ArrayList<String> generateParenthesis(int n) {
        int left=0,right=0;
        ArrayList<String> res=new ArrayList<String>();
        String s="";
        backtrack(res, s, left, right, n);
        return res;
    }
	
	private void backtrack(ArrayList<String> res,String s,int left,int right,int n){
		if(left==n&&right==n){
			res.add(s);
			return;
		}
		if(left<n&&left==right){
			backtrack(res, s+"(", left+1, right, n);
		}
		if(left<=n&&left>right){
			backtrack(res, s+"(", left+1, right, n);
			backtrack(res, s+")", left, right+1, n);
		}
	}
	
	public static void main(String[] args) {
		Generate_Parentheses test=new Generate_Parentheses();
		ArrayList<String> res=test.generateParenthesis(3);
		System.out.println(res.toString());
	}

}

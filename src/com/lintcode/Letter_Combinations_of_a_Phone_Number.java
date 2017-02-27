package com.lintcode;

import java.util.ArrayList;

public class Letter_Combinations_of_a_Phone_Number {

	public ArrayList<String> letterCombinations(String digits) {
		
        char[][] letters={{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j','k','l'},
        		{'m','n','o'},{'p','q','r','s'},{'t','u','v'},{'w','x','y','z'}};
        int index=0;
        ArrayList<String> res=new ArrayList<String>();
        if(digits==null||digits.length()<1)
        	return res;
        String s="";
        backtrack(res, s, letters, 0, digits);
        return res;
    }
	private void backtrack(ArrayList<String> res,String s,char[][] letters,int index,String digits){
		if(index==digits.length()){
			res.add(s);
			return;
		}
		for(int i=0;i<letters[Integer.valueOf(digits.charAt(index)+"")-2].length;i++){
			backtrack(res, s+letters[Integer.valueOf(digits.charAt(index)+"")-2][i], letters, index+1, digits);
		}
	}
	public static void main(String[] args) {
		Letter_Combinations_of_a_Phone_Number test=new Letter_Combinations_of_a_Phone_Number();
		ArrayList<String> res=test.letterCombinations("");
		System.out.println(res.size());

	}

}

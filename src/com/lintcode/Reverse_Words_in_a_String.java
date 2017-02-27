package com.lintcode;

public class Reverse_Words_in_a_String {
    public String reverseWords(String s) {
    	if(s==null||s.length()<1){
    		return s;
    	}
       String[] strs=s.split(" ");
       StringBuilder sb=new StringBuilder();
       for(int i=strs.length-1;i>=0;i--){
    	   sb.append(strs[i]);
    	   if(i!=0)
    		   sb.append(" ");
       }
       return sb.toString();
    }
}

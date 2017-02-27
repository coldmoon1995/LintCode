package com.lintcode;

public class Longest_Palindromic_Substring {
    public String longestPalindrome(String s) {
        // Write your code here
        String res="";
         for(int i=0;i<s.length();i++){
             int left=i-1,right=i+1;
             while(left>=0&&right<s.length()){
                 if(s.charAt(left)==s.charAt(right)){
                     left--;right++;
                 }
                 else{
                    break;
                 }
             }
             if(right-left-1>res.length())
                res=s.substring(left+1,right);
         }
         for(int i=0;i<s.length()-1;i++){
             int left=i,right=i+1;
             while(left>=0&&right<s.length()){
                 if(s.charAt(left)==s.charAt(right)){
                     left--;right++;
                 }
                 else{
                    break;
                 }
             }
             if(right-left-1>res.length())
                res=s.substring(left+1,right);
         }
         return res;
    }
}

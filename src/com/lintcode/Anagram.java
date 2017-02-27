package com.lintcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram {

	public List<String> anagrams(String[] strs) {
        List<String> res=new ArrayList<String>();
        String[] temp=new String[strs.length];
        for(int i=0;i<strs.length;i++){
        	temp[i]=sortString(strs[i]);
        }
        for(int i=0;i<strs.length;i++){
        	for(int j=0;j<strs.length;j++){
        		if(i==j)
        			continue;
        		if(temp[i].equals(temp[j])){
        			res.add(strs[i]);
        			break;
        		}
        	}
        }
        return res;
    }
	private String sortString(String s){
		char[] c=s.toCharArray();
		Arrays.sort(c);
		return new String(c);
	}
	
	public static void main(String[] args) {
		Anagram anagram=new Anagram();
		String[] strs= {"ab", "ba", "cd", "dc", "e"};
		List<String> r=anagram.anagrams(strs);
		System.out.println(Arrays.toString(r.toArray()));
	}

}

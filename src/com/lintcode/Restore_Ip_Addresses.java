package com.lintcode;

import java.util.ArrayList;
import java.util.List;

public class Restore_Ip_Addresses {

	public ArrayList<String> restoreIpAddresses(String s) {
        ArrayList<String> res=new ArrayList<String>();
        int index=0;
        ArrayList<String> list=new ArrayList<String>();
        backtrack(res, list, index, s);
        return res;
    }
	
	private void backtrack(List<String> res,List<String> list,int index,String left){
		if(index==3){
			if(left.length()>3||(left.length()>1&&left.charAt(0)=='0')||Integer.valueOf(left)>255){
				return;
			}
			String temp="";
			for(int i=0;i<3;i++){
				temp=temp+list.get(i)+".";
			}
			temp=temp+left;
			res.add(temp);
			return;
		}
		if(left.length()>1){
			list.add(left.substring(0,1));
			backtrack(res, list, index+1, left.substring(1));
			list.remove(list.size()-1);
		}
		if(left.length()>2){
			if(left.substring(0,2).charAt(0)=='0')
				return;
			list.add(left.substring(0,2));
			backtrack(res, list, index+1,  left.substring(2));
			list.remove(list.size()-1);
		}
		if(left.length()>3){
			if(Integer.valueOf(left.substring(0,3))>255||left.substring(0, 3).charAt(0)=='0')
				return;
			list.add(left.substring(0,3));
			backtrack(res, list, index+1, left.substring(3));
			list.remove(list.size()-1);
		}
	}
	
	public static void main(String[] args) {
		Restore_Ip_Addresses test=new Restore_Ip_Addresses();
		List<String> res=test.restoreIpAddresses("25525511135");
		System.out.println(res.toString());
	}

}

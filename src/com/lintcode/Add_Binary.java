package com.lintcode;

public class Add_Binary {

	public String addBinary(String a, String b) {
        StringBuilder sb=new StringBuilder();
        StringBuilder a1=new StringBuilder(a);
        StringBuilder b1=new StringBuilder(b);
        a1.reverse();b1.reverse();
        if(a1.length()>b1.length()){
        	while(a1.length()!=b1.length())
        		b1.append('0');
        }
        if(a1.length()<b1.length()){
        	while(a1.length()!=b1.length())
        		a1.append('0');
		}
        int flag=0;
        for(int i=0;i<a1.length();i++){
        	int temp=Integer.parseInt(a1.charAt(i)+"")+Integer.parseInt(b1.charAt(i)+"")+flag;
        	if(temp<2){
        		flag=0;
        		sb.append(temp);
        	}
        	else{
        		flag=1;
        		sb.append(temp-2);
        	}
        }
        if(flag==1)
        	sb.append(flag);
        return sb.reverse().toString();
    }
	public static void main(String[] args) {
		String a="1111",b="10";
		System.out.println(new Add_Binary().addBinary(a, b));
	}

}

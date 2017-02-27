package com.lintcode;

public class Space_Replacement {
    public int replaceBlank(char[] string, int length) {
        for (char c : string) {
			if(c==' ')
				length+=2;
		}
        return length;
    }
}

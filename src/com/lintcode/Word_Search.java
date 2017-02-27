package com.lintcode;

public class Word_Search {

	public boolean exist(char[][] board, String word) {
		if(board==null||board.length<1)
			return false;
		boolean res=false;
		boolean[][] flag=new boolean[board.length][board[0].length];
		for(int row=0;row<board.length;row++){
			for(int col=0;col<board[0].length;col++){
				if(word.charAt(0)==board[row][col])
					res=res||isExist(board,flag, word, 0, row, col);
				if(res==true)
					return true;
			}
		}
		return false;
    }
	public boolean isExist(char[][] board,boolean[][] flag,String word,int index,int x,int y){
		if(index==word.length()-1){
			if(board[x][y]==word.charAt(index)&&flag[x][y]!=true)
				return true;
			else
				return false;
		}
		if(board[x][y]!=word.charAt(index)||flag[x][y]==true)
			return false;
		flag[x][y]=true;
		boolean s=false;
		if(x>0&&flag[x-1][y]!=true)
			s=s||isExist(board, flag, word, index+1, x-1, y);
		if(x<board.length-1&&flag[x+1][y]!=true)
			s=s||isExist(board, flag, word, index+1, x+1, y);
		if(y>0&&flag[x][y-1]!=true)
			s=s||isExist(board, flag, word, index+1, x, y-1);
		if(y<board[0].length-1&&flag[x][y+1]!=true)
			s=s||isExist(board, flag, word, index+1, x, y+1);
		flag[x][y]=false;
		return s;
	}
	public static void main(String[] args) {
		Word_Search test=new Word_Search();
		char[][] board={{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
		System.out.println(test.exist(board, "ABCB"));
	}

}

package com.lintcode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graph_Valid_Tree {

	public boolean validTree(int n, int[][] edges) {
        int[] levels=new int[n];
        int[] root=new int[n];
        int start=0;
        for(int i=0;i<edges.length;i++)
        	root[edges[i][1]]=1;
        int flag=0;
        for(int i=0;i<n;i++)
        	if(root[i]==0){
        		start=i;
        		flag++;
        	}
        if(flag!=1)
        	return false;
        Queue<Integer> queue=new LinkedList<Integer>();
        queue.offer(start);
        levels[start]=1;
        while(!queue.isEmpty()){
        	start=queue.poll();
        	for(int i=0;i<edges.length;i++){
        		if(start==edges[i][0]){
        			if(levels[edges[i][1]]!=0)
        				return false;
        			levels[edges[i][1]]=levels[start]+1;
        			queue.offer(edges[i][1]);
        		}	
        	}
        }
        return true;
    }
	public static void main(String[] args) {
		Graph_Valid_Tree test=new Graph_Valid_Tree();
		int[][] edges={{0,1},{1,2},{3,2},{4,3},{4,5},{5,6},{6,7}};
		int n=8;
		System.out.println(test.validTree(n, edges));
	}

}

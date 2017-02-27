package com.lintcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Route_Between_Two_Nodes_in_Graph {
	
	
	class DirectedGraphNode {
		int label;
		ArrayList<DirectedGraphNode> neighbors;

		DirectedGraphNode(int x) {
			label = x;
			neighbors = new ArrayList<DirectedGraphNode>();
		}
	};
	Set<DirectedGraphNode> set=new HashSet<DirectedGraphNode>();
	public boolean hasRoute(ArrayList<DirectedGraphNode> graph,
			DirectedGraphNode s, DirectedGraphNode t) {
		
		return hasRouteSet(graph, s, t, set);
	}
	
	private boolean hasRouteSet(ArrayList<DirectedGraphNode> graph,
			DirectedGraphNode s, DirectedGraphNode t,Set<DirectedGraphNode> set){
		set.add(s);
		if(s==t)
			return true;
		boolean res=false;
		boolean flag=false;
		for(int i=0;i<s.neighbors.size();i++){
			if(!set.contains(s.neighbors.get(i))){
				flag=true;
				res=res||hasRoute(graph, s.neighbors.get(i), t);
			}
		}
		if(flag)
			return false;
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

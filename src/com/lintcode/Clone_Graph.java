package com.lintcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Clone_Graph {

	class UndirectedGraphNode {
		int label;
		ArrayList<UndirectedGraphNode> neighbors;

		UndirectedGraphNode(int x) {
			label = x;
			neighbors = new ArrayList<UndirectedGraphNode>();
		}
	};

	public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
		Queue<UndirectedGraphNode> queue=new LinkedList<UndirectedGraphNode>();
		UndirectedGraphNode cloneNode=new UndirectedGraphNode(node.label);
		queue.offer(node);
		Set<UndirectedGraphNode> nodeSet=new HashSet<UndirectedGraphNode>();
		Set<UndirectedGraphNode> newNodeSet=new HashSet<UndirectedGraphNode>();
		nodeSet.add(node);
		newNodeSet.add(node);
		while(!queue.isEmpty()){
			UndirectedGraphNode temp=queue.poll();
			for(int i=0;i<temp.neighbors.size();i++){
				if(!newNodeSet.contains(temp.neighbors.get(i))){
					UndirectedGraphNode newNode=new UndirectedGraphNode(temp.neighbors.get(i).label);
					newNodeSet.add(temp.neighbors.get(i));
				}
				
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

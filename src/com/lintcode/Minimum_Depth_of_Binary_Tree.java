package com.lintcode;

public class Minimum_Depth_of_Binary_Tree {
	class TreeNode {
		public int val;
		public TreeNode left, right;

		public TreeNode(int val) {
			this.val = val;
			this.left = this.right = null;
		}
	}

	public int minDepth(TreeNode root) {
		if(root==null)
			return 0;
		else if(root.left==null&&root.right==null)
			return 1;
		else if(root.left==null&&root.right!=null)
			return minDepth(root.right)+1;
		else if(root.left!=null&&root.right==null)
			return minDepth(root.left)+1;
		else
			return Math.min(minDepth(root.left), minDepth(root.right))+1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

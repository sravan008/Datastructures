package org.ksk.ds.tree;

public class TreeNode {

	private int data;
	private TreeNode left;
	private TreeNode right;

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public TreeNode getLeft() {
		return left;
	}

	public void setLeft(TreeNode left) {
		this.left = left;
	}

	public TreeNode getRight() {
		return right;
	}

	public void setRight(TreeNode right) {
		this.right = right;
	}

	public TreeNode(int data) {
		this.data = data;
		this.right = null;
		this.left = null;
	}

	@Override
	public String toString() {
		return "TreeNode [data=" + data + ", left=" + left + ", right=" + right + "]";
	}
	
	
	
}
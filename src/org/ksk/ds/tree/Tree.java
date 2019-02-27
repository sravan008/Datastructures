package org.ksk.ds.tree;

public interface Tree {

	public TreeNode insert(int data);

	public void traverse();

	public TreeNode lookUp(int data);

	public TreeNode remove(TreeNode node, int data);

}

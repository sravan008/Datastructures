package org.ksk.ds.tree;

public class BinaryTree implements Tree {

	TreeNode root;

	public BinaryTree() {
		this.root = null;
	}

	@Override
	public BinaryTree insert(int data) {

		TreeNode newNode = new TreeNode(data);
		if (root == null) {
			root = newNode;
		} else {
			TreeNode currentNode = root;
			while (true) {
				if (data < currentNode.getData()) {
					if (currentNode.getLeft() == null) {
						currentNode.setLeft(newNode);
						return this;
					}
					currentNode = currentNode.getLeft();
				} else {
					if (data > currentNode.getData()) {
						if (currentNode.getRight() == null) {
							currentNode.setRight(newNode);
							return this;
						}
						currentNode = currentNode.getRight();
					}

				}
			}
		}
		return null;
	}

	@Override
	public void delete(int searchElement) {
		// TODO Auto-generated method stub

	}

	@Override
	public void traverse() {
		// TODO Auto-generated method stub

	}

}

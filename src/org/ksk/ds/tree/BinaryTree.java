package org.ksk.ds.tree;

public class BinaryTree implements Tree {

	TreeNode root;

	public BinaryTree() {
		this.root = null;
	}

	@Override
	public TreeNode insert(int data) {

		TreeNode newNode = new TreeNode(data);
		if (root == null) {
			root = newNode;
		} else {
			TreeNode currentNode = root;
			while (true) {
				if (data < currentNode.getData()) {
					if (currentNode.getLeft() == null) {
						currentNode.setLeft(newNode);
						return currentNode;
					}
					currentNode = currentNode.getLeft();
				} else {
					if (data > currentNode.getData()) {
						if (currentNode.getRight() == null) {
							currentNode.setRight(newNode);
							return currentNode;
						}
						currentNode = currentNode.getRight();
					}

				}
			}
		}
		return null;
	}

	@Override
	public TreeNode lookUp(int data) {

		TreeNode newNode = root;
		if (root.getData() == data) {
			return root;
		} else {
			while (newNode != null) {
				if (data <= newNode.getData()) {
					if (data == newNode.getLeft().getData()) {
						System.out.println("Item found");
						return newNode;
					}
					newNode = newNode.getLeft();
				} else if (data >= newNode.getData()) {
					if (data == newNode.getRight().getData()) {
						System.out.println("Item found");
						return newNode;
					}
					newNode = newNode.getRight();
				} else {
					newNode = null;
				}
			}

		}
		System.out.println("No matching data found");
		return new TreeNode(0);

	}

	@Override
	public TreeNode remove(TreeNode node, int data) {

		if (root == null) {
			return root;
		}

		if (root.getData() < data) {
			root.setLeft(remove(root.getLeft(), data));
		} else if (root.getData() > data) {
			root.setRight((remove(root.getRight(), data)));
		} else {
			if (root.getLeft() == null) {
				return root.getRight();
			} else if (root.getRight() == null) {
				return root.getLeft();
			}
			root.setData(this.findMinValue(root.getRight()));
			root.setRight(this.remove(root.getRight(), root.getData()));
		}
		return root;

	}

	public int findMinValue(TreeNode treeNode) {
		TreeNode minNode = treeNode;
		int minVal = treeNode.getData();
		while (minNode.getLeft() != null) {
			minVal = minNode.getData();
			minNode = minNode.getLeft();
		}
		return minVal;

	}

	@Override
	public void traverse() {
		inOrder(root);
	}

	public void inOrder(TreeNode node) {
		if (node != null) {
			this.inOrder(node.getLeft());
			System.out.println(node.getData());
			this.inOrder(node.getRight());
		}
	}
}

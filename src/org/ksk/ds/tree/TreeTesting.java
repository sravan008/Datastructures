package org.ksk.ds.tree;

public class TreeTesting {

	public static void main(String[] args) {

		BinaryTree btree = new BinaryTree();
		btree.insert(9);
		btree.insert(4);
		btree.insert(6);
		btree.insert(20);
		btree.insert(170);
		btree.insert(15);
		btree.insert(1);

		/*
		 * System.out.println(btree.lookUp(4)); System.out.println(btree.lookUp(6));
		 * System.out.println(btree.lookUp(20)); System.out.println(btree.lookUp(170));
		 * System.out.println(btree.lookUp(15)); System.out.println(btree.lookUp(1));
		 */

		btree.traverse();

	}

}

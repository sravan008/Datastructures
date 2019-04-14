package org.ksk.linkedlist;

/**
 * Created by sravan on 11/24/2017.
 */

public class Node {

	private int data;
	private Node next;
	private Node previous;

	public Node getPrevious() {
		return previous;
	}

	public void setPrevious(Node previous) {
		this.previous = previous;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node link) {
		this.next = link;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + ", previous=" + previous + "]";
	}

}

package org.ksk.linkedlist;

public class LinkedListOps {

	// The same below logic used for detecting the loop in the given Linked-List
	public static int getMiddle(Node head) {
		Node slow = head;
		Node fast = head;
		while (fast != null && fast.getNext() != null) {
			slow = slow.getNext();
			fast = fast.getNext().getNext();
		}
		// System.out.println(slow.data);
		return slow.getData();
	}

	public static Node reverseLinkedList(Node head) {
		Node previous = null;
		Node current = head;
		Node temp = null;
		while (current != null) {
			temp = current.getNext();
			current.setNext(previous);
			previous = current;
			current = temp;
		}
		return previous;
	}

	public static Node rotateLinkedList(Node head, Node lastNode, int n) {
		Node previous = null;
		Node current = head;
		Node temp = null;
		Node last = lastNode;
		while (n > 0) {
			temp = current.getNext();
			current.setNext(previous);
			last.setNext(current);
			last = current;
			current = temp;
			n--;
		}
		return current;
	}

	// Detect loop in a linked list --> 	// https://www.geeksforgeeks.org/detect-loop-in-a-linked-list/
	//Intersection point of two Linked Lists --> YOu can use the same above ans or using hashing you can resolve this --> https://www.geeksforgeeks.org/write-a-function-to-get-the-intersection-point-of-two-linked-lists/
	//nth-node-from-the-end-of-a-linked-list  --> https://www.geeksforgeeks.org/nth-node-from-the-end-of-a-linked-list/
	

}
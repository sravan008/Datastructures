package org.ksk.linkedlist;

/**
 * Created by sravan on 11/24/2017.
 */
public class LinkedListService {

	public static void main(String[] args) {

		/*
		 * LinkedListService ll = new LinkedListService();
		 * 
		 * Node nodeA = new Node(); nodeA.setData(11); Node nodeB = new Node();
		 * nodeB.setData(22); Node nodeC = new Node(); nodeC.setData(33);
		 * 
		 * nodeA.setNext(nodeB); nodeB.setNext(nodeC); nodeC.setNext(null);
		 * ll.getListLengh(nodeA);
		 * 
		 * LinkedList lls = new LinkedList<>();
		 * 
		 * }
		 * 
		 * private void getListLengh(Node node) {
		 * 
		 * int ctr = 0; if (node == null) { System.out.println("List is empty"); } else
		 * {
		 * 
		 * while (node.getNext() != null) { ctr++; node = node.getNext(); }
		 * System.out.println("List Length" + ctr); }
		 */

		// Singly Linked List example

		/*
		 * SinglyLinkedList linkedList = new SinglyLinkedList();
		 * linkedList.insertAtBegining(11); linkedList.insertAtBegining(22);
		 * linkedList.insertAtBegining(33); linkedList.insertAtBegining(44);
		 * linkedList.insertAtBegining(55); //linkedList.displayList();
		 * linkedList.deleteNodeAtBegining(); //linkedList.displayList();
		 * linkedList.insertAtLastNode(101); linkedList.insertAtLastNode(202);
		 * //linkedList.displayList(); linkedList.insertAfterList(33, 35);
		 * linkedList.displayList(); linkedList.deleteNodeAtLast();
		 * linkedList.displayList();
		 */

		// Circular linkedlist

		/*
		 * CircularLinkedList circularLinkedList = new CircularLinkedList();
		 * circularLinkedList.insertAtFirst(11); circularLinkedList.insertAtFirst(22);
		 * circularLinkedList.insertAtFirst(33); circularLinkedList.insertAtFirst(44);
		 * circularLinkedList.insertAtEnd(55); circularLinkedList.displayList();
		 * System.out.println(circularLinkedList.getLength());
		 */

		DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
		doublyLinkedList.insertAtFirst(11);
		doublyLinkedList.insertAtFirst(22);
		doublyLinkedList.insertAtFirst(33);
		doublyLinkedList.insertAtFirst(44);
		// doublyLinkedList.displayList();
		doublyLinkedList.insertAtEnd(55);
		doublyLinkedList.insertAtEnd(66);
		// doublyLinkedList.displayList();
		doublyLinkedList.deleteFirst();
		// doublyLinkedList.displayList();
		doublyLinkedList.deleteLast();
		// doublyLinkedList.displayList();
		doublyLinkedList.insertAfterElement(22, 25);
		doublyLinkedList.insertAfterElement(25, 27);
		doublyLinkedList.insertAfterElement(55, 57);
		doublyLinkedList.displayList();

	}

}

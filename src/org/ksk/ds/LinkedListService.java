package org.ksk.ds;

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
		
		
		SinglyLinkedList linkedList = new SinglyLinkedList();
		linkedList.insertAtBegining(11);
		linkedList.insertAtBegining(22);
		linkedList.insertAtBegining(33);
		linkedList.insertAtBegining(44);
		linkedList.insertAtBegining(55);
		//linkedList.displayList();
		linkedList.deleteNodeAtBegining();
		//linkedList.displayList();
		linkedList.insertAtLastNode(101);
		linkedList.insertAtLastNode(202);
		//linkedList.displayList();
		linkedList.insertAfterList(33, 35);
		linkedList.displayList();
		linkedList.deleteNodeAtLast();
		linkedList.displayList();
		

				
		
		
		
	}

}

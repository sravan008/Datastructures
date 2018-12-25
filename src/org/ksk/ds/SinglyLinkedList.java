package org.ksk.ds;

/**
 * Created by sravan on 11/24/2017.
 */
public class SinglyLinkedList {

	private Node first;

	public SinglyLinkedList() {
		// TODO Auto-generated constructor stub
	}

	public boolean isEmpty() {
		return (first == null);
	}

	public int getLength(Node listNode) {
		int ctr = 0;
		if (listNode == null)
			return 0;
		else {
			while (listNode.getNext() != null) {
				ctr++;
				listNode = listNode.getNext();
			}
		}
		return ctr;
	}

	/**
	 * @param data
	 */
	public void insertAtBegining(int data) {
		Node newNode = new Node();
		newNode.setData(data);
		newNode.setNext(first);
		first = newNode;
	}

	public Node deleteNodeAtBegining() {
		Node delNOde = first;
		first = first.getNext();
		return delNOde;
	}

	public void insertAtLastNode(int data) {
		Node currentNode = first;
		while (currentNode.getNext() != null) {
			currentNode = currentNode.getNext();
		}
		Node newNode = new Node();
		newNode.setData(data);
		currentNode.setNext(newNode);

	}

	/**
	 * @param headNode
	 * @param nodeToInsert
	 * @param poistion
	 * @return
	 */
	public Node insertNode(Node headNode, Node nodeToInsert, int poistion) {

		if (headNode == null)
			return headNode;
		int size = getLength(headNode);
		if (poistion > size + 1 || poistion < 1) {
			System.out.println("Please enter the correct combination");
			return headNode;
		}
		if (poistion == 1) {
			nodeToInsert.setNext(headNode);
			return nodeToInsert;
		} else {
			Node previousNode = headNode;
			int count = 1;
			while (count < poistion - 1) {
				previousNode = previousNode.getNext();
				count++;
			}
			Node currentNode = previousNode.getNext();
			nodeToInsert.setNext(currentNode);
			previousNode.setNext(nodeToInsert);
		}
		return headNode;
	}

	/**
	 * -- Alt+ Enter to generate comments
	 *
	 * @param headNode
	 * @param nodeToInsert
	 * @param poistion
	 * @return
	 */
	public Node deletetNode(Node headNode, Node nodeToInsert, int poistion) {

		if (headNode == null)
			return headNode;
		int size = getLength(headNode);
		if (poistion > size + 1 || poistion < 1) {
			System.out.println("Please enter the correct combination");
			return headNode;
		}
		if (poistion == 1) {
			Node currentNode = headNode.getNext();
			headNode = null;
			return currentNode;
		} else {
			Node previousNode = headNode;
			int count = 1;
			while (count < poistion - 1) {
				previousNode = previousNode.getNext();
				count++;
			}
			Node currentNode = previousNode.getNext();
			previousNode.setNext(currentNode.getNext());
			currentNode = null;

		}
		return headNode;
	}

	public void displayList() {
		Node current = first;
		while (current != null) {
			System.out.println(current.getData());
			current = current.getNext();

		}

	}

	public Node deleteNodeAtLast() {
		Node lastNode = first;
		while (lastNode.getNext().getNext() != null) {
			lastNode = lastNode.getNext();
		}
		lastNode.setNext(null);
		return lastNode;
	}

	public void insertAfterList(int searchNumber, int data) {

		Node newNode = first;
		while (newNode.getData() != searchNumber) {
			newNode = newNode.getNext();
		}
		Node tempNode = new Node();
		tempNode.setData(data);
		tempNode.setNext(newNode.getNext());
		newNode.setNext(tempNode);
	}

}

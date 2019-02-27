package org.ksk.linkedlist;

public class DoublyLinkedList implements ListInterface {

	Node first;
	Node last;

	@Override
	public int getLength() {



		Node current = first;
		int ctr = 0;
		while (current != null) {
			ctr++;
			current = current.getNext();
		}
		return ctr;
	}

	@Override
	public void insertAtFirst(int data) {

		Node newNode = new Node();
		newNode.setData(data);
		if (isEmpty()) {
			last = newNode;
		} else {
			first.setPrevious(newNode);
		}
		newNode.setNext(first);
		first = newNode;
	}

	@Override
	public void insertAtEnd(int data) {

		Node newNode = new Node();
		newNode.setData(data);
		if (isEmpty()) {
			first = newNode;
		} else {
			last.setNext(newNode);
			newNode.setPrevious(last);
		}
		last = newNode;
	}

	@Override
	public int deleteFirst() {
		int temp = first.getNext().getData();
		if (first.getNext() == null) {
			last = null;
		} else {
			first = first.getNext();
		}
		return temp;
	}

	@Override
	public void displayList() {
		Node current = first;
		while (current != null) {
			System.out.println(current.getData());
			current = current.getNext();
		}
	}

	@Override
	public boolean isEmpty() {
		return first == null;
	}

	@Override
	public int deleteLast() {
		if (first.getNext() == null) {
			first = null;
		} else {
			last.getPrevious().setNext(null);
		}
		last = last.getPrevious();
		return 0;
	}

	@Override
	public void insertAfterElement(int searchElement, int data) {

		Node newNode = new Node();
		newNode.setData(data);
		Node currentNode = first;

		while (currentNode.getData() != searchElement) {
			currentNode = currentNode.getNext();
		}
		newNode.setNext(currentNode.getNext());
		currentNode.setNext(newNode);
		
	}

}

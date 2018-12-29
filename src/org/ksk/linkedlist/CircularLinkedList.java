package org.ksk.linkedlist;

public class CircularLinkedList implements ListInterface {

	Node first;
	Node last;

	@Override
	public int getLength() {

		Node current = first;
		int ctr = 1;
		while (current.getNext() != last) {
			current = current.getNext();
			ctr++;
		}

		return ctr;
	}

	public boolean isEmpty() {

		return first == null;
	}

	@Override
	public void insertAtFirst(int data) {

		Node newNOde = new Node();
		newNOde.setData(data);
		if (isEmpty()) {
			last = newNOde;
		}
		newNOde.setNext(first);
		first = newNOde;
	}

	@Override
	public void insertAtEnd(int data) {

		Node newNode = new Node();
		newNode.setData(data);
		if (isEmpty()) {
			first = newNode;
		}
		last.setNext(newNode);
		last = newNode;
	}

	@Override
	public int deleteFirst() {
		int temp = first.getData();
		if (first.getNext() == null) {
			last = null;
		}
		first = first.getNext();
		return temp;
	}

	public void displayList() {
		Node current = first;
		while (current != null) {
			System.out.println(current.getData());
			current = current.getNext();

		}

	}

	@Override
	public int deleteLast() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void insertAfterElement(int SearchElement, int data) {
		// TODO Auto-generated method stub

	}

}

package org.ksk.linkedlist;

public interface ListInterface {

	public int getLength();

	public void insertAtFirst(int data);

	public void insertAtEnd(int data);

	public int deleteFirst();

	public int deleteLast();

	public void displayList();

	public boolean isEmpty();

	public void insertAfterElement(int SearchElement, int data);
	
}

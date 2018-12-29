package org.ksk.ds.stacknq;

public class Stack {

	private int maxSize;
	private int top;
	private long[] stackArray;

	public Stack(int size) {

		this.maxSize = size;
		this.top = -1;
		this.stackArray = new long[size];
	}

	public void pop() {

		if (isEmpty()) {
			System.out.println("Stack is empty, push something to test pop functionality");
		} else {
			int oldval = top;
			System.out.println(oldval);
			top--;
		}

	}

	public void push(int data) {

		if (isFull()) {
			System.out.println("Stack is full, please pop and do push");
		} else {

			top++;
			stackArray[top] = data;
		}
	}

	public void peek() {
		System.out.println(stackArray[top]);
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return (maxSize - 1 == top);
	}
}

package org.ksk.ds;

/**
 * Created by sravan on 11/24/2017.
 */

public class Node {

    private int data;
    private Node next;

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
}
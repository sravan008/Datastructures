package org.ksk.linkedlist;

/**
 * Created by sravan on 11/25/2017.
 */
public class DListNode {

    private DListNode previousLink;
    private DListNode nextLink;
    private int data;

    public DListNode getPreviousLink() {
        return previousLink;
    }

    public void setPreviousLink(DListNode previousLink) {
        this.previousLink = previousLink;
    }

    public DListNode getNextLink() {
        return nextLink;
    }

    public void setNextLink(DListNode nextLink) {
        this.nextLink = nextLink;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}

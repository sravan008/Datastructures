package org.ksk.ds;

/**
 * Created by sravan on 11/25/2017.
 */
public class DListNode {

    private DListNode previousLink;
    private DListNode currentLink;
    private int data;

    public DListNode getPreviousLink() {
        return previousLink;
    }

    public void setPreviousLink(DListNode previousLink) {
        this.previousLink = previousLink;
    }

    public DListNode getCurrentLink() {
        return currentLink;
    }

    public void setCurrentLink(DListNode currentLink) {
        this.currentLink = currentLink;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}

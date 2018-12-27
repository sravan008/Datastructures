package org.ksk.linkedlist;

/**
 * Created by sravan on 11/27/2017.
 */
public class DoubleLinkedList {


    public int getLength(DListNode listNode) {
        int ctr = 0;
        if (listNode == null) return 0;
        else {
            while (listNode.getNextLink() != null) {
                listNode = listNode.getNextLink();
            }
        }
        return ctr;
    }

    public DListNode insertNode(DListNode headNode, DListNode nodeToinsert, int poistion) {

        if (headNode == null) return headNode;
        int size = getLength(headNode);
        if (poistion > size + 1 || poistion < 1) {
            System.out.println("Please enter the correct combination");
            return headNode;
        }
        if (poistion == 1) {
            nodeToinsert.setNextLink(headNode);
            headNode.setPreviousLink(nodeToinsert);
            return nodeToinsert;
        } else {

            int count = 1;
            DListNode previousNode = headNode;
            while (count < poistion - 1) {
                previousNode = previousNode.getNextLink();
            }
            DListNode currentNode = headNode.getNextLink();
            nodeToinsert.setNextLink(currentNode);
            if (currentNode != null) currentNode.setPreviousLink(nodeToinsert);
            previousNode.setNextLink(nodeToinsert);
            nodeToinsert.setPreviousLink(previousNode);
        }
        return headNode;

    }
}
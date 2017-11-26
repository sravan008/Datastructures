package org.ksk.ds;

import java.util.List;

/**
 * Created by sravan on 11/24/2017.
 */
public class SingleLinkedList {

    public int getLength(ListNode listNode) {
        int ctr = 0;
        if (listNode == null) return 0;
        else {
            while (listNode.getNext() != null) {
                listNode = listNode.getNext();
            }
        }
        return ctr;
    }

    /**
     * @param headNode
     * @param nodeToInsert
     * @param poistion
     * @return
     */
    public ListNode insertNode(ListNode headNode, ListNode nodeToInsert, int poistion) {

        if (headNode == null) return headNode;
        int size = getLength(headNode);
        if (poistion > size + 1 || poistion < 1) {
            System.out.println("Please enter the correct combination");
            return headNode;
        }
        if (poistion == 1) {
            nodeToInsert.setNext(headNode);
            return nodeToInsert;
        } else {
            ListNode previousNode = headNode;
            int count = 1;
            while (count < poistion - 1) {
                previousNode = previousNode.getNext();
                count++;
            }
            ListNode currentNode = previousNode.getNext();
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
    public ListNode deletetNode(ListNode headNode, ListNode nodeToInsert, int poistion) {

        if (headNode == null) return headNode;
        int size = getLength(headNode);
        if (poistion > size + 1 || poistion < 1) {
            System.out.println("Please enter the correct combination");
            return headNode;
        }
        if (poistion == 1) {
            ListNode currentNode = headNode.getNext();
            headNode = null;
            return currentNode;
        } else {
            ListNode previousNode = headNode;
            int count = 1;
            while (count < poistion - 1) {
                previousNode = previousNode.getNext();
                count++;
            }
            ListNode currentNode = previousNode.getNext();
            previousNode.setNext(currentNode.getNext());
            currentNode = null;

        }
        return headNode;
    }

}

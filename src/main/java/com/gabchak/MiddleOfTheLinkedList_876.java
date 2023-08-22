package com.gabchak;

public class MiddleOfTheLinkedList_876 {

    public ListNode middleNode(ListNode head) {
        ListNode middleNode = head;
        ListNode theLastNode = head;
        while (theLastNode != null && theLastNode.next != null) {
            middleNode = middleNode.next;
            theLastNode = theLastNode.next.next;
        }
        return middleNode;
    }

    private static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}

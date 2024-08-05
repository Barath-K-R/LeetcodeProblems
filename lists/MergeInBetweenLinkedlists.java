package lists;

import java.util.List;

import intervals.mergeIntervals;

public class MergeInBetweenLinkedlists {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode end = null, temp = list2;
        while (temp.next != null) {
            if (temp.next.next == null) {
                end = temp.next;
            }
            temp = temp.next;
        }
        temp = list1;
        for (int i = 1; i <= b; ++i) {
            if (i == a) {
                ListNode temp2 = temp.next;
                temp.next = list2;
                temp = temp2;
                continue;
            }
            temp = temp.next;
            if (i == b)
                end.next = temp.next;
        }
        if (a == b) {
            end.next = temp.next;
        }
        return list1;
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(0);
        list1.next = new ListNode(1);
        list1.next.next = new ListNode(2);
        list1.next.next.next = new ListNode(3);
        list1.next.next.next.next = new ListNode(4);
        list1.next.next.next.next.next = new ListNode(5);
        list1.next.next.next.next.next.next = new ListNode(6);

        ListNode list2 = new ListNode(100);
        list2.next = new ListNode(101);
        list2.next.next = new ListNode(102);
        list2.next.next.next = new ListNode(103);
        list2.next.next.next.next = new ListNode(104);

        ListNode res = mergeInBetween(list1, 2, 5, list2);
        while (res != null) {
            System.out.println(res.val);
            res = res.next;
        }

    }
}

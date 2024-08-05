package lists;

import java.util.List;

public class RemoveNodesFromLinkedList {
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
    public static ListNode removeNodes(ListNode head) {
        ListNode start=reverse(head);
        while(start.next!=null){
            if(start.val>start.next.val){
                start.next=start.next.next;
                continue;
            }
            start=start.next;
        }
        System.out.println(start.val);
        return start;
    }
    public static ListNode reverse(ListNode head){
        ListNode prev=null,curr=head,temp=null;
        while(curr!=null){
            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
    public static void main(String[] args) {
        ListNode list1 = new ListNode(5);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(13);
        list1.next.next.next = new ListNode(3);
        list1.next.next.next.next = new ListNode(8);
        ListNode res=removeNodes(list1);
        

    }
}

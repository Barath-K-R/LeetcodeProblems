package lists;

public class SwappingNodes {

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
    public static ListNode swapNodes(ListNode head, int k) {
        ListNode left=head,curr=head,temp=null;
        for(int i=1;i<k;++i)
        curr=curr.next;

        temp=curr;
        while(curr.next!=null){
            curr=curr.next;
            left=left.next;
        }
        int t=left.val;
        left.val=temp.val;
        temp.val=t;
        
        return head;


    }
    public static void main(String[] args) {
        ListNode list1 = new ListNode(5);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(13);
        list1.next.next.next = new ListNode(3);
        list1.next.next.next.next = new ListNode(8);
        
        ListNode res=swapNodes(list1, 2);
        
    }
}

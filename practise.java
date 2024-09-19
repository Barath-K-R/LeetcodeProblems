import java.util.Arrays;

public class practise {

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    }
 
    public static ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode p=head.next,prev=null;
        while(head!=null && head.next!=null){
            ListNode temp=head.next.next;
            head.next.next=head; 
            if(prev!=null){
                prev.next=head.next;
            }
            head.next=temp;
            prev=head;

            //updating head 
            head=head.next;
        }
        return p;
    }
    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        head.next.next.next.next=new ListNode(5);
        head.next.next.next.next.next=new ListNode(6);
        ListNode res=swapPairs(head);
        while(res!=null){
            System.out.println(res.val);
            if(res!=null)
            res=res.next;
        }
    }
}

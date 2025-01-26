package lists;

public class CopyListWithRandomPointers {
    static class Node {
        int val;
        Node next;
        Node random;
    
        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public static Node copyRandomList(Node head) {
        
    }
    public static void main(String[] args) {
        Node head=new Node(3);
        head.next=new Node(7);
        head.next.next=new Node(4);
        head.next.next.next=new Node(5);
        head.next.random=head.next.next.next;
        head.next.next.random=head;
        head.next.next.next.random=head.next;
        System.out.println(copyRandomList(head));
    }
}

package lists;

import java.util.HashMap;
import java.util.Map;

public class CopyListWithRandomPointer {

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
        if (head == null)
            return null;
        Node p1 = head;
        Node resHead = new Node(p1.val);
        Node p2 = resHead;
        Map<Node, Node> map = new HashMap<>();
        map.put(head, resHead);
        while (p1.next != null) {
            p2.next = new Node(p1.next.val);
            map.put(p1.next, p2.next);
            p1 = p1.next;
            p2 = p2.next;
        }

        p1 = head;
        p2 = resHead;
        while (p1 != null) {
            if (p1.random != null)
                p2.random = map.get(p1.random);
            p1 = p1.next;
            p2 = p2.next;
        }
        return resHead;
    }

    public static void main(String[] args) {
        Node head = new Node(3);
        head.next = new Node(4);
        head.next.next = new Node(7);
        head.next.next.next = new Node(8);

        head.random = head.next;
        head.next.random = head.next.next.next;
        head.next.next.random = head;
        head.next.next.next.random = head.next.next;

        Node resHead = copyRandomList(head);
        while (resHead != null) {
            System.out.println(resHead.val + " " + resHead.random.val);
            resHead = resHead.next;
        }
    }
}


//using hashmap for mapping original node with copy node

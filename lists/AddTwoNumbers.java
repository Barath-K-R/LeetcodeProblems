package lists;

public class AddTwoNumbers {

    public class ListNode {
             int val;
             ListNode next;
             ListNode() {}
             ListNode(int val) { this.val = val; }
             ListNode(int val, ListNode next) { this.val = val; this.next = next; }
         }
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            int q = 0;
            int r = 0;
            int sum = 0;
            ListNode head = null;
            ListNode temp = null;
            while (l1 != null || l2 != null || q>0) {
                sum =
                    q +
                    (
                        ((l1 != null) ? l1.val : 0) +
                        ((l2 != null) ? l2.val : 0)
                    );
                r = sum % 10;
                q = sum / 10;
                ListNode newNode = new ListNode(r);
                if (head == null) {
                    head = newNode;
                } else {
                    temp = head;
                    while (temp.next != null) {
                        temp = temp.next;
                    }
                    temp.next = newNode;
                    newNode.next = null;
                }
                if (l1 != null) {
                    l1 = l1.next;
                }
                if (l2 != null) {
                    l2 = l2.next;
                }
            }
            return head;
        }
    }


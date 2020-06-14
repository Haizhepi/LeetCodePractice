package linkedlist;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p = l1, q = l2, dummy = new ListNode(0);
        ListNode curr = dummy;
        int carry = 0;
        while (p != null || q != null) {
            int x = p == null ? 0 : p.val;
            int y = q == null ? 0 : q.val;
            int sum = x + y + carry;
            curr.next = new ListNode(sum % 10);
            carry = sum / 10;
            if (p != null) {
                p = p.next;
            }
            if (q != null) {
                q = q.next;
            }
            curr = curr.next;
        }
        if (carry > 0) {
            curr.next = new ListNode((carry));
        }
        return dummy.next;
    }
}

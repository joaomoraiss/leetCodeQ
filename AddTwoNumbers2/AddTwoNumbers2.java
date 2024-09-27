package AddTwoNumbers2;

public class AddTwoNumbers2 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(4,l1);
        ListNode l3 = new ListNode(2,l2);

        addTwoNumbers(l1,l3);
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int l1Val = l1.val;
        ListNode l1next = l1.next;
        int l1Val3 = l1next.val;

        return new ListNode();
    }
}

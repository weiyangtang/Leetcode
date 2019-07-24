package LinkedList;

/**
 * @Auther: tangweiyang
 * @Date: 2019/7/7 22:33
 * @Description:
 */
public class MergeTwoLists {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(-1), first = head;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                head.next = new ListNode(l1.val);
                head = head.next;
                l1 = l1.next;
            } else {
                head.next = new ListNode(l2.val);
                head = head.next;
                l2 = l2.next;
            }

        }
        head.next = l1 != null ? l1 : l2;
        return first.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(2);
        l2.next.next = new ListNode(3);
        ListNode node = mergeTwoLists(l1, l2);
    }
}
package LinkedList;

/**
 * @Auther: tangweiyang
 * @Date: 2019/7/11 20:11
 * @Description:
 */
public class LinkedListAdd {
    public static void main(String[] args) {
        ListNode head = new ListNode(-1), temp, first = head;
        for (int i = 0; i < 10; i++) {
            head.next = new ListNode(i);
            head=head.next;
        }
    }
}
package LinkedList;

/**
 * @Auther: tangweiyang
 * @Date: 2019/7/7 21:26
 * @Description: 删除倒数第n个节点
 */
public class RemoveNthFromEnd {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        final ListNode node = removeNthFromEnd(head, 4);
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode node = head;
        int len = 0;
        while (node != null) {
            len++;
            node = node.next;
        }
        /*只有一个节点*/
        if (len == 1) return null;
        else if (n == len) {
            /*删除头结点*/
            head = head.next;
            return head;
        }
        node = head;
        for (int i = 0; i < len - n - 1; i++) {
            node = node.next;
        }
        ListNode p = node;
        node.next = p.next.next;
        return head;
    }
}

/**
 * 节点
 */
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}


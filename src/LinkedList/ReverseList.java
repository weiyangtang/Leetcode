package LinkedList;

/**
 * @Auther: tangweiyang
 * @Date: 2019/7/11 21:02
 * @Description:链表转置
 */
public class ReverseList {
    /***
     * 迭代方法
     * @param head
     * @return
     */
    public static ListNode reverseList(ListNode head) {
        if (head == null)
            return null;
        ListNode last = head;
        while (last.next != null) {
            last = last.next;
        }
        while (head != last) {
            ListNode temp = new ListNode(head.val);
            temp.next = last.next;
            last.next = temp;
            head = head.next;
        }
        return last;
    }

    /**
     * 递归方式
     *
     * @param head
     * @return
     */
    public static ListNode reverseList_rec(ListNode head) {
        if (head == null||head.next==null)
            return head;
        //找到最后一个节点
        ListNode last = head, s = head;
        while (last.next != null) {
            s = last;
            last = last.next;
        }
        ListNode first = new ListNode(last.val);
        s.next = null;
        first.next = reverseList_rec(head);
        return first;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(-1), first = head;
        for (int i = 0; i < 10; i++) {
            head.next = new ListNode(i);
            head = head.next;
        }
//        ListNode node = reverseList(first);
        ListNode node = reverseList_rec(first);
    }
}
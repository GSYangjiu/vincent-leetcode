import model.ListNode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author Vincent
 * @date 2022/2/8 6:26 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 删除链表的倒数第 N 个结点
 * URL: https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/
 * Description：
 */
public class Problem19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        Deque<ListNode> stack = new ArrayDeque<>();
        ListNode cur = dummy;
        while (cur != null) {
            stack.push(cur);
            cur = cur.next;
        }
        for (int i = 0; i < n; ++i) {
            stack.pop();
        }
        ListNode prev = stack.peek();
        prev.next = prev.next.next;
        return dummy.next;
    }

    //双指针 总长度m 移除倒数第n个
    public ListNode removeNthFromEndEx(ListNode head, int n) {
        ListNode dummyHead = new ListNode(0, head);
        ListNode pre = dummyHead, cur = dummyHead;
        //r=n l=0
        while (n-- > 0) {
            cur = cur.next;
        }
        //l和r向右移动m-n个 r=m l=m-n
        while (cur.next != null) {
            cur = cur.next;
            pre = pre.next;
        }
        pre.next = pre.next.next;
        return dummyHead.next;
    }

    public static void main(String[] args) {
        Problem19 problem19 = new Problem19();
        ListNode listNode4 = new ListNode(4);
        ListNode listNode3 = new ListNode(3, listNode4);
        ListNode listNode2 = new ListNode(2, listNode3);
        ListNode listNode1 = new ListNode(1, listNode2);
        System.out.println(problem19.removeNthFromEndEx(listNode1, 2));
    }
}

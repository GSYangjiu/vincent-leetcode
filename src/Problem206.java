import model.ListNode;

/**
 * @author Vincent
 * @date 2022/2/16 7:06 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 反转链表
 * URL: https://leetcode-cn.com/problems/reverse-linked-list
 * Description：
 */
public class Problem206 {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}

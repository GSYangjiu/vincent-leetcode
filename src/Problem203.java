import model.ListNode;

/**
 * @author Vincent
 * @date 2022/3/3 11:15 上午
 * Email: vincent1094259423@yahoo.com
 * Title: 移除链表元素
 * URL: https://leetcode-cn.com/problems/remove-linked-list-elements/
 * Description：
 */
public class Problem203 {
    static class Solution {
        public ListNode removeElements(ListNode head, int val) {
            ListNode dummy = new ListNode(0, head);
            ListNode temp = dummy;
            while (temp.next != null) {
                if (temp.next.val == val) {
                    temp.next = temp.next.next;
                } else {
                    temp = temp.next;
                }
            }
            return dummy.next;
        }
    }
}

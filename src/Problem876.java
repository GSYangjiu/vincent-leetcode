import model.ListNode;

/**
 * @author Vincent
 * @date 2022/3/7 6:15 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 链表的中间节点
 * URL: https://leetcode-cn.com/problems/middle-of-the-linked-list/
 * Description：快慢指针
 */
public class Problem876 {
    class Solution {
        public ListNode middleNode(ListNode head) {
            ListNode slow = head, fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }
    }
}

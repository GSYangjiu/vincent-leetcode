import model.ListNode;

/**
 * @author Vincent
 * @date 2022/3/29 10:49 上午
 * Email: vincent1094259423@yahoo.com
 * Title: 旋转链表
 * URL: https://leetcode-cn.com/problems/rotate-list/
 * Description：
 */
public class Problem61 {
    class Solution {
        public ListNode rotateRight(ListNode head, int k) {
            if (head == null || k == 0) {
                return head;
            }
            ListNode cur = head;
            int size = 1;
            while (cur.next != null) {
                size++;
                cur = cur.next;
            }

            int add = size - k % size;
            if (add == size) {
                return head;
            }
            cur.next = head;

            for (int i = 0; i < add; i++) {
                cur = cur.next;
            }
            ListNode res = cur.next;
            cur.next = null;
            return res;
        }
    }
}

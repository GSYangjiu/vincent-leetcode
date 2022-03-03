import model.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Vincent
 * @date 2022/3/3 11:03 上午
 * Email: vincent1094259423@yahoo.com
 * Title: 环形链表
 * URL: https://leetcode-cn.com/problems/linked-list-cycle/
 * Description：
 */
public class Problem141 {
    public class Solution {
        public boolean hasCycle(ListNode head) {
            Set<ListNode> set = new HashSet<>();
            while (head != null) {
                if (!set.add(head)) {
                    return true;
                }
                head = head.next;
            }
            return false;
        }
    }

    /*Floyd 判圈算法（又称龟兔赛跑算法）
     * 我们定义两个指针，一快一满。慢指针每次只移动一步，而快指针每次移动两步。
     * 初始时，慢指针在位置 head，而快指针在位置 head.next。
     * 如果在移动的过程中，快指针反过来追上慢指针，就说明该链表为环形链表。
     */
    public class Solution1 {
        public boolean hasCycle(ListNode head) {
            if (head == null || head.next == null) {
                return false;
            }
            ListNode slow = head;
            ListNode fast = head.next;
            while (slow != fast) {
                if (fast == null || fast.next == null) {
                    return false;
                }
                slow = slow.next;
                fast = fast.next.next;
            }
            return true;
        }
    }
}

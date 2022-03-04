import model.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Vincent
 * @date 2022/3/4 11:29 上午
 * Email: vincent1094259423@yahoo.com
 * Title: 删除排序链表中的重复元素
 * URL: https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list/
 * Description：
 */
public class Problem83 {
    class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            Set<Integer> set = new HashSet<>();
            ListNode dummy = new ListNode(0, head);
            ListNode cur = dummy;
            while (cur.next != null) {
                if (!set.add(cur.next.val)) {
                    cur.next = cur.next.next;
                } else {
                    cur = cur.next;
                }
            }
            return dummy.next;
        }
    }
}

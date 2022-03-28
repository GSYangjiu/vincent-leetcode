import model.ListNode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Vincent
 * @date 2022/3/28 4:11 下午
 * Email: vincent1094259423@yahoo.com
 * Title:  删除排序链表中的重复元素II
 * URL: https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list-ii/
 * Description：
 */
public class Problem82 {
    class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            Map<Integer, Integer> map = new HashMap<>();
            ListNode temp = head;
            while (temp != null) {
                map.put(temp.val, map.getOrDefault(temp.val, 0) + 1);
                temp = temp.next;
            }
            ListNode dummy = new ListNode(0, head);
            ListNode prev = dummy;
            while (head != null) {
                if (map.get(head.val) > 1) {
                    prev.next = head.next;
                } else {
                    prev = head;
                }
                head = head.next;
            }
            return dummy.next;
        }
    }
}

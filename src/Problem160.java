import model.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Vincent
 * @date 2022/3/20 9:27 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 相交链表
 * URL: https://leetcode-cn.com/problems/intersection-of-two-linked-lists/submissions/
 * Description：
 */
public class Problem160 {
    public class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            Set<ListNode> visited = new HashSet<>();
            ListNode temp = headA;
            while (temp != null) {
                visited.add(temp);
                temp = temp.next;
            }
            temp = headB;
            while (temp != null) {
                if (visited.contains(temp)) {
                    return temp;
                }
                temp = temp.next;
            }
            return null;
        }
    }
}

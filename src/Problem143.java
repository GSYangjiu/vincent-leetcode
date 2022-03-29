import model.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Vincent
 * @date 2022/3/28 5:10 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 重排链表
 * URL: https://leetcode-cn.com/problems/reorder-list/
 * Description：
 */
public class Problem143 {
    class Solution {
        public void reorderList(ListNode head) {
            if (head == null) {
                return;
            }
            List<ListNode> list = new ArrayList<ListNode>();
            ListNode node = head;
            while (node != null) {
                list.add(node);
                node = node.next;
            }
            int i = 0, j = list.size() - 1;
            while (i < j) {
                list.get(i).next = list.get(j);
                i++;
                if (i == j) {
                    break;
                }
                list.get(j).next = list.get(i);
                j--;
            }
            list.get(i).next = null;
        }
    }
}

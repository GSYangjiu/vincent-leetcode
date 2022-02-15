import model.ListNode;

/**
 * @author Vincent
 * @date 2022/2/15 4:25 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 合并K个升序链表
 * URL: https://leetcode-cn.com/problems/merge-k-sorted-lists/
 * Description：
 */
public class Problem23 {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode res = null;
        for (ListNode list : lists) {
            res = mergeTwoLists(res, list);
        }
        return res;
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }
}

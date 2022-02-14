import model.ListNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Vincent
 * @date 2022/2/13 1:29 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 合并两个有序链表
 * URL: https://leetcode-cn.com/problems/merge-two-sorted-lists/
 * Description：
 */
public class Problem21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        List<Integer> list = new ArrayList<>();
        while (list1 != null) {
            list.add(list1.val);
            list1 = list1.next;
        }
        while (list2 != null) {
            list.add(list2.val);
            list2 = list2.next;
        }
        if (list.size() == 0) {
            return null;
        }
        Collections.sort(list);
        ListNode listNode = new ListNode(list.get(list.size() - 1));
        for (int i = list.size() - 2; i >= 0; i--) {
            listNode = new ListNode(list.get(i), listNode);
        }
        return listNode;
    }

    public ListNode mergeTwoListsEx1(ListNode l1, ListNode l2) {
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

    public ListNode mergeTwoListsEx2(ListNode l1, ListNode l2) {
        ListNode prehead = new ListNode(-1);

        ListNode prev = prehead;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                prev.next = l1;
                l1 = l1.next;
            } else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }

        // 合并后 l1 和 l2 最多只有一个还未被合并完，我们直接将链表末尾指向未合并完的链表即可
        prev.next = l1 == null ? l2 : l1;
        return prehead.next;
    }
}

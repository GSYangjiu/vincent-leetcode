import model.ListNode;

/**
 * @author Vincent
 * @date 2022/2/16 6:50 下午
 * Email: vincent1094259423@yahoo.com
 * Title: K个一组翻转链表
 * URL: https://leetcode-cn.com/problems/reverse-nodes-in-k-group/
 * Description：每次分成k个链表进行翻转，注意首尾处理
 */
public class Problem25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode pre = dummy;
        ListNode end = dummy;

        while (end.next != null) {
            //pre和end取k个节点
            for (int i = 0; i < k && end != null; i++) {
                end = end.next;
            }
            //不足k个 结尾不翻转
            if (end == null) break;

            //设置头结点
            ListNode start = pre.next;
            //暂存下一组k个节点的头结点
            ListNode next = end.next;
            //断掉链表进行单次翻转
            end.next = null;
            //翻转
            pre.next = reverse(start);
            //连接下一组节点
            start.next = next;
            //重新定位pre和end
            pre = start;
            end = pre;
        }
        return dummy.next;
    }

    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}

import model.ListNode;

/**
 * @author Vincent
 * @date 2022/2/15 4:52 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 两两交换链表中的节点
 * URL: https://leetcode-cn.com/problems/swap-nodes-in-pairs/
 * Description：
 */
public class Problem24 {
    /**
     * 可以通过递归的方式实现两两交换链表中的节点。
     * 递归的终止条件是链表中没有节点，或者链表中只有一个节点，此时无法进行交换。
     * 如果链表中至少有两个节点，则在两两交换链表中的节点之后，原始链表的头节点变成新的链表的第二个节点，原始链表的第二个节点变成新的链表的头节点。链表中的其余节点的两两交换可以递归地实现。
     * 在对链表中的其余节点递归地两两交换之后，更新节点之间的指针关系，即可完成整个链表的两两交换。
     * 用 head 表示原始链表的头节点，新的链表的第二个节点，用 newHead 表示新的链表的头节点，原始链表的第二个节点，
     * 则原始链表中的其余节点的头节点是 newHead.next。令 head.next = swapPairs(newHead.next)，表示将其余节点进行两两交换，交换后的新的头节点为 head 的下一个节点。
     * 然后令 newHead.next = head，即完成了所有节点的交换。最后返回新的链表的头节点 newHead。
     */
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = head.next;
        head.next = swapPairs(newHead.next);
        newHead.next = head;
        return newHead;
    }
}

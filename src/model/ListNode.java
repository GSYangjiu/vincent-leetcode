package model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Vincent
 * @date 2022/1/29 12:04 上午
 * Email: vincent1094259423@yahoo.com
 * Description：
 */
public class ListNode {

    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        List<Integer> list = new ArrayList<>();
        ListNode node = this;
        while (node != null) {
            list.add(node.val);
            node = node.next;
        }
        return list.toString();
    }
}

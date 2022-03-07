import model.ListNode;

import java.util.Stack;

/**
 * @author Vincent
 * @date 2022/3/7 8:28 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 二进制链表转整数
 * URL: https://leetcode-cn.com/problems/convert-binary-number-in-a-linked-list-to-integer/
 * Description：
 */
public class Problem1290 {
    static class Solution {
        public int getDecimalValue(ListNode head) {
            int res = 0, digit = 1;
            Stack<Integer> stack = new Stack<>();
            while (head != null) {
                stack.push(head.val);
                head = head.next;
            }
            while (!stack.isEmpty()) {
                res += digit * stack.pop();
                digit = digit * 2;
            }
            return res;
        }
    }

    class Solution1 {
        public int getDecimalValue(ListNode head) {
            ListNode curNode = head;
            int ans = 0;
            while (curNode != null) {
                ans = ans * 2 + curNode.val;
                curNode = curNode.next;
            }
            return ans;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.getDecimalValue(ListNode.stringToListNode("[1, 0, 0, 1, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0]")));
    }
}

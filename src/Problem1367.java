import model.ListNode;
import model.TreeNode;

/**
 * @author Vincent
 * @date 2022/3/29 3:41 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 二叉树中的列表
 * URL: https://leetcode-cn.com/problems/linked-list-in-binary-tree/
 * Description：
 */
public class Problem1367 {
    class Solution {
        public boolean isSubPath(ListNode head, TreeNode root) {
            if (root == null) return false;
            return dsf(head, root) || isSubPath(head, root.left) || isSubPath(head, root.right);
        }

        private boolean dsf(ListNode head, TreeNode root) {
            if (head == null) {
                return true;
            }
            if (root == null) {
                return false;
            }
            if (root.val != head.val) {
                return false;
            }
            return dsf(head.next, root.left) || dsf(head.next, root.right);
        }
    }
}

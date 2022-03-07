import model.TreeNode;

/**
 * @author Vincent
 * @date 2022/3/7 5:26 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 对称二叉树
 * URL: https://leetcode-cn.com/problems/symmetric-tree/
 * Description：
 */
public class Problem101 {
    class Solution {
        public boolean isSymmetric(TreeNode root) {
            return check(root, root);
        }

        public boolean check(TreeNode p, TreeNode q) {
            if (p == null && q == null) {
                return true;
            }
            if (p == null || q == null) {
                return false;
            }
            return p.val == q.val && check(p.left, q.right) && check(p.right, q.left);
        }
    }
}

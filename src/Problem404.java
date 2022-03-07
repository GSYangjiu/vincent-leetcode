import model.TreeNode;

/**
 * @author Vincent
 * @date 2022/3/7 6:26 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 左叶子之和
 * URL: https://leetcode-cn.com/problems/sum-of-left-leaves/
 * Description：
 */
public class Problem404 {
    class Solution {
        public int sumOfLeftLeaves(TreeNode root) {
            return getSum(root, false);
        }

        private int getSum(TreeNode node, boolean isLeft) {
            if (node == null) {
                return 0;
            }
            if (node.right == null && node.left == null) {
                if (isLeft) {
                    return node.val;
                } else {
                    return 0;
                }
            } else {
                return getSum(node.left, true) + getSum(node.right, false);
            }
        }
    }
}

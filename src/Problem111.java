import model.TreeNode;

/**
 * @author Vincent
 * @date 2022/3/25 10:30 上午
 * Email: vincent1094259423@yahoo.com
 * Title: 二叉树的最小深度
 * URL: https://leetcode-cn.com/problems/minimum-depth-of-binary-tree/
 * Description：
 */
public class Problem111 {
    class Solution {
        public int minDepth(TreeNode root) {
            if (root == null) return 0;
            if (root.left == null && root.right == null) {
                return 1;
            } else if (root.left == null) {
                return minDepth(root.right) + 1;
            } else if (root.right == null) {
                return minDepth(root.left) + 1;
            } else {
                return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
            }
        }
    }
}

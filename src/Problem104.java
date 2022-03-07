import model.TreeNode;

/**
 * @author Vincent
 * @date 2022/3/7 3:50 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 二叉树的最大深度
 * URL: https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/
 * Description：
 */
public class Problem104 {
    class Solution {
        public int maxDepth(TreeNode root) {
            if (root == null) {
                return 0;
            } else {
                int leftHeight = maxDepth(root.left);
                int rightHeight = maxDepth(root.right);
                return Math.max(leftHeight, rightHeight) + 1;
            }
        }
    }
}

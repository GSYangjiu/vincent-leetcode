import model.TreeNode;

/**
 * @author Vincent
 * @date 2022/3/11 9:27 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 平衡二叉树
 * URL: https://leetcode-cn.com/problems/balanced-binary-tree/
 * Description：
 */
public class Problem110 {
    class Solution {
        public boolean isBalanced(TreeNode root) {
            if (root == null) return true;
            if (Math.abs(getMaxDeep(root.left, 0) - getMaxDeep(root.right, 0)) > 1) {
                return false;
            }
            return isBalanced(root.left) && isBalanced(root.right);
        }

        private int getMaxDeep(TreeNode root, int num) {
            if (root == null) {
                return num;
            }
            num += 1;
            return Math.max(getMaxDeep(root.left, num), getMaxDeep(root.right, num));
        }
    }

    //优化后
    class Solution1 {
        public boolean isBalanced(TreeNode root) {
            if (root == null) {
                return true;
            } else {
                return Math.abs(height(root.left) - height(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right);
            }
        }

        public int height(TreeNode root) {
            if (root == null) {
                return 0;
            } else {
                return Math.max(height(root.left), height(root.right)) + 1;
            }
        }
    }
}

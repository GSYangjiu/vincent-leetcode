import model.TreeNode;

/**
 * @author Vincent
 * @date 2022/5/24 6:37 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 单值二叉树
 * URL: https://leetcode.cn/problems/univalued-binary-tree/
 * Description：
 */
public class Problem965 {
    class Solution {
        public boolean isUnivalTree(TreeNode root) {
            if (root == null) {
                return true;
            }
            if (root.left != null && root.val != root.left.val) {
                return false;
            }
            if (root.right != null && root.val != root.right.val) {
                return false;
            }
            return isUnivalTree(root.right) & isUnivalTree(root.left);
        }
    }
}

import model.TreeNode;

/**
 * @author Vincent
 * @date 2022/3/9 2:06 下午
 * Email: vincent1094259423@yahoo.com
 * Title:  二叉搜索树中的插入操作
 * URL: https://leetcode-cn.com/problems/insert-into-a-binary-search-tree/
 * Description：
 */
public class Problem701 {
    class Solution {
        public TreeNode insertIntoBST(TreeNode root, int val) {
            if (root == null) {
                return new TreeNode(val);
            }
            TreeNode dummy = new TreeNode(0, root, null);
            TreeNode prev = new TreeNode();
            while (root != null) {
                prev = root;
                if (root.val > val) {
                    root = root.left;
                } else {
                    root = root.right;
                }
            }
            if (prev.val > val) {
                prev.left = new TreeNode(val);
            } else {
                prev.right = new TreeNode(val);
            }
            return dummy.left;
        }
    }
}

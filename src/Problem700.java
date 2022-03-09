import model.TreeNode;

/**
 * @author Vincent
 * @date 2022/3/9 9:37 上午
 * Email: vincent1094259423@yahoo.com
 * Title: 二叉搜索树中的搜索
 * URL: https://leetcode-cn.com/problems/search-in-a-binary-search-tree/
 * Description：
 */
public class Problem700 {
    class Solution {
        public TreeNode searchBST(TreeNode root, int val) {
            while (root != null) {
                if (root.val == val) {
                    return root;
                } else if (root.val > val) {
                    root = root.left;
                } else {
                    root = root.right;
                }
            }
            return null;
        }
    }
}

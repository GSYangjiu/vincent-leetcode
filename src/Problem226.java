import model.TreeNode;

import java.util.TreeMap;

/**
 * @author Vincent
 * @date 2022/3/8 1:58 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 翻转二叉树
 * URL: https://leetcode-cn.com/problems/invert-binary-tree/
 * Description：
 */
public class Problem226 {
    class Solution {
        public TreeNode invertTree(TreeNode root) {
            if (root != null) {
                TreeNode tmp = root.left;
                root.left = root.right;
                root.right = tmp;
                invertTree(root.left);
                invertTree(root.right);
            }
            return root;
        }
    }
}

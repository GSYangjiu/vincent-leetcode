import model.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Vincent
 * @date 2022/3/7 12:47 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 二叉树的中序遍历
 * URL: https://leetcode-cn.com/problems/binary-tree-inorder-traversal/
 * Description：
 */
public class Problem94 {
    class Solution {
        public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> res = new ArrayList<>();
            invoke(root, res);
            return res;
        }

        private void invoke(TreeNode root, List<Integer> res) {
            if (root == null) {
                return;
            }
            if (root.left != null) {
                invoke(root.left, res);
            }
            res.add(root.val);
            if (root.right != null) {
                invoke(root.right, res);
            }
        }
    }
}

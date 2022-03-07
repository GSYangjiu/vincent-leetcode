import model.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Vincent
 * @date 2022/3/7 12:29 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 二叉树的前序遍历
 * URL: https://leetcode-cn.com/problems/binary-tree-preorder-traversal/
 * Description：
 */
public class Problem144 {
    class Solution {
        public List<Integer> preorderTraversal(TreeNode root) {
            List<Integer> res = new ArrayList<>();
            invoke(root, res);
            return res;
        }

        private void invoke(TreeNode root, List<Integer> res) {
            if (root == null) {
                return;
            }
            res.add(root.val);
            if (root.left != null) {
                invoke(root.left, res);
            }
            if (root.right != null) {
                invoke(root.right, res);
            }
        }
    }
}

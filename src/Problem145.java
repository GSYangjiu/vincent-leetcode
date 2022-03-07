import model.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Vincent
 * @date 2022/3/7 12:51 下午
 * Email: vincent1094259423@yahoo.com
 * Title: 二叉树的后序遍历
 * URL: https://leetcode-cn.com/problems/binary-tree-postorder-traversal/
 * Description：
 */
public class Problem145 {
    class Solution {
        public List<Integer> postorderTraversal(TreeNode root) {
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
            if (root.right != null) {
                invoke(root.right, res);
            }
            res.add(root.val);
        }
    }
}
